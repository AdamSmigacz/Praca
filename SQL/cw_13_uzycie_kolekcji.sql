CREATE OR REPLACE PACKAGE varray_package AS

    TYPE t_ref_cursor IS REF CURSOR;
    FUNCTION get_customer RETURN t_ref_cursor;
    PROCEDURE insert_customer(
    p_id IN customers_with_varray.id%TYPE
    , p_first_name IN customers_with_varray.first_name%TYPE
    , p_last_name IN customers_with_varray.last_name%TYPE
    , p_adress IN customers_with_varray.adress%TYPE
    );
END varray_package; 
/

CREATE OR REPLACE PACKAGE BODY varray_package AS

    FUNCTION get_customer RETURN t_ref_cursor IS
        v_customers_ref_cursor t_ref_cursor ;

    BEGIN
        OPEN v_customers_ref_cursor FOR 
        SELECT * FROM customers_with_varray;
        RETURN v_customers_ref_cursor;
    END get_customer;

    PROCEDURE insert_customer(
    p_id IN customers_with_varray.id%TYPE
    , p_first_name IN customers_with_varray.first_name%TYPE
    , p_last_name IN customers_with_varray.last_name%TYPE
    , p_adress IN customers_with_varray.adress%TYPE
    )
    IS
    BEGIN

        INSERT INTO customers_with_varray
        VALUES
        (p_id, p_first_name, p_last_name, p_adress);
        COMMIT;
        
        EXCEPTION 
            WHEN OTHERS THEN
                ROLLBACK;

    END insert_customer;

END varray_package;

/

-- COUNT, wypisuje niepuste lelmenty tablicy zagniezdzonej i elementy kolekcji
DECLARE
vi_VarrayCounter customers_with_varray.adress%TYPE;
BEGIN

SELECT cv.adress 
INTO vi_VarrayCounter 
FROM customers_with_varray cv 
WHERE id = 1;

dbms_output.put_line('Liczba elementow kolekcji: ' || vi_VarrayCounter.count);
END;

-- DELETE 
-- EXIST
-- EXTEND
-- FIRST
-- LAST
-- NEXT
-- PRIOR
-- TRIM
/

CREATE TYPE x_varray AS VARRAY(10) OF INTEGER
/
CREATE TYPE y_varray AS VARRAY(10) OF x_varray

/
DECLARE

y_varray  := xy_varray(10)(10);
BEGIN
null;
--xy_varray(0)(0):= 1;
END;
/
-- tablice asocjacyjne

CREATE OR REPLACE PROCEDURE customers_assciotative_table
AS

TYPE t_assciotative_table IS TABLE OF NUMBER INDEX BY VARCHAR2(15);
v_customer_table t_assciotative_table;

BEGIN


v_customer_table('Adam') := 23;
v_customer_table('Anna') := 30;
v_customer_table('Damian') := 26;
v_customer_table('Olek') := 27;
v_customer_table('Jarek') := 28;
v_customer_table('Krzysiek') := 20;


dbms_output.put_line('Adam: ' || v_customer_table('Adam'));
dbms_output.put_line('Anna: ' || v_customer_table('Anna'));
dbms_output.put_line('Damian: ' || v_customer_table('Damian'));
dbms_output.put_line('Olek: ' || v_customer_table('Olek'));
dbms_output.put_line('Jarek: ' || v_customer_table('Jarek'));
dbms_output.put_line('Krzysiek: ' || v_customer_table('Krzysiek'));
END customers_assciotative_table;
/



BEGIN

customers_assciotative_table;

END;


select * from user_tablespaces

--multiset laczy dwie tabela zagniezdzona
-- cardinality zwraca liczbe elementow tabela zagniezdzona
-- set wyrzuca duplikaty tabela zagniezdzona
-- is a set sprawdza czy elementy sie nie powtarzaja w tabela zagniezdzona
-- is empty sprawdza czy tabela zagniezdzona jest pusta
-- collect cwraca tabela zagniezdzona na podstawie lelementow
--powermultiset zwraca wszystkie kobinacje elementow z tabela zagniezdzona
