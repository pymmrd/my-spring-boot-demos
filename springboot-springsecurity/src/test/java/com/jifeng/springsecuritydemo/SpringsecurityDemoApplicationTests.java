package com.jifeng.springsecuritydemo;

import com.jifeng.springsecuritydemo.mbg.mapper.MenuMapper;
import com.jifeng.springsecuritydemo.mbg.mapper.UserMapper;
import com.jifeng.springsecuritydemo.mbg.model.User;
import com.jifeng.springsecuritydemo.mbg.model.UserExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class SpringsecurityDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private MenuMapper menuMapper;

//    @Test
//    void contextLoads() {
//    }
    @Test
    void testSelectAll(){
        UserExample userExample = new UserExample();
        System.out.println(userMapper.selectByExample(userExample));

    }

    @Test
    void testBCryptPasswordEncoder(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("1234");
        String encode2 = bCryptPasswordEncoder.encode("1234");
        System.out.println(encode);
        System.out.println(encode2);
    }

    @Test
    void createUser(){
        User user = new User();
        user.setUserName("zg");
        String pwd = "123";
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("1234");
        user.setNickName("hello");
        user.setEmail("a@b.com");
        user.setUserType("1");
        user.setPassword(encode);
        userMapper.insert(user);
    }

    @Test
    void testUserMapper(){
        System.out.println(menuMapper.selectPermByUserId(1L));
    }


}
