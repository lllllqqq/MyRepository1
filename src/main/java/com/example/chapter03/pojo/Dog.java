package com.example.chapter03.pojo;

import com.example.chapter03.pojo.definition.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public void use() {
        System.out.println("狗【"
                + Dog.class.getSimpleName() + " 】是看门用的。");

    }
}
