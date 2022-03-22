package com.jifeng.springbootmybatisplus;

import java.util.List;

import com.jifeng.springbootmybatisplus.entity.User;
import com.jifeng.springbootmybatisplus.service.IUserService;
import com.jifeng.springbootmybatisplus.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class UserTests {

    @Autowired
    private IUserService userService;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userService.list();
        //Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void testGetUserByName(){
        System.out.println("Test get user by name....");
        System.out.println(userService.selectByName("Jone"));
    }

}
