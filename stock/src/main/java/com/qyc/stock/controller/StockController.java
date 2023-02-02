package com.qyc.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/dec")
    public String decStock() {
        System.out.println("减库存");
        return "减库存";
    }
}
