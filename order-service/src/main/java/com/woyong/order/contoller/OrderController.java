package com.woyong.order.contoller;

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
    @GetMapping("deductProduct")
    public String deductProduct(){
        System.out.println("调用orderService");
        return this.restTemplate.getForObject("http://stock-service/stock/deductProduct",String.class);
    }
}
