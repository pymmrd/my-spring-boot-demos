package com.jifeng.springbootmybatisplus.service.impl;

import com.jifeng.springbootmybatisplus.entity.User;
import com.jifeng.springbootmybatisplus.mapper.UserMapper;
import com.jifeng.springbootmybatisplus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jifeng
 * @since 2022-03-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User selectByName(String name) {
        return userMapper.getUserByName(name);
    }
}
