CREATE TABLE personaggi (id integer NOT NULL AUTO_INCREMENT PRIMARY KEY,Nome varchar(20),Razza varchar(50),Eta timestamp NULL,DataNascita timestamp NULL) ;
CREATE TABLE film (id int NOT NULL AUTO_INCREMENT PRIMARY KEY,Nome varchar(20),Regista varchar(50),DataUscita timestamp NULL);
CREATE TABLE abilita (id int NOT NULL AUTO_INCREMENT PRIMARY KEY,Abilita varchar(20),Potenza varchar(50),EroeID int,FOREIGN KEY (EroeID) REFERENCES personaggi(id));
