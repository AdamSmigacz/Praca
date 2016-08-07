-----------------------------------7--------------------------------------------
select translate('spotkajmy sie w parku', 'sie ', 'obok') from dual  --dziala na literach
/
select decode(1,1,2,3) as wynik from dual -- jezeli 1 jest rowne 1 to 2 else 3
/
select decode(1,2,2,3) as wynik from dual -- jezeli 1 jest rowne 2 to 2 else 3
/
select job_id, job_title, case min_salary
                    when 2008 then 'Biedny'
                    when 2500 then 'Mniej biedny'
                    when 3000 then 'Srednio zamozny'
                    when 4000 then 'Zamozny'
                    when 4500 then 'Bardzo zamozny'
                    when 6000 then 'Bogaty'
                    else 'Nie stwierdzono'
                    end as Stopien_zamoznosci
from jobs
/
select job_id, job_title, case 
                    when min_salary = 2008 then 'Biedny'
                    when min_salary = 2500 then 'Mniej biedny'
                    when min_salary = 3000 then 'Srednio zamozny'
                    when min_salary = 4000 then 'Zamozny'
                    when min_salary = 4500 then 'Bardzo zamozny'
                    when min_salary = 6000 then 'Bogaty'
                    else 'Nie stwierdzono'
                    end as Stopien_zamoznosci
from jobs
/






