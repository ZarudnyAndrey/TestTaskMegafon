CREATE DATABASE megafon;

\connect megafon

CREATE SCHEMA mf;
CREATE SCHEMA test;

CREATE USER mf_user WITH password 'mf_user';
ALTER USER mf_user WITH SUPERUSER;
GRANT USAGE ON SCHEMA mf TO mf_user;
ALTER SCHEMA me OWNER TO mf_user;