-- tworzenie tymczasowej tabeli ktora zostanie usunieta po zakonczeniu sesji
create global temporary table test_tabela(
id integer
, status varchar2(10)
, last_modified date default sysdate)
on commit preserve rows /*delete - do zakonczenia transakcji*/
/
create  table test_tabela_as(
id integer
, status varchar2(10)
, last_modified date default sysdate)

/
describe test_tabela_as -- pobieranie informacji o danej tabeli
/
select * from all_tables --wszystkie tabele do ktorych mamy dostep
/
select * from user_tables -- tabele danego usera
/
select * from user_tab_columns  -- informacje o kolumnach dla danej tabeli
/
ALTER TABLE test_tabela_as ADD STATUS varchar(25) -- wstawianie nowej kolumny
/
ALTER TABLE test_tabela_as MODIFY status varchar(25) --zmiana rozmiaru kolumny/
/
ALTER TABLE test_tabela_as MODIFY modified_by number(5) -- zmiana precyzji kolumny
/
ALTER TABLE test_tabela_as MODIFY last_modified default sysdate - 1 -- zmiana wartosci domyslnej
/
ALTER TABLE test_tabela_as DROP COLUMN modified_by --usuwanie kolumny
/
ALTER TABLE test_tabela_as
ADD CONSTRAINT ORDER_STATUS2
CHECK(ID BETWEEN 1 and 10) -- DODANIE wiezow check
/
ALTER TABLE test_tabela_as
MODIFY status CONSTRAINT status_cnt NOT NULL
/
ALTER TABLE test_tabela_as
DROP COLUMN STATUS
/
ALTER TABLE test_tabela_as
ADD CONSTRAINT foreginer_constraint
STATUS REFERENCES CDM_ACCOUNTS_TG(DESCRIPTION)
ON DELETE CASCADE -- JEZELI Z TABLEI NADRZEDNEJ ZOSTANIE USUNIETY WPIS TO Z test_tabela_as TEZ ZOSTANIE ON USUNIETY
/
ALTER TABLE test_tabela_as
ADD CONSTRAINT UNIQUE_CONSTRAINT UNIQUE(STATUS) -- DODANIE WIEZOW UNIQUE
/
ALTER TABLE test_tabela_as
DROP CONSTRAINT UNIQUE_CONSTRAINT  -- USUWANIE WIEZOW
/
ALTER TABLE test_tabela_as
DISABLE CONSTRAINT UNIQUE_CONSTRAINT -- WYLACZENIE WIEZOW (ENABLE WLACZENIE)
/
select * from user_constraints -- INFORMACJE O WIEZACH
/
select * from user_cons_columns -- INFORMACJE O WIEZACH DLA KOLUMNY
/
rename test_tabela_as to test_tabela_as1 -- zmiana nazwy tabeli
/
rename test_tabela_as1 to test_tabela_as
/
comment on table test_tabela_as is 'komentarz'
/
select * from user_tab_comments -- komentarze danego usera
/
select * from user_col_comments -- komentarze dla danej kolumny
/
truncate table test_tabela_as -- czyszczenie tabeli
/
create sequence as_test_sq
start with 1 increment by 3 
minvalue 1 maxvalue 300
nocycle nocache order
/
select * from user_sequences
/
SELECT as_test_sq.nextval from dual
/
SELECT as_test_sq.currval from dual
/
alter sequence as_test_sq increment by 2 -- zmienianie sekwencji
/
drop SEQUENCE as_test_sq -- usuwanie sekwencji
/
create /*unique*/ index index_test_tabela_as on test_tabela_as(LAST_MODIFIED)  -- tworzenie indeksu na tablei; unique musza byc unikatowe wiersze tabeli
/
create /*unique*/ index index_test_tabela_as on test_tabela_as(UPPER(LAST_MODIFIED))  -- index opart na funkcji, do tego potrzeba alter system set quert_rewrite_enabled = true
/
select * from user_indexes  -- pobieranie informacji o indexach
/
select * from user_ind_columns  -- pobieranie informacji dla kolumn o indexach
/
alter index index_test_tabela_as to index_test_tabela_as1 -- modyfikacja indexu
/
alter index index_test_tabela_as1 to index_test_tabela_as -- modyfikacja indexu
/
drop index index_test_tabela_as  -- usuwanie indexu 
/
create or replace view view_test_as as
select * from test_tabela_as
where modified_by > 15 
with check option constraint constraint_1_test_tabela_as-- przy instruckjach DML ten warunek musi byc speniony, gdyby nie bylo 'with check option' to mozna wstawiac cokolwiek do tabeli
/
drop view view_test_as -- usuwanie widoku


