package com.jifeng.springsecuritydemo.service.impl;

import com.jifeng.springsecuritydemo.mbg.mapper.MenuMapper;
import com.jifeng.springsecuritydemo.mbg.mapper.UserMapper;
import com.jifeng.springsecuritydemo.mbg.model.LoginUser;
import com.jifeng.springsecuritydemo.mbg.model.User;
import com.jifeng.springsecuritydemo.mbg.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class UserDetailServiceImpl  implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(username);
        List<User> userList = userMapper.selectByExample(userExample);
        if(userList.isEmpty() || userList.size() >1)//期望获得一条结果
            //业务处理，一般是抛出异常或者直接返回错误结果
            throw  new RuntimeException("用户名或者密码错误");
        User user = userList.get(0);
        //TODO 查询对应的权限的信息
        List<String> list = new ArrayList<>(menuMapper.selectPermByUserId(user.getId()));
        return new LoginUser(user, list);
    }
}
