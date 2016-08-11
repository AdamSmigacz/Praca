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
(2, 'Stefan', 'Brzowy',
t_nested_table_address(
        t_adres('S 2', 'Fa', 'MAZ', '1')
        ,t_adres('S 2', 'Fa', 'MAZ', '1')
        ,t_adres('S 2', 'Fa', 'MAZ', '1')));        
        
