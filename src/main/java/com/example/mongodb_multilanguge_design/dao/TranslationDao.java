package com.example.mongodb_multilanguge_design.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document("translation")
public class TranslationDao {
    @Id
    private String translationId;
    @DBRef
    private LanguageDao translationLanguage;
    private String translation;
}
