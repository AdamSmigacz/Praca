/****************************************** Rozdzia pierwszy ****************************************/

create table PK_FK_table(
ID INTEGER CONSTRAINT PK_ID PRIMARY KEY
, LOCATION_ID INTEGER CONSTANT fk_location_id references locations(LOCATION_ID)
)
/

/****************************************** Rozdzia drugi ****************************************/
-- zoczenia rozszerzone to takie gdzie pobierana jest wartosc null z danej kolumny where id = other_id(+)  (+) swiadczy o tym ze jest rozszerzone zlaczenie
select * from EMPLOYEES where employee_id >= ANY(100, 101, 102)
/
select * from EMPLOYEES where employee_id >= ALL(100, 101, 102)
/








