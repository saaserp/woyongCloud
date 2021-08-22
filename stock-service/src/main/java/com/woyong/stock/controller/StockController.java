package com.woyong.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {
    @GetMapping("deductProduct")
    public String deductProduct(){
        System.out.println("调用stockService");
        return "success";
    }
}
