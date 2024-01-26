package com.example.mongodb_multilanguge_design.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document("language")
public class LanguageDao {
    @Id
    private String languageId;
    private String languageName;
}
