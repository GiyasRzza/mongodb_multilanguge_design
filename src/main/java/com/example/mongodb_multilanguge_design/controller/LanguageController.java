package com.example.mongodb_multilanguge_design.controller;

import com.example.mongodb_multilanguge_design.dao.LanguageDao;
import com.example.mongodb_multilanguge_design.service.LanguageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("language")
public class LanguageController {
    private final LanguageService languageService;
    @PostMapping
    public LanguageDao createLanguage(@RequestBody LanguageDao languageDao){
        return  languageService.createLanguage(languageDao);
    }
}
