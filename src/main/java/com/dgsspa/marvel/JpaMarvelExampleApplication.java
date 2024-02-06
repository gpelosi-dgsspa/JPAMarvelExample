package com.dgsspa.marvel;

import com.dgsspa.marvel.entity.Abilita;
import com.dgsspa.marvel.services.FilmService;
import com.dgsspa.marvel.services.PersonaggiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "com.dgsspa.marvel.repository")
@ComponentScan(basePackages = {"com.dgsspa.marvel.*"})
@EntityScan("com.dgsspa.marvel.entity")
public class JpaMarvelExampleApplication {

	private static final Logger log = LoggerFactory.getLogger(JpaMarvelExampleApplication.class);

	@Autowired
	PersonaggiService personaggiService;
	@Autowired
	FilmService filmService;

	public static void main(String[] args) {
		SpringApplication.run(JpaMarvelExampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner stampa(PersonaggiService personaggiService) {
		return (args) -> {
			log.info("findByNome() Personaggi");
			log.info("-------------------------------");
			personaggiService.findByNome("Spider-Man")
					.getEroeId().forEach(abilita -> log.info(abilita.getAbilita()));

			log.info("\n");
			log.info("findByNome() Film");
			log.info("-------------------------------");
			filmService.stampaPersonaggiByTitoloFilm("The Avengers");

			log.info("countAllFilm() Personaggi");
			log.info("-------------------------------");
			log.info(personaggiService.countAllFilm().toString());
		};
	}

}
