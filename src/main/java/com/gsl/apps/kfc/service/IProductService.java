package com.gsl.apps.kfc.service;

import com.gsl.apps.kfc.bean.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    void saveOrUpdate(Product product);

    void deleteById(Long id);

    void batchDelete(Long[] ids);

}
