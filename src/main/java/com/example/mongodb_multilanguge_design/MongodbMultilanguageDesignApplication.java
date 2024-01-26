package com.example.mongodb_multilanguge_design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongodbMultilanguageDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbMultilanguageDesignApplication.class, args);
    }

}
