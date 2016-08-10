CREATE TYPE t_adres AS OBJECT (
street VARCHAR2(15)
, city VARCHAR2(15)
, state CHAR(3)
, zip VARCHAR(5));
/

CREATE TYPE t_person AS OBJECT(
id INTEGER
, first_name VARCHAR2(10)
, last_name  VARCHAR2(10)
, dob DATE
, phone VARCHAR2(12)
, adress t_adres);
/
-- Typ t_product zawiera deklaracje metody, dlatego potrzebna jest jeszcze definicja
CREATE TYPE t_product AS OBJECT(
id INTEGER
, name VARCHAR2(15)
, descriptions VARCHAR2(22)
, price NUMBER(5,2)
, days_valid INTEGER

, MEMBER FUNCTION get_sell_by_date RETURN DATE);
/

CREATE TYPE BODY t_product AS 
MEMBER FUNCTION get_sell_by_date RETURN DATE IS

    v_sel_by_date DATE;

BEGIN

    SELECT days_valid + SYSDATE
    INTO v_sel_by_date
    FROM DUAL;

    RETURN v_sel_by_date;
    END;
END;
/

CREATE PUBLIC SYNONYM t_pub_product FOR t_product
/
-- OBIEKTY KOLUMNOWE
CREATE TABLE product(
product t_product
, quantity_in_stock INTEGER);
/

INSERT INTO product
(product
, quantity_in_stock)
VALUES
(t_product(1, 'makaron', '1 kg paczaka makaronu', 3.95, 10),
50)
/

INSERT INTO product
(product
, quantity_in_stock)
VALUES
(t_product(2, 'ry¿', '1 kg paczaka ry¿u', 2, 10),
50)
/

select p.product from  product p where p.product.id = 1
/

select p.product.id, p.product.name, p.product.price, p.product.days_valid, p.quantity_in_stock
FROM product p
where p.product.id = 1
/

select p.product.get_sell_by_date()
from product p
/

-- tabele obiektowe
create table object_porduct of t_product
/
-- insertowac mozna za pomoca kostruktora oraz normalnie
insert into object_porduct
values(t_product(1,'makaron', '1 kg paczka makaronu', 3.95, 10));
/

insert into object_porduct
values
(2,'ry¿', '1 kg paczka ry¿u', 3, 50)
/
select * from object_porduct
/
select value(op) from object_porduct op
/
select value(op).id, value(op).name, value(op).price, value(op).days_valid from object_porduct op
/
--identyfikator obiektu
select REF(oc) from object_porduct oc
where oc.id = 1
/
create table purchases(
id integer PRIMARY key
, products_ref ref t_product scope is object_porduct);
/
insert into purchases
values
(1, (select ref(op) from object_porduct op where op.id = 1))

/

select id, deref(products_ref) from purchases
/
select id, deref(products_ref) from purchases
/

-- dziedziczenie

create type t_persons as object(
id INTEGER
, first_name VARCHAR2(10)
, last_name  VARCHAR2(10)
, dob DATE
, phone VARCHAR2(12)
, adress t_adres

, member function display_details return varchar2) NOT FINAL;

/

Create type body t_persons as
member function display_details return varchar2 is


begin

return 'id = ' || id || ', name = ' || first_name || ' ' || last_name;
end;

end;

/
create type t_bussiness_person under t_persons(
title varchar2(20)
, company varchar2(20));

/
-- bedzie mozna wpisywac tylko obiekty t_personsi zadne inne
create table object_persons of t_persons
not substitutable at all levels

/

-- funkcja is of() sprawdza czy dany obiekt jest danego typu. Normanie zwraca typy podrzedne i nadrzedne np Is of(t_persons)

--Is of( ONLY t_persons) mozna wstawiac tylko t_persons. Typy podrzedne nie wejda

-- sys_typeid zwraca identyfikator obiektu

-- not instantable zapobiega tworzeniu obiektow danego typu

--konstruktory definiowane przez uzytkownika  (w konstruktorach bez specyfikacji)
CREATE TYPE  t_person2 AS OBJECT(
ID INTEGER,
first_name VARCHAR2(10),
last_name VARCHAR2(10),
dob DATE ,
phone VARCHAR2(12) ,

CONSTRUCTOR FUNCTION t_person2(
p_id INTEGER,
p_first_name VARCHAR2,
p_last_name VARCHAR2) RETURN SELF AS RESULT ,

CONSTRUCTOR FUNCTION t_person2(
p_id INTEGER,
p_first_name VARCHAR2,
p_last_name VARCHAR2,
p_dob DATE ) RETURN SELF AS RESULT);
/

CREATE or replace TYPE BODY t_person2 AS 

    CONSTRUCTOR FUNCTION t_person2(
    p_id INTEGER,
    p_first_name VARCHAR2,
    p_last_name VARCHAR2 ) RETURN SELF AS RESULT IS
    BEGIN
            SELF.id :=p_id;
            SELF.first_name := p_first_name;
            SELF.last_name := p_last_name;
            SELF.dob := sysdate;
            SELF. phone := '555-1212';
        RETURN;
    END;

    CONSTRUCTOR FUNCTION t_person2(
    p_id INTEGER,
    p_first_name VARCHAR2,
    p_last_name VARCHAR2,
    p_dob DATE) RETURN SELF AS RESULT is
    BEGIN

            SELF.id := p_id;
            SELF.first_name := p_first_name;
            SELF.last_name := p_last_name;
            SELF.dob := p_dob;
            SELF. phone := '555-1212';
        RETURN;
    END;
END;
/

-- 'OVERRIDING' w metodzie typu pochodnego pozwala na nadpisanie metody z ztypu podstawowego
-- (SELF AS typ_podstawowy).metoda  --- wyswietlenie metody podstawowej



