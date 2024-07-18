DROP DATABASE IF EXISTS human_friends;
CREATE DATABASE human_friends;
USE human_friends;

CREATE TABLE pets (
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    category VARCHAR(45) NOT NULL,
	view VARCHAR(45) NOT NULL,
	name VARCHAR(45) NOT NULL,
	birthday DATE NOT NULL,
	command VARCHAR(100)
);


CREATE TABLE pack_animals (
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    category VARCHAR(45) NOT NULL,
	view VARCHAR(45) NOT NULL,
	name VARCHAR(45) NOT NULL,
	birthday DATE NOT NULL,
	command VARCHAR(100)
);


INSERT INTO pets (category, view, name, birthday, command)
VALUES
('pets', 'cat', 'Мурзилка', '2022-03-11', 'бегает, мяукает, сидит, играет'),
('pets', 'dog', 'Купер', '2018-04-12', 'бегает, лает, сидит, здоровается'),
('pets', 'humster', 'Сема', '2023-12-08', 'бегает, лежит, играет'),
('pets', 'cat', 'Карандаш', '2017-07-20', 'бегает, мяукает, сидит, играет');

INSERT INTO pack_animals (category, view, name, birthday, command)
VALUES
('pack_animals', 'camel', 'Самсон', '2014-04-24', 'ходит, сидит'),
('pack_animals', 'donkey', 'Иа', '2018-04-12', 'ходит, лежит'),
('pack_animals', 'horse', 'Белла', '2023-02-08', 'бегает, ходит, лежит, перепрыгивает через препятствия'),
('pack_animals', 'camel', 'Арамис', '2017-07-20', 'ходит, сидит, плюет');


DELETE FROM pack_animals WHERE view = 'camel';


CREATE TABLE сubs (
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    category VARCHAR(45) NOT NULL,
	view VARCHAR(45) NOT NULL,
	name VARCHAR(45) NOT NULL,
	birthday DATE NOT NULL,
	command VARCHAR(100)
);


INSERT INTO сubs (category, view, name, birthday, command)
SELECT category, view, name, birthday, command
FROM pets
WHERE DATEDIFF (CURDATE(), birthday) BETWEEN 365 AND 1095
UNION
SELECT category, view, name, birthday, command
FROM pack_animals
WHERE DATEDIFF (CURDATE(), birthday) BETWEEN 365 AND 1095;

UPDATE сubs SET category = 'cubs';

SELECT category, view, name, birthday, command,
CONCAT(CAST(TIMESTAMPDIFF(YEAR, birthday, NOW()) AS CHAR), ",", 
	CAST(MOD(TIMESTAMPDIFF(MONTH, birthday, NOW()), 12)  AS CHAR), " года") AS age 
FROM сubs
WHERE TIMESTAMPDIFF(MONTH, birthday, NOW()) BETWEEN 12 AND 36; 


CREATE TABLE all_tables (
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    category VARCHAR(45) NOT NULL,
	view VARCHAR(45) NOT NULL,
	name VARCHAR(45) NOT NULL,
	birthday DATE NOT NULL,
	command VARCHAR(100)
);

INSERT INTO all_tables (category, view, name, birthday, command)
SELECT category, view, name, birthday, command
FROM pets
UNION all
SELECT category, view, name, birthday, command
FROM pack_animals
UNION all
SELECT category, view, name, birthday, command
FROM сubs;

SELECT * FROM all_tables;





