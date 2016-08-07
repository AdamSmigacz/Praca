describe COUNTRIES_changed  -- opis tabeli
/
select * from user_tables -- dokadniejszy opis tabeli
/
select * from user_tab_columns
/
alter table COUNTRIES ADD kolumna INTEGER;
/
alter table COUNTRIES MODIFY kolumna varchar2(50)
/
alter table COUNTRIES MODIFY kolumna DEFAULT 'czesc' -- modyfikacja, ustawianie wartosci domyslnej
/
alter table COUNTRIES drop column kolumna
/
rename COUNTRIES to COUNTRIES_changed -- zmiana nazwy tabeli
/
select * from user_tab_comments --komentarze do tabel
/
select * from user_col_comments -- komentarze do kolumn tabel
/
create SEQUENCE s_test1
/
create SEQUENCE s_test2
start with 10 INCREMENT by 5 
minVALUE 10 
MAXVALUE 20
cycle
cache 2
order
/
select * from user_sequences  -- informacje o sekwencjach usera
/
create index i_pkindex on  COUNTRIES_changed(region_id) -- tworzenie indexu
/
select * from user_indexes -- indeksy dla danego schematu
/
select* from all_indexes order by owner  -- wszystkie indexy na bazie
/
select * from user_ind_columns --informacje o indaksach an kolumnie
/
alter INDEX DEPT_LOCATION_IX rename to DEPT_LOCATION_IX1  -- zmiana nazwy indexu
/
drop index DEPT_LOCATION_IX -- usuwanie indexu
/
select * from user_views -- widoki usera
/
select * from user_constraints where table_name = 'EMP_DETAILS_VIEW'
/
drop view EMP_DETAILS_VIEW -- usuniecie perspektywy
/
-- migawki
select * from dba_tablespaces -- obszary tabel
/
create flashback ARCHIVE test_migawka
TABLESPACE SYSTEM
QUOTA 1M
retention 1 day  -- tworzenie migawki
/
alter table COUNTRIES_changed flashback ARCHIVE test_migawka -- ustawienie migawki
/



