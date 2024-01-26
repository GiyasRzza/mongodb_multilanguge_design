package com.example.mongodb_multilanguge_design.controller;

import com.example.mongodb_multilanguge_design.dao.TranslationDao;
import com.example.mongodb_multilanguge_design.dao.TranslationDetailsDao;
import com.example.mongodb_multilanguge_design.service.TranslationDetailsService;
import com.example.mongodb_multilanguge_design.service.TranslationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("translationDetails")
public class TranslationDetailsController {
    private final TranslationDetailsService translationDetailsService;

    @PostMapping
    public TranslationDetailsDao createTranslation(@RequestBody TranslationDetailsDao translationDao){
        return translationDetailsService.createTranslation(translationDao);
    }

    @GetMapping
    public List<TranslationDetailsDao> getAllTranslation(){
        return translationDetailsService.Alltranslation();
    }
}
