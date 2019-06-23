package com.gsl.apps.kfc.service;

import com.gsl.apps.kfc.bean.Order;

import java.util.List;

public interface IOrderService {

    List<Order> findAll();

    void saveOrUpdate(Order order);

    void deleteById(Long id);

}
