package com.example.mongodb_multilanguge_design.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("translationDetails")
public class TranslationDetailsDao {
    @Id
    String translationDetailsId;
    String originalText;
    @DBRef
    LanguageDao originalLanguage;
    @DBRef
    List<TranslationDao> translation;
}
