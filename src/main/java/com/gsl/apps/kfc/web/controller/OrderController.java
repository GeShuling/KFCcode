package com.gsl.apps.kfc.web.controller;

import com.gsl.apps.kfc.bean.Order;
import com.gsl.apps.kfc.service.IOrderService;
import com.gsl.apps.kfc.utils.Message;
import com.gsl.apps.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @GetMapping("findAll")
    private Message findAll(){
        List<Order> list = orderService.findAll();
        return MessageUtil.success(list);
    }

    @PostMapping("saveOrUpdate")
    private Message saveOrUpdate(Order order){
        orderService.saveOrUpdate(order);
        return MessageUtil.success("操作成功");
    }

    @GetMapping("deleteById")
    private Message deleteById(Long id){
        orderService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

}
