package com.gsl.apps.kfc.web.controller;

import com.gsl.apps.kfc.bean.OrderLine;
import com.gsl.apps.kfc.service.IOrderLineService;
import com.gsl.apps.kfc.utils.Message;
import com.gsl.apps.kfc.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderLine")
public class OrderLineController {

    @Autowired
    private IOrderLineService orderLineService;

    @GetMapping("findAll")
    private Message findAll(){
        List<OrderLine> list = orderLineService.findAll();
        return MessageUtil.success(list);
    }

    @PostMapping("saveOrUpdate")
    private Message saveOrUpdate(OrderLine line){
        orderLineService.saveOrUpdate(line);
        return MessageUtil.success("操作成功");
    }

    @GetMapping("deleteById")
    private Message deleteById(Integer id){
        orderLineService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

}
