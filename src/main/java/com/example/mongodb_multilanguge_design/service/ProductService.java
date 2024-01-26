package com.example.mongodb_multilanguge_design.service;

import com.example.mongodb_multilanguge_design.dao.ProductDao;
import com.example.mongodb_multilanguge_design.dao.TranslationDao;
import com.example.mongodb_multilanguge_design.dao.TranslationDetailsDao;
import com.example.mongodb_multilanguge_design.repository.ProductRepository;
import com.example.mongodb_multilanguge_design.repository.TranslationDetailsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final TranslationDetailsRepository translationDetailsRepository;
    public ProductDao createProduct(ProductDao productDao) {
       return   productRepository.save(productDao);
    }

    public ProductDao updateProduct(String productId, String translationDetailsId) {
       ProductDao productDao =  productRepository.findById(productId).get();
        TranslationDetailsDao translationDetailsDao = translationDetailsRepository.findById(translationDetailsId).get();
        productDao.setTranslationDetails(translationDetailsDao);
        return productRepository.save(productDao);
    }
}
