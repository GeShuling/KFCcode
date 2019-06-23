package com.gsl.apps.kfc.web.controller;

import com.gsl.apps.kfc.bean.Category;
import com.gsl.apps.kfc.service.ICategoryService;
import com.gsl.apps.kfc.utils.Message;
import com.gsl.apps.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("findAll")
    private Message finAll(){
        List<Category> list = categoryService.findAll();
        return MessageUtil.success(list);
    }

    @PostMapping("saveOrUpdate")
    private Message saveOrUpdate(Category category){
        categoryService.saveOrUpdate(category);
        return MessageUtil.success("操作成功");
    }

    @GetMapping("deleteById")
    private Message deleteById(Long id){
        categoryService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

}
