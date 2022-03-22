package com.jifeng.springbootmybatisplus.service;

import com.jifeng.springbootmybatisplus.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jifeng
 * @since 2022-03-10
 */
public interface IUserService extends IService<User> {

    public User selectByName(String name);

}
