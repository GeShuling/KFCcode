package com.gsl.apps.kfc.service;

import com.gsl.apps.kfc.bean.UserRole;

import java.util.List;

public interface IUserRoleService {

    List<UserRole> findAll();

    void saveOrUpdate(UserRole userRole);

    void deleteById(Long id);

}
