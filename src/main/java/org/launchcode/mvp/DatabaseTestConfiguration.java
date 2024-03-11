package org.launchcode.mvp;


import org.launchcode.mvp.data.KanjiRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseTestConfiguration {

    @Bean
    public CommandLineRunner testDatabaseConnection(KanjiRepository kanjiRepository) {
        return args -> {

            System.out.println("Testing database connection...");
            kanjiRepository.findAll();
            System.out.println("Successfully connected to the database.");
        };
    }
}
