select * from jobs where REGEXP_LIKE(min_salary,'^4[0-9]?')
/
select REGEXP_INSTR('Napis jedne wiosny nie czyni a napis drugi juz tak','j[[:alpha:]]{2}',1,2) as napis from dual
/
select REGEXP_REPLACE('Napis jedne wiosny nie czyni a napis drugi juz tak', 'j[[:alpha:]]{2}', 'inny_napis') as kolumna from dual
