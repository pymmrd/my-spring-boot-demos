package com.jifeng.springsecuritydemo.controller;

import com.jifeng.springsecuritydemo.common.api.CommonResult;
import com.jifeng.springsecuritydemo.mbg.model.User;
import com.jifeng.springsecuritydemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService  loginService;

    @RequestMapping("/user/login")
    public CommonResult login(@RequestBody User user){

        return loginService.login(user);
    }

    @RequestMapping("/user/logout")
    public CommonResult logout(){
        return loginService.logout();
    }



}
