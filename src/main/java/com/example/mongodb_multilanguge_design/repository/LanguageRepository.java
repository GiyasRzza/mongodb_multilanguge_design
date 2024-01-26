package com.example.mongodb_multilanguge_design.repository;

import com.example.mongodb_multilanguge_design.dao.LanguageDao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends MongoRepository<LanguageDao,String> {
}
