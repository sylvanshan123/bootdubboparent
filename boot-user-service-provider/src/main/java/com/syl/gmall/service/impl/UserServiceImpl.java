package com.syl.gmall.service.impl;

import com.syl.pojo.UserAddress;
import com.syl.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Override
    public UserAddress getUserAdress(int userId) {
        System.out.println("userId=" + userId);
        UserAddress userAddress = new UserAddress();
        userAddress.setId(userId);
        userAddress.setUsername("山坤");
        userAddress.setAddressList(Arrays.asList("四川省","成都市","武侯区"));
        return userAddress;
    }
}