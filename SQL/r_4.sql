select ASCII('1'),ASCII('s'), ASCII('3'), ASCII('y'), ASCII('Y') from dual  -- zwraca kod ascii danego znaku
/
select ASCIISTR('1 2 3 4 5') from dual
/

BEGIN
    FOR j IN 30 .. 50
    LOOP
        DBMS_OUTPUT.put_line (j || ' to znak: ' || CHR (j));
    END LOOP;
END;
/
select CONCAT(username, created) from all_users -- zlaczenie dwoch stringow w jeden
/

