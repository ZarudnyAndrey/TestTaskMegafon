SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

SET search_path TO test;

INSERT INTO test.person (first_name, last_name, age) VALUES ('Johannes', 'Gutenberg', 50);
INSERT INTO test.person (first_name, last_name, age) VALUES ('Martin', 'Luther', 47);
INSERT INTO test.person (first_name, last_name, age) VALUES ('Guglielmo', 'Marconi', 59);
INSERT INTO test.person (first_name, last_name, age) VALUES ('Michael', 'Faraday', 45);
INSERT INTO test.person (first_name, last_name, age) VALUES ('Benjamin', 'Franklin', 62);