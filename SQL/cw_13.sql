-- Koleckje
CREATE TYPE t_varray_adress AS VARRAY(3) OF VARCHAR(50)  -- tworzenie kolekcji typu varray
/
ALTER TYPE t_varray_adress MODIFY LIMIT 10 CASCADE  -- zmodyfikowanie rozmiaru kolekcji do 10, opcja cascade suzy do zmiany we wszystkich obiektach tego typu w bazie
/
CREATE TYPE t_nested_table_address AS TABLE OF t_adres -- tworzenie tabeli zagniezdzonej, moze przechowywac ona dowlona liczbe obiektow
/
CREATE TABLE customers_with_varray(
id INTEGER PRIMARY KEY
, first_name VARCHAR2(10)
, last_name VARCHAR2(10)
, adress t_varray_adress);
/

CREATE TABLE customers_with_nested_table(
id INTEGER PRIMARY KEY
, first_name VARCHAR2(10)
, last_name VARCHAR2(10)
, adress t_nested_table_address)
nested table
adress
store as
nested_adress;
/
select * from  user_varrays  -- informacje o kolekcjach
/
select * from user_nested_tables  -- informacje o tabelach zagniezdzonych
/
-- insertt do tabeli z varray
INSERT INTO customers_with_varray 
VALUES
(1, 'Stefan', 'Brzowy', 
t_varray_adress(
'S 2, Fa, MAZ, 1',
'G 4, sw, gd, 6'));
/
INSERT INTO customers_with_varray 
VALUES
(2, 'Karol', 'Keska', 
t_varray_adress(
'S 2, Fa, MAZ, 1',
'G 4, sw, gd, 6',
'G 4, sw, gd, 6'));
/
select * from customers_with_varray
/
-- wstawianie danych do tabeli z kolumna nested table
INSERT INTO customers_with_nested_table
VALUES 
(1, 'Stefan', 'Brzowy',
t_nested_table_address(
        t_adres('S 2', 'Fa', 'MAZ', '1')
        ,t_adres('S 2', 'Fa', 'MAZ', '1')));
        
/

INSERT INTO customers_with_nested_table
VALUES 
(3, 'Stefan', 'Kij',
t_nested_table_address(
        t_adres('S 2', 'Fa', 'MAZ', '1')
        ,t_adres('S 2', 'Fa', 'MAZ', '1')
        ,t_adres('S 2', 'Fa', 'MAZ', '1')));       
/
-- uzycie funkcji TABLE() do rozdzielenia kolekcji jako wierszy

SELECT a.* FROM  customers_with_varray c, table(c.adress) a
/

SELECT * FROM TABLE(SELECT adress from customers_with_varray where id = 1)
/
--uzycie funkcji TABLE() do rozdzielenia tabeli zagniezdzonej jako wierszy
select * from customers_with_nested_table c, table(c.adress)a --where id = 1
/
--update tabeli w ktorej zawarta jest kolekcja, elementy musza byc modyfikowane w calosci 
update customers_with_varray
set
adress = t_varray_adress('S 12, Za, fit, 2', 'S 2, Fa, MAZ, 1') where id = 2
/
--update tabeli w ktorej zawarta jest tabela zagniezdzona, elementy moga byc modyfikowane pojedynczo

update table(select adress from customers_with_nested_table WHERE id = 3) addr
set value(addr) = t_adres('S 2', 'he', 'WAW', '2')
WHERE
value(addr) = t_adres('S 2', 'Fa', 'MAZ', '1')
/

CREATE TYPE t_adress2 as object(
street varchar2(15)
, city varchar2(15)
, state char(3)
, zip varchar(5)

, MAP MEMBER FUNCTION get_string RETURN VARCHAR2);
/

CREATE TYPE BODY t_adress2 AS
MAP MEMBER FUNCTION get_string RETURN VARCHAR2 IS

    BEGIN
        RETURN zip || ' ' || state || ' ' || city || ' ' || street;
    END;
END;
/
CREATE TYPE t_nested_table_address2 AS TABLE OF t_adress2 
/
CREATE TABLE customers_with_nested_table2(
id INTEGER PRIMARY KEY
, first_name VARCHAR2(10)
, last_name VARCHAR2(10)
, adress t_nested_table_address2)
nested table
adress
store as
nested_adress1;
/

INSERT INTO customers_with_nested_table2
VALUES 
(1, 'Stefan', 'Brzowy',
t_nested_table_address2(
        t_adress2('S 2', 'Fa', 'MAZ', '1')
        ,t_adress2('S 2', 'Fa', 'MAZ', '2')));

/-- automatycznie wywoywana jest metoda get_string
select cn.id, cn.first_name, cn.last_name from customers_with_nested_table2 cn
where cn.adress = 
t_nested_table_address2(
        t_adress2('S 2', 'Fa', 'MAZ', '1')
        ,t_adress2('S 2', 'Fa', 'MAZ', '2')
);
/
--Submultiset suzy do sprawdzenia czy jedna tabela zagniezdzona nie ma takicha samych elementow co druga
select cn.id, cn.first_name, cn.last_name from customers_with_nested_table2 cn
where 
t_nested_table_address2(
        t_adress2('S 2', 'Fa', 'MAZ', '1'))
SUBMULTISET OF cn.adress;

/
-- uzycie cast() do konwersji varray na nested_table
select cast(cv.adress as t_nested_table_address ) from customers_with_varray cv where cv.id =1
/

