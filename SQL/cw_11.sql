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
-- CURSOR W FOR
DECLARE 

CURSOR test_cursor IS
SELECT * FROM COM_CURRENCIES_T;

BEGIN
FOR vi_counter IN test_cursor  LOOP
 dbms_output.put_line(vi_counter.ID|| ' ' ||vi_counter.NAME || ' ' || vi_counter.ISOCODE );

END LOOP; 
END;
/
-- FOR OPEN CURSOR
DECLARE

type t_produce_cursor is
ref cursor return employees%ROWTYPE; 

v_produce_cursor t_produce_cursor; 

v_employees employees%rowtype;
BEGIN

open v_produce_cursor FOR
select * from employees;
loop

fetch v_produce_cursor into v_employees;
exit when v_produce_cursor%NOTFOUND;
dbms_output.put_line(v_employees.first_name || ' ' || v_employees.last_name);

END LOOP;


CLOSE v_produce_cursor;
END;
/

-- CURSOR BEZ OGRANICZEN

DECLARE

TYPE t_cursor IS REF CURSOR;
v_cursor t_cursor;
v_employees employees%ROWTYPE;
BEGIN

OPEN v_cursor FOR 
SELECT * FROM employees;
LOOP
FETCH v_cursor INTO v_employees;
EXIT WHEN v_cursor%NOTFOUND;
dbms_output.put_line('Imie: ' || v_employees.first_name || ' Nazwisko: ' || v_employees.last_name);
END LOOP;

CLOSE v_cursor;

END;
/

-- wyjatki

-- procedury
create or replace PROCEDURE prcedura_adam
as
begin

dbms_output.put_line(1/0);

end;

/
begin
prcedura_adam; -- wywoanie procedury
end;
/
select * from user_procedures -- informacje o procedurach funkcjach widokach
/
show errors
/
-- trigery

CREATE OR REPLACE TRIGGER test_trigger_as
before  update
ON EMPLOYEES
for each ROW
when (old.employee_id >= 10)
begin

dbms_output.put_line('trigger');
end test_trigger_as;
/
select * from EMPLOYEES where employee_id = 22
/
update employees 
set
first_name = 'smigacz' 
where employee_id = 108
/
drop trigger test_trigger_as -- usuwanie triggera
/
select * from user_triggers
/
alter trigger test_trigger_as enable; -- waczenie trigera
/
alter trigger test_trigger_as disable; -- wyaczenie triggera
-- strona 388
