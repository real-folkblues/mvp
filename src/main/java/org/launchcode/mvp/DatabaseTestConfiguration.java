package org.launchcode.mvp;

import org.launchcode.mvp.data.KanjiFormRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseTestConfiguration {

    @Bean
    public CommandLineRunner testDatabaseConnection(KanjiFormRepository kanjiFormRepository) {
        return args -> {
            // Replace "MyRepository" with your actual repository
            // Replace "findAll()" with an appropriate method to test the connection
            System.out.println("Testing database connection...");
            kanjiFormRepository.findAll();
            System.out.println("Successfully connected to the database.");
        };
    }
}
