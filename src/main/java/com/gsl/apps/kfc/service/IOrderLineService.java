package com.gsl.apps.kfc.service;

import com.gsl.apps.kfc.bean.OrderLine;

import java.util.List;

public interface IOrderLineService {

    List<OrderLine> findAll();

    void saveOrUpdate(OrderLine orderLine);

    void deleteById(Integer id);

}
