--8. zmienianie zawartosci tabel
describe jobs -- opis obiektu 
/
variable zmienna_do_returning Number

update jobs 
set max_salary= 10000
returning avg(max_salary) INTO :zmienna_do_returning; -- mozliwosc zapisania czegos za pomoca returning do zmiennej
/

ACCEPT MYTITLE PROMPT 'Title: '
/
execute dbms_flashback.enable_at_time(sysdate - 10/1440); -- cofanie commitow
/
execute dbms_flashback.disable();
/
exec dbms_flashback.enable_at_time(sysdate - 10/1440); -- cofanie commitow
/
exec dbms_flashback.disable();
/

DECLARE
current_scn NUMBER;

begin

current_scn := dbms_flashback.get_system_change_number(); --pobranie numeru zmiany            
DBMS_OUTPUT.Put_Line( current_scn );  

dbms_flashback.enable_at_system_change_number(current_scn); --widok przed zmianami

--dbms_flashback.disable();
end;
/

select dbms_flashback.get_system_change_number()  -- pobranie numeru scn
--mergowanie tabel
merge into tabela_docelowa tdo
using tabela_dane tda  
on(id.tdo = id.tda)
wher matched THEN
update...

when not matched then
insert....
;
 


    
