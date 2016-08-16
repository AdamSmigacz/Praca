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


