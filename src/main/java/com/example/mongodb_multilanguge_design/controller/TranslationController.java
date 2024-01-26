package com.example.mongodb_multilanguge_design.controller;

import com.example.mongodb_multilanguge_design.dao.TranslationDao;
import com.example.mongodb_multilanguge_design.service.TranslationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("translation")
public class TranslationController {
    private final TranslationService translationService;

    @PostMapping
    public TranslationDao createTranslation(@RequestBody TranslationDao translationDao){
        return translationService.createTranslation(translationDao);
    }

    @GetMapping
    public List<TranslationDao> getAllTranslation(){
        return translationService.Alltranslation();
    }


}
