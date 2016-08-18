CREATE TABLE clob_content_test(
id INTEGER PRIMARY KEY
, clob_column CLOB NOT NULL);
/

CREATE TABLE blob_content_test(
id INTEGER PRIMARY KEY
, clob_column BLOB NOT NULL);

/
CREATE TABLE bfile_content_test(
id INTEGER PRIMARY KEY
, clob_column BFILE NOT NULL);
/

INSERT INTO clob_content_test
VALUES
(1, TO_CLOB('Tekst wewnatrz cloba 1'));

INSERT INTO clob_content_test
VALUES
(2, TO_CLOB('Tekst wewnatrz cloba 2'));
/

SELECT * FROM clob_content_test
/

INSERT INTO blob_content_test
VALUES
(1, TO_BLOB('A0FFB71CF90DE'));

INSERT INTO blob_content_test
VALUES
(2, TO_BLOB('100111010101011111'));
/

select * from blob_content_test
/

-- INICJALIZACJA BEZ WPISANIA CZEGOKOLWIEK (pusta wartosc cloba i bloba)
INSERT INTO clob_content_test
VALUES
(3, EMPTY_CLOB());

INSERT INTO blob_content_test
VALUES
(3, EMPTY_BLOB());
/

CREATE DIRECTORY SAMPLE_FILES_DIR as 'C:\sample_files';
/

INSERT INTO bfile_content_test
VALUES
(1, BFILENAME('Cw_14.txt','C:\sample_files'));
/

INSERT INTO bfile_content_test
VALUES
(2, BFILENAME('Cw_14.docx','C:\sample_files'));
/

select * from bfile_content_test
/
-- metody dla clobow (dbms_lob)
/*
append()             - kopiuje dane ze zrodlowego loba na sam koniec docelowego loba 
close()              - zamyka otwarty obiekt lob
compare()            - porownuje ilosc bajtow lub znakow skaldowych w dwoch lobach
copy()               - kopiuje znaki lub bajty ze zrodlowego loba do docelowego rozpoczynajac w przesunieciach
createtemporary()    - tworzy tymczasowy obiekt LOB w domyslnej, tymczasowej przestrzeni tabel uzytkownika
erase()              - usuwa okreslona liczbe znakow lub bajtow
fileclose()          - zamyka bfile, nalezy stosowac close() poniewaz ta procedura nie jest juz rozbudowywana przez oracle
filecloseall()       - zamyka wszystkie obiekty bfile
fileexist()          - sprawdza czy plik istnieje
filegetname()        - zwraca katalog oraz nazwe pliku z obiektu bfile
fileisopen()         - sprawdza czy plik jest otwarty, nalezy stosowac isopen()
fileopen()           - otwiera plik, nalezy stosowac open()
freetemporary()      - zwalnia tymczasowy obiektLOB z domyslnej tymczasowej przestrzeni tabel uzytkownika
getchunksize()       - zwraca rozmiar fragmentu uzywanego przy odczytywaniu i zapisywaniu danych LOB
get_storage_limit()  - zwraca max dopuszczalny rozmiar obiektu lob   
getlength()          - zwraca dlugosc danych obiektu LOB
instr()              - zwraca poczatkowa pozycje znakow stanowiace n-te wystapienie wzorca w danych LOB
isopen()             - sprawdza czy obiekt lob jest otwarty
istemporary()        - sprawdza czy obiekt jest tymczasowy
loadfromfile()       - metoda laduje do bloba lub cloba okreslona liczbe znakow lub bajtow poprana z bfile
loadblobfromfile()   - metoda laduje dane do bloba z bfile
loadclobfromfile()   - metoda laduje dane do cloba z bfile
open()               - otwiera lob
read()               - odczytuje do bufora dane z obiektu LOB
substr()             - zwraca okreslona liczbe znakow z LOB
trim()               - przycina dane w lob do okreslonej dlugosci
write()              - zapisuje dane z bfora do lob
writeappend()        - zapisuje dane z bfora na koncu lob
*/
/

CREATE OR REPLACE PROCEDURE get_clob_locator(
    p_clob IN OUT CLOB,
    p_id IN INTEGER) 
AS
BEGIN
    SELECT clob_column
    INTO p_clob
    FROM clob_content_test
    WHERE id = p_id;
    
END get_clob_locator;
/


CREATE OR REPLACE PROCEDURE get_blob_locator(
    p_clob IN OUT BLOB,
    p_id IN INTEGER) 
AS
BEGIN
    SELECT clob_column
    INTO p_clob
    FROM blob_content_test
    WHERE id = p_id;
    
END get_blob_locator;
/

