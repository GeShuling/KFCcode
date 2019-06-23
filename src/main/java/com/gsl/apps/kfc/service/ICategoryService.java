package com.gsl.apps.kfc.service;

import com.gsl.apps.kfc.bean.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();

    void saveOrUpdate(Category category);

    void deleteById(Long id);

}
