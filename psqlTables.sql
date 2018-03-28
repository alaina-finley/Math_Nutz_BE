-- https://chartio.com/resources/tutorials/how-to-list-databases-and-tables-in-postgresql-using-psql/

CREATE DATABASE islandhopperv1;
CREATE ROLE islandHopTop WITH LOGIN PASSWORD 'supersecretpass3';
ALTER ROLE islandhoptop CREATEDB;

CREATE TABLE problem (
  id serial primary key NOT NULL,
  first int,
  second int,
  operation int,
  difficulty int
);

INSERT INTO problem(first, second, operation, difficulty) values(3,6,0,0);
INSERT INTO problem(first, second, operation, difficulty) values(1,0,0,0);
INSERT INTO problem(first, second, operation, difficulty) values(3,6,1,0);
INSERT INTO problem(first, second, operation, difficulty) values(12,12,0,1);
INSERT INTO problem(first, second, operation, difficulty) values(100,100,2,2);
