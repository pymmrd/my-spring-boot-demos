package com.jifeng.springsecuritydemo.handler;

import com.alibaba.fastjson.JSON;
import com.jifeng.springsecuritydemo.common.api.CommonResult;
import com.jifeng.springsecuritydemo.common.utils.WebUtils;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 认证失败的处理器
 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        CommonResult<Object> forbidden = CommonResult.unauthorized(null);
        String s = JSON.toJSONString(forbidden);
        WebUtils.renderString(response, s);


    }
}
