package com.gsl.apps.kfc.service.Impl;

import com.gsl.apps.kfc.bean.Product;
import com.gsl.apps.kfc.bean.ProductExample;
import com.gsl.apps.kfc.mapper.ProductMapper;
import com.gsl.apps.kfc.service.IProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        ProductExample example = new ProductExample();
        return productMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(Product product) {
        if(product.getId() == null){
            productMapper.insert(product);
        }else {
            productMapper.updateByPrimaryKey(product);
        }
    }

    @Override
    public void deleteById(Long id) {
        productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchDelete(Long[] ids) {
        for (Long id : ids){
            productMapper.deleteByPrimaryKey(id);
        }
    }
}
