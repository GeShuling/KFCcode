package com.gsl.apps.kfc.service;

import com.gsl.apps.kfc.bean.Role;

import java.util.List;

public interface IRoleService {

    List<Role> findAll();

    void saveOrUpdate(Role role);

    void deleteById(Long id);

}
