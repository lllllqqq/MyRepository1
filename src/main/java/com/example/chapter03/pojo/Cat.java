package com.example.chapter03.pojo;

import com.example.chapter03.pojo.definition.Animal;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    @Override
    public void use() {
        System.out.println("猫【"
                + Cat.class.getSimpleName() + " 】是抓老鼠用的。");

    }
}
