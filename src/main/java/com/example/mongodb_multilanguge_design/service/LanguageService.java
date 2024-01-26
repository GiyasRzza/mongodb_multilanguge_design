package com.example.mongodb_multilanguge_design.service;

import com.example.mongodb_multilanguge_design.dao.LanguageDao;
import com.example.mongodb_multilanguge_design.repository.LanguageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LanguageService {
    private final LanguageRepository languageRepository;
    public LanguageDao createLanguage(LanguageDao languageDao) {
       return languageRepository.save(languageDao);
    }
}
