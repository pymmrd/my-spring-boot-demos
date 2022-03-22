package com.jifeng.springbootmybatisplus.mapper;

import com.jifeng.springbootmybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jifeng
 * @since 2022-03-10
 */
public interface UserMapper extends BaseMapper<User> {
    public User getUserByName(String name);
}
