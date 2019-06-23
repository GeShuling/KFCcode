package com.gsl.apps.kfc.service.Impl;

import com.gsl.apps.kfc.bean.Order;
import com.gsl.apps.kfc.bean.OrderExample;
import com.gsl.apps.kfc.mapper.OrderMapper;
import com.gsl.apps.kfc.service.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Order> findAll() {
        OrderExample example = new OrderExample();
        return orderMapper.selectByExample(example);
    }

    @Override
    public void saveOrUpdate(Order order) {
        if(order.getId() == null){
            orderMapper.insert(order);
        }else {
            orderMapper.updateByPrimaryKey(order);
        }
    }

    @Override
    public void deleteById(Long id) {
        orderMapper.deleteByPrimaryKey(id);
    }

}
