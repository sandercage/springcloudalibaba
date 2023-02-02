package com.qyc.order.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@FeignClient(name = "stock-service", path = "/stock")
public interface StockService {

    @RequestMapping("/dec")
    public String decStock();
}
