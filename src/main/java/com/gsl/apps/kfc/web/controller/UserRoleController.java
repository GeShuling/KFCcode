package com.gsl.apps.kfc.web.controller;

import com.gsl.apps.kfc.bean.UserRole;
import com.gsl.apps.kfc.service.IUserRoleService;
import com.gsl.apps.kfc.utils.Message;
import com.gsl.apps.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userRole")
public class UserRoleController {

    @Autowired
    private IUserRoleService userRoleService;

    @GetMapping("findAll")
    private Message findAll(){
        List<UserRole> list = userRoleService.findAll();
        return MessageUtil.success(list);
    }

    @PostMapping("saveOrUpdate")
    private Message saveOrUpdate(UserRole userRole){
        userRoleService.saveOrUpdate(userRole);
        return MessageUtil.success("操作成功");
    }

    @GetMapping("deleteById")
    private Message deleteById(Long id){
        userRoleService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

}