CREATE OR REPLACE PROCEDURE read_clob_example(
p_id INTEGER)
AS
    v_clob CLOB;
    v_offset INTEGER := 1;
    v_amount INTEGER := 50;
    v_char_buffer VARCHAR2(50);

BEGIN

    get_clob_locator(v_clob, p_id);
    
    dbms_lob.read(lob_loc => v_clob
                 , amount => v_amount
                 , offset => v_offset
                 , buffer => v_char_buffer );

    dbms_output.put_line('v_char_buffer: ' || v_char_buffer);
    dbms_output.put_line('v_amount: ' || v_amount);

END read_clob_example;
/

CREATE OR REPLACE PROCEDURE read_blob_example(
p_id INTEGER)
AS
    v_blob BLOB;
    v_offset INTEGER := 1;
    v_amount INTEGER := 25;
    v_char_buffer RAW(25);

BEGIN

    get_blob_locator(v_blob, p_id);
    
    dbms_lob.read(lob_loc => v_blob
                 , amount => v_amount
                 , offset => v_offset
                 , buffer => v_char_buffer );

    dbms_output.put_line('v_char_buffer: ' || v_char_buffer);
    dbms_output.put_line('v_amount: ' || v_amount);

END read_blob_example;
/

BEGIN
read_clob_example(1);
read_blob_example(1);
END;    
/

CREATE OR REPLACE PROCEDURE write_example(p_id IN INTEGER) 
AS
    v_clob CLOB;
    v_offset INTEGER := 9;
    v_amount INTEGER := 7;
    v_char_buffer VARCHAR2(10) := ' Ciagle1';

BEGIN                                            

    SELECT clob_column
    INTO v_clob 
    FROM clob_content_test
    WHERE id = p_id
    FOR UPDATE;


    read_clob_example(p_id => p_id);

    DBMS_LOB.WRITE (lob_loc  => v_clob
       , amount   => v_amount
       , offset   => v_offset
       , buffer   => v_char_buffer);
       
    read_clob_example(p_id => p_id);
    
END write_example;
/

BEGIN

write_example(1);
END;
/

CREATE OR REPLACE PROCEDURE append_example AS

    v_scr_clob CLOB;
    v_dest_clob CLOB;

BEGIN

    --get_clob_locator(v_scr_clob, 2);

    SELECT clob_column
    INTO v_dest_clob 
    FROM clob_content_test
    WHERE id = 1
    FOR UPDATE;
    
    
read_clob_example(1);

dbms_lob.append(v_dest_clob ,v_scr_clob);

read_clob_example(1);
END append_example;
/

BEGIN
append_example;
END;

/

CREATE OR REPLACE PROCEDURE compare_example AS
    v_clob1 CLOB;
    v_clob2 CLOB;
    v_return INTEGER;
    v_return_describe VARCHAR2(50);

BEGIN

get_clob_locator(v_clob1, 1);
get_clob_locator(v_clob2, 2);

dbms_output.put_line('Porownanie dwoch clobow!');

v_return := DBMS_LOB.COMPARE (
   lob_1            => v_clob1,
   lob_2            => v_clob2);

    v_return_describe := CASE v_return
                                WHEN 0 THEN 'Rowne'
                                WHEN 1 THEN 'Rozne'
                                ELSE 'Exception'
                         END;
                         
dbms_output.put_line('Wynik porownanie dwoch clobow: ' || v_return || ' ' || v_return_describe);

END compare_example ;
/

BEGIN
COMPARE_EXAMPLE;
END;
/

CREATE TABLE long_content(
id INTEGER PRIMARY KEY
, long_column LONG NOT NULL);

CREATE TABLE long__raw_content(
id INTEGER PRIMARY KEY
, long_raw_column LONG RAW NOT NULL);
/


INSERT INTO long_content
VALUES
(1, 'wije sie w wasnym kolko')
/
INSERT INTO long_content
VALUES
(2, 'od dnia do dnia')
/
INSERT INTO long__raw_content
VALUES
(1, '100110011100011010')
/
INSERT INTO long__raw_content
VALUES
(2, 'A0FBE001290DE')
/
ALTER TABLE long__raw_content MODIFY(long_raw_column BLOB)  -- ZMIANA Z RAW NA blob
/
create table encrypted_table
(id INTEGER PRIMARY KEY
, card_number INTEGER(16,0) ENCRYPT);

--http://andrzejklusiewicz.blogspot.com/2011/11/korzystanie-z-plikow-tekstowych-przy.html
/
ALTER SYSTEM SET ENCRYPTION KEY IDENTIFIED BY testpasss123



-- jak skonfigurowac wallet