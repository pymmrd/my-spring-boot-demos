package com.jifeng.springsecuritydemo.service.impl;

import com.jifeng.springsecuritydemo.common.api.CommonResult;
import com.jifeng.springsecuritydemo.common.utils.JwtTokenUtil;
import com.jifeng.springsecuritydemo.common.utils.RedisCacheUtil;
import com.jifeng.springsecuritydemo.mbg.model.LoginUser;
import com.jifeng.springsecuritydemo.mbg.model.User;
import com.jifeng.springsecuritydemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private RedisCacheUtil redisCacheUtil;

    @Override
    public CommonResult login(User user) {
        //AuthenticationManager authenticate()进行用户认证
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                user.getUserName(), user.getPassword()
        );
        Authentication authenticate = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
        if (Objects.isNull(authenticate)){
            throw new RuntimeException("登录失败");
        }
        LoginUser principal = (LoginUser) authenticate.getPrincipal();
        String userid = principal.getUser().getId().toString();
        String token = jwtTokenUtil.generateToken(principal);
        Map<String, String> map = new HashMap<>();
        map.put("token", token);
        redisCacheUtil.set("login:" + userid,  principal);
        return CommonResult.success(map, "登录成功");
    }

    @Override
    public CommonResult logout() {
        //获取SecurityContextHolder中的用户名
        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        String username = loginUser.getUsername();
        //删除redis
        redisCacheUtil.remove("login:" + username);
        return CommonResult.success(null, "退出登录成功");
    }
}
