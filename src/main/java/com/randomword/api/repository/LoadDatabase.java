package com.randomword.api.repository;

import com.randomword.api.model.RandomWord;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    private static final Logger logger = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(RandomWordRepository randomWorRepository) {
        return args -> {
            randomWorRepository.save(new RandomWord("Colombia"));
            randomWorRepository.save(new RandomWord("Argentina"));
            randomWorRepository.save(new RandomWord("Brasil"));
            randomWorRepository.save(new RandomWord("Chile"));
            randomWorRepository.save(new RandomWord("Peru"));
            randomWorRepository.save(new RandomWord("Venezuela"));
            logger.info("Preloading " + randomWorRepository.count() + " words");
        };
    }
}
