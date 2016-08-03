declare
    vi_bok1 INTEGER := 0;
    vi_bok2 INTEGER := 1;
    vi_pole INTEGER;
begin
    vi_pole := vi_bok2 / vi_bok1;
    dbms_output.put_line(vi_pole);
    
    exception
        when zero_divide then
        dbms_output.put_line('Nie wolno dzielic przez zero');
end;
/

declare
vi_arg integer := 0;
begin
    loop
    vi_arg := vi_arg + 1;
    dbms_output.put_line('Opis ' || vi_arg);
    exit when vi_arg = 10;
    end loop;
end;

/
DECLARE
vi_arg INTEGER := 0;
BEGIN

 WHILE vi_arg < 10 LOOP
    dbms_output.put_line('Opis ' || vi_arg);
    vi_arg := vi_arg + 1;
 END LOOP; 
END;
/

DECLARE

BEGIN
    FOR counter In 1..10 LOOP
    dbms_output.put_line('Obieg petli: ' || counter);

    END LOOP; 
END;
/
SET SERVEROUTPUT ON

DECLARE
vi_tableId COM_CURRENCIES_T.id%TYPE;
vv_name COM_CURRENCIES_T.name%TYPE;
vv_isocode COM_CURRENCIES_T.isocode%TYPE;

CURSOR test_cursor IS
SELECT * FROM COM_CURRENCIES_T;

BEGIN
OPEN test_cursor;
 
LOOP

 FETCH test_cursor
 INTO vi_tableId, vv_name, vv_isocode;
 EXIT WHEN test_cursor%NOTFOUND;
 dbms_output.put_line(vi_tableId || ' ' || vv_name|| ' ' || vv_isocode);

 END LOOP; 
CLOSE test_cursor;

END;
/

DECLARE 

CURSOR test_cursor IS
SELECT * FROM COM_CURRENCIES_T;

BEGIN
FOR vi_counter IN test_cursor  LOOP
 dbms_output.put_line(vi_counter.ID|| ' ' ||vi_counter.NAME || ' ' || vi_counter.ISOCODE );

END LOOP; 
END;
-- STRONA 364

