package com.syl.gmall.controller;

import com.syl.pojo.UserAddress;
import com.syl.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Reference
    UserService userService;

    @RequestMapping(value = "/init")
    public UserAddress initOrder(@RequestParam(value = "userId") int userId){
         System.out.println("接收init请求!");
        return userService.getUserAdress(userId);
    }
}