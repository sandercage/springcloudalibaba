package com.qyc.order.controller;

import com.qyc.order.feign.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    StockService stockService;

    @GetMapping("/add")
    public String add() {
//        restTemplate.getForObject("http://stock-service/stock/dec", String.class);
        stockService.decStock();
        return "下订单";
    }
}
