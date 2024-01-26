package com.example.mongodb_multilanguge_design.service;

import com.example.mongodb_multilanguge_design.dao.TranslationDetailsDao;
import com.example.mongodb_multilanguge_design.repository.TranslationDetailsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TranslationDetailsService {
    private final TranslationDetailsRepository translationDetailsRepository;
    public TranslationDetailsDao createTranslation(TranslationDetailsDao translationDao) {
        return translationDetailsRepository.save(translationDao);
    }

    public List<TranslationDetailsDao> Alltranslation() {
        return  translationDetailsRepository.findAll();
    }


}
