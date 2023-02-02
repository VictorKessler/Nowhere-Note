DROP DATABASE IF EXISTS "nowhere-note";

CREATE DATABASE "nowhere-note";

CREATE role "nowhere-note" with Superuser;

GRANT "nowhere-note" TO "local";