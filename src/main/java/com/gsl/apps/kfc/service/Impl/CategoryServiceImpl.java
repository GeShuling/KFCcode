package com.gsl.apps.kfc.service.Impl;

import com.gsl.apps.kfc.bean.Category;
import com.gsl.apps.kfc.bean.CategoryExample;
import com.gsl.apps.kfc.mapper.CategoryMapper;
import com.gsl.apps.kfc.service.ICategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findAll() {
        CategoryExample example = new CategoryExample();
        return categoryMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(Category category) {
        if(category.getId() == null){
            categoryMapper.insert(category);
        }else {
            categoryMapper.updateByPrimaryKey(category);
        }
    }

    @Override
    public void deleteById(Long id) {
        categoryMapper.deleteByPrimaryKey(id);
    }
}
