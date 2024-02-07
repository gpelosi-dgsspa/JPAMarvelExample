# JPAMarvelExample
***

## Indice
1.[Descrizione](#descrizione)
2.[Installazione](#installazione)
3.[Tecnologie](#tecnologie)

***

## Descrizione

L'applicazione JPAMarvelExample, a tema Supereroi, si basa su tecnologia Spring/SpringBoot. Sviluppata con la versione Java 17, l'Applicazione e' stata creata per interfacciarsi con un Database
relazionale H2 in-memory attraverso l'utilizzo delle specifiche JPA ed  un tool di migrazione degli script Flyway.
Tramite l'effettuazione di diverse query, viene interrogato il database il cui Schema è composto da tre tabelle:

1. Personaggio
2. Abilita'
3. Film.


I risultati delle query effettuate possono essere visualizzati semplicemente all'avvio di SpringBoot.

***
## Installazione 

- Installazione Java versione 17
- Clonazione del progetto: git clone (https://github.com/gpelosi-dgsspa/JPAMarvelExample)
- Avviare l'applicativo
- Ai fini della visualizzazione del database, collegarsi alla URL [localhost:8080/h2console](localhost:8080/h2console)

***
## Tecnologie

1. Java 17
2. SpringBoot 3.2.2
3. Hibernate 6.4.2
4. H2 In-Memory
5. Flyway
***
