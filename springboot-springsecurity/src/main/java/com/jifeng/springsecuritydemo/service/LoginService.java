package com.jifeng.springsecuritydemo.service;

import com.jifeng.springsecuritydemo.common.api.CommonResult;
import com.jifeng.springsecuritydemo.mbg.model.User;

public interface LoginService {
    CommonResult login(User user);


    CommonResult logout();
}
