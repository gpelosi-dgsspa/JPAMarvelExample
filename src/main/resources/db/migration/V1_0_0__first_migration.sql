CREATE SCHEMA IF NOT EXISTS javamarvelexample;
CREATE TABLE personaggi (id integer NOT NULL AUTO_INCREMENT PRIMARY KEY,Nome varchar(200),Razza varchar(50),Eta integer NULL,DataNascita timestamp NULL);
CREATE TABLE film (id int NOT NULL AUTO_INCREMENT PRIMARY KEY,Nome varchar(200),Regista varchar(50),DataUscita timestamp NULL);
CREATE TABLE abilita (id int NOT NULL AUTO_INCREMENT PRIMARY KEY,Abilita varchar(200),Potenza varchar(50),EroeID int,FOREIGN KEY (EroeID) REFERENCES personaggi(id));