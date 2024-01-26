package com.example.mongodb_multilanguge_design.repository;

import com.example.mongodb_multilanguge_design.dao.TranslationDetailsDao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranslationDetailsRepository extends MongoRepository<TranslationDetailsDao,String> {

}
