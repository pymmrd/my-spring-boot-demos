package com.jifeng.springsecuritydemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.jifeng.springsecuritydemo.mbg.mapper")
public class MybatisConfig {
}
