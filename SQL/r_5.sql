-------------------------------6------------------------------------------------
select to_char(sysdate, 'DD-MM-YYYY HH24:MI:SS') as wynik from dual
/
select to_char(sysdate, 'DD-MONTH-YYYY HH24:MI:SS') as wynik from dual
/
alter session set nls_date_format = 'dd-mm-yyyy' -- ustawienie formatu daty bazy danych(w ramach sesji, po reconnectcie bedzie domyslna wartsc)
/
select add_months(to_date('13-12-2015','DD-MM-YYYY'), 9) as wynik from dual --dodanie miesiecy
/
select add_months(to_date('13-12-2015','DD-MM-YYYY'), -16) as wynik from dual --odejmowanie miesiecy
/
select to_char(add_months(to_date('13-12-2015','DD-MM-YYYY'), -16), 'month') as wynik from dual -- zwrocona nazwa miesiac
/
select last_day(sysdate) from dual
/
select trunc(MONTHS_BETWEEN(to_char(sysdate, 'dd-mm-yyyy'), '10-10-2017' )) from dual
/
select next_day(sysdate + 3, TO_CHAR(SYSDATE, 'DAY')) from dual
/
select round(sysdate, 'mm') from dual
/
select round(sysdate) from dual
/
select CURRENT_DATE from dual
/
alter database set time_zone = '13:05' -- ustawienie czasu dla caej bazy danych
/
select dbtimezone from dual -- czas bazy danych
/
alter session set time_zone = '13:05' -- ustawienie czasu dla danej sesji
/
select SESSIONTIMEZONE from dual --czas dla danej sesji
-- new_time() konwertuje czas z jednej strefy czasowej na inna
/
select extract(YEAR from SYSDATE )as rok from dual --wydobywa rok minute godzine itp z daty lub datownika
