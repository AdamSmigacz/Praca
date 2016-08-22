select * from jobs
/
-- xmlelement tworzy format xml z tabeli
select xmlelement("job_id", job_id)
as xml_job_id
from jobs
/

select xmlelement("Job", 
                    xmlelement("job_id", job_id), 
                    xmlelement("job_title", job_title))
as t_job
from jobs
/

select xmlelement("product", PRODUCT)
as product
from PRODUCT
/

select xmlelement("ADRESS", ADRESS)
as ADRESS
from CUSTOMERS_WITH_VARRAY
/

select xmlelement("ADRESS", ADRESS)
as ADRESS
from CUSTOMERS_WITH_NESTED_TABLE2
/
-- xmlattributes do okreslenia atrybutow
select* from DEPARTMENTS
/
select xmlelement("Department", xmlattributes(department_id as "id", department_name as "name", manager_id as "manager"))
from DEPARTMENTS
/
-- xmlforest tworzy drzewo, nie trzeba wywoywac w kolko xmlelement
select xmlelement("Department", xmlforest(department_id as "id", department_name as "name", manager_id as "manager"))
from DEPARTMENTS
/
-- sortowanie xmlagg
select xmlelement("Department", xmlagg(xmlforest(department_id as "id", department_name as "name", manager_id as "manager")  order by department_id desc) )
as xml_asc
from DEPARTMENTS
/
-- uzycie xmlcolattval
select xmlelement("Department", xmlcolattval(department_id as "id", department_name as "name", manager_id as "manager"))
as xml_colattval
from DEPARTMENTS
/
-- xmlconcat aczenie elementow xml

select xmlconcat(
xmlelement("department_id", department_id)
, xmlelement("department_name", department_name)
, xmlelement("manager", manager_id))
as xml_concat
from DEPARTMENTS
/
-- xmlparse
select xmlparse
(content
'<department><department_id>1</department_id><department_name>Administration</department_name></department>'
wellformed)
as xml_parser
from dual
