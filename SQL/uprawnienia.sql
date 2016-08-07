create user smigacz IDENTIFIED by smigacz -- tworzenie konta
/
drop user smigacz -- usuwanie usera
/
grant create session to smigacz -- nadawanie uprawanien
/
alter user krzysiek IDENTIFIED by marcin -- zmiana hasa
/
connect system/system 
/
select * from user_sys_privs
/
revoke create session from krzysiek
/
grant update (kolumna1, kolumna2) on user.tablica to user --przyznanie uprawnien do instrukcji DML dla danych kolumn
/
select * from user_tab_privs_made -- uprawnienia nadane dla innych przez danego uzytkownika
/
select * from user_col_privs_made -- uprawnienia obiektowe do kolumn zostay nadane przez curent user
/
select * from user_tab_privs_recd -- uprawnienia otrzymane od innych userow
/
select * from user_col_privs_recd -- uprawnienia obiektowe ktore zostay otzymane od innych userow
/
revoke insert on tabela from user
/
create role nazwa_roli
/
grant select, insert, update, delete on nazwa_tablicy to nazwa_roli  -- nadawanie uprawnien roli
/
grant nazwa_roli to user -- przyznawanie roli uzytkownikowi 
/
select * from user_role_privs  --role nadene uzytkownikowi (rola jest z automatu nadawana jego tworcy)
/
select * from role_sys_privs -- jakie uprawnienia systemowe zostay przyznane roli
/
select * from role_tab_privs  -- jakie uprawnienia zostaly przyznane roli
/
audit create table -- obserowowanie danego uprawnienia dla curent user
/
select * from user_audit_trail ---obserowowanie danego uprawnienia dla curent user
/
audit select TABLE by hr -- obserwowanie instrukcji select dla danego user
/
audit update TABLE by hr WHENEVER not SUCCESSFUL -- obserwowanie instrukcji update niepowodzenie






