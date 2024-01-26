package com.example.mongodb_multilanguge_design.service;

import com.example.mongodb_multilanguge_design.dao.TranslationDao;
import com.example.mongodb_multilanguge_design.repository.TranslationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TranslationService {
    private final TranslationRepository translationRepository;
    public TranslationDao createTranslation(TranslationDao translationDao) {
        return translationRepository.save(translationDao);
    }

    public List<TranslationDao> Alltranslation() {
        return  translationRepository.findAll();
    }
}
