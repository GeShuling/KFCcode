package com.gsl.apps.kfc.service;

import com.gsl.apps.kfc.bean.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    void saveOrUpdate(User user);

    void deleteById(Long id);

}
