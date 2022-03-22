package com.jifeng.springsecuritydemo.handler;

import com.alibaba.fastjson.JSON;
import com.jifeng.springsecuritydemo.common.api.CommonResult;
import com.jifeng.springsecuritydemo.common.utils.WebUtils;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 权限不够处理
 */
@Component
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        CommonResult<Object> forbidden = CommonResult.forbidden(null);
        String s = JSON.toJSONString(forbidden);
        WebUtils.renderString(response, s);

    }
}
