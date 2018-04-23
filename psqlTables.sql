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

INSERT INTO problem(first, second, operation, difficulty) values(3,6,0,5);
INSERT INTO problem(first, second, operation, difficulty) values(1,0,0,5);
INSERT INTO problem(first, second, operation, difficulty) values(3,6,1,5);
INSERT INTO problem(first, second, operation, difficulty) values(110,1,2,50);
INSERT INTO problem(first, second, operation, difficulty) values(100,100,2,500);
INSERT INTO problem(first, second, operation, difficulty) values(-1,-1,-1,-1);
INSERT INTO problem(first, second, operation, difficulty) values(-1,-1,-1,-1);
INSERT INTO problem(first, second, operation, difficulty) values(-1,-1,-1,-1);
INSERT INTO problem(first, second, operation, difficulty) values(-1,-1,-1,-1);
INSERT INTO problem(first, second, operation, difficulty) values(-1,-1,-1,-1);
INSERT INTO problem(first, second, operation, difficulty) values(-1,-1,-1,-1);
INSERT INTO problem(first, second, operation, difficulty) values(-1,-1,-1,-1);
INSERT INTO problem(first, second, operation, difficulty) values(-1,-1,-1,-1);
INSERT INTO problem(first, second, operation, difficulty) values(-1,-1,-1,-1);
INSERT INTO problem(first, second, operation, difficulty) values(-1,-1,-1,-1);
INSERT INTO problem(first, second, operation, difficulty) values(-1,-1,-1,-1);
INSERT INTO problem(first, second, operation, difficulty) values(-1,-1,-1,-1);
INSERT INTO problem(first, second, operation, difficulty) values(-1,-1,-1,-1);
INSERT INTO problem(first, second, operation, difficulty) values(-1,-1,-1,-1);
INSERT INTO problem(first, second, operation, difficulty) values(-1,-1,-1,-1);

CREATE TABLE island_user(
  id serial primary key NOT NULL,
  username varchar(100),
  password varchar(100),
  role varchar(20)
);

INSERT INTO island_user(username, password, role) values('jimmydean','sausage', 'student');
INSERT INTO island_user(username, password, role) values('wednesdayadams','family', 'student');
INSERT INTO island_user(username, password, role) values('jackjack','incredible', 'student');
INSERT INTO island_user(username, password, role) values('frizzle','magic', 'teacher');
INSERT INTO island_user(username, password, role) values('demo','demo', 'demo');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');
INSERT INTO island_user(username, password, role) values('empty','empty', 'empty');

Create TABLE progress(
  id serial primary key NOT NULL,
  student_id int,
  lev11_total int,
  lev11_correct int,
  lev12_total int,
  lev12_correct int,
  lev13_total int,
  lev13_correct int,
  lev21_total int,
  lev21_correct int,
  lev22_total int,
  lev22_correct int,
  lev23_total int,
  lev23_correct int,
  lev31_total int,
  lev31_correct int,
  lev32_total int,
  lev32_correct int,
  lev33_total int,
  lev33_correct int,
  boss_total int,
  boss_correct int
);

INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(11,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(12,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(13,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(14,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(15,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(17,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(18,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(19,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
INSERT INTO progress(student_id, lev11_total, lev11_correct, lev12_total, lev12_correct, lev13_total, lev13_correct, lev21_total, lev21_correct, lev22_total, lev22_correct, lev23_total, lev23_correct, lev31_total, lev31_correct, lev32_total, lev32_correct, lev33_total, lev33_correct, boss_total, boss_correct)
VALUES(20,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);

CREATE TABLE coins (
  id serial primary key NOT NULL,
  student_id int,
  total_coins int
);

INSERT INTO coins(student_id, total_coins)
VALUES(0,0);
INSERT INTO coins(student_id, total_coins)
VALUES(1,0);
INSERT INTO coins(student_id, total_coins)
VALUES(2,0);
INSERT INTO coins(student_id, total_coins)
VALUES(3,0);
INSERT INTO coins(student_id, total_coins)
VALUES(4,0);
INSERT INTO coins(student_id, total_coins)
VALUES(5,0);
INSERT INTO coins(student_id, total_coins)
VALUES(6,0);
INSERT INTO coins(student_id, total_coins)
VALUES(7,0);
INSERT INTO coins(student_id, total_coins)
VALUES(8,0);
INSERT INTO coins(student_id, total_coins)
VALUES(9,0);
INSERT INTO coins(student_id, total_coins)
VALUES(10,0);
INSERT INTO coins(student_id, total_coins)
VALUES(11,0);
INSERT INTO coins(student_id, total_coins)
VALUES(12,0);
INSERT INTO coins(student_id, total_coins)
VALUES(13,0);
INSERT INTO coins(student_id, total_coins)
VALUES(14,0);
INSERT INTO coins(student_id, total_coins)
VALUES(15,0);
INSERT INTO coins(student_id, total_coins)
VALUES(16,0);
INSERT INTO coins(student_id, total_coins)
VALUES(17,0);
INSERT INTO coins(student_id, total_coins)
VALUES(18,0);
INSERT INTO coins(student_id, total_coins)
VALUES(19,0);
INSERT INTO coins(student_id, total_coins)
VALUES(20,0);

alter database islandhopperv1 owner to islandhoptop ;

CREATE TABLE coins (
  id serial primary key NOT NULL,
  student_id int,
  total_coins int
);

alter table coins owner to islandhoptop ;

INSERT INTO coins(student_id, total_coins)
VALUES(0,0);
INSERT INTO coins(student_id, total_coins)
VALUES(1,0);
INSERT INTO coins(student_id, total_coins)
VALUES(2,0);
INSERT INTO coins(student_id, total_coins)
VALUES(3,0);
INSERT INTO coins(student_id, total_coins)
VALUES(4,0);
INSERT INTO coins(student_id, total_coins)
VALUES(5,0);
INSERT INTO coins(student_id, total_coins)
VALUES(6,0);
INSERT INTO coins(student_id, total_coins)
VALUES(7,0);
INSERT INTO coins(student_id, total_coins)
VALUES(8,0);
INSERT INTO coins(student_id, total_coins)
VALUES(9,0);
INSERT INTO coins(student_id, total_coins)
VALUES(10,0);
INSERT INTO coins(student_id, total_coins)
VALUES(11,0);
INSERT INTO coins(student_id, total_coins)
VALUES(12,0);
INSERT INTO coins(student_id, total_coins)
VALUES(13,0);
INSERT INTO coins(student_id, total_coins)
VALUES(14,0);
INSERT INTO coins(student_id, total_coins)
VALUES(15,0);
INSERT INTO coins(student_id, total_coins)
VALUES(16,0);
INSERT INTO coins(student_id, total_coins)
VALUES(17,0);
INSERT INTO coins(student_id, total_coins)
VALUES(18,0);
INSERT INTO coins(student_id, total_coins)
VALUES(19,0);
INSERT INTO coins(student_id, total_coins)
VALUES(20,0);

CREATE TABLE store (
  id serial primary key NOT NULL,
  student_id int,
  item1_purchased boolean,
  item2_purchased boolean,
  item3_purchased boolean,
  item4_purchased boolean,
  item5_purchased boolean
);

alter table store owner to islandhoptop;

INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(0, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(1, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(2, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(3, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(4, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(5, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(6, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(7, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(8, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(9, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(10, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(11, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(12, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(13, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(14, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(15, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(16, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(17, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(18, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(19, false, false, false, false, false);
INSERT INTO store(student_id, item1_purchased, item2_purchased, item3_purchased, item4_purchased, item5_purchased)
VALUES(20, false, false, false, false, false);




