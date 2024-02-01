CREATE TABLE IF NOT EXISTS `personaggi` (

    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `Nome` varchar(20),
    `Razza` varchar(50),
    `Eta` timestamp,
    `DataNascita` timestamp

    )ENGINE=InnoDB DEFAULT CHARSET=UTF8;

CREATE TABLE IF NOT EXISTS `film` (

    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `Nome` varchar(20),
    `Regista` varchar(50),
    `DataUscita` timestamp

    )ENGINE=InnoDB DEFAULT CHARSET=UTF8;

CREATE TABLE IF NOT EXISTS `abilita` (

    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `Abilita` varchar(20),
    `Potenza` varchar(50),
    `EroeID` int,
    FOREIGN KEY (EroeID) REFERENCES personaggi(id)

    )ENGINE=InnoDB DEFAULT CHARSET=UTF8;