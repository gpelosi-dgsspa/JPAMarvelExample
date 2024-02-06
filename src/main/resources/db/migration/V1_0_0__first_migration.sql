CREATE SCHEMA IF NOT EXISTS javamarvelexample;
CREATE TABLE personaggi (id integer NOT NULL AUTO_INCREMENT PRIMARY KEY,nome varchar(200),razza varchar(50),eta integer NULL,data_nascita timestamp NULL);
CREATE TABLE film (id integer NOT NULL AUTO_INCREMENT PRIMARY KEY,nome varchar(200),regista varchar(50),data_uscita timestamp NULL);
CREATE TABLE abilita (id integer NOT NULL AUTO_INCREMENT PRIMARY KEY,abilita varchar(200),potenza varchar(50),eroe_id int,FOREIGN KEY (eroe_id) REFERENCES personaggi(id));