package com.example.chapter03.config;

import com.example.chapter03.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.chapter03"})
public class AppConfig {
   /* @Bean(name = "user")
    public User initUser(){
        User user = new User();
        user.setId(1L);
        user.setName("faasdf");
        user.setRemark("advice");
        return user;
    }*/
}
