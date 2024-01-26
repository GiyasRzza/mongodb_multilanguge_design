package com.example.mongodb_multilanguge_design.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("product")
public class ProductDao {
    @Id
    private String productId;
    private String productName;
    @DBRef
    TranslationDetailsDao translationDetails;
}
