package com.example.chapter03.config;

import com.example.chapter03.pojo.BussinessPerson;
import com.example.chapter03.pojo.definition.Person;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCTest {
    private static Logger log = Logger.getLogger(IoCTest.class);

    public static void main(String[] args) {
        ApplicationContext ctx
                = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = ctx.getBean(BussinessPerson.class);
        /* Animal animal = ctx.getBean(Dog.class);
        animal.use();*/
        /*log.info(user.getId() + "   " + user.getName());*/
        person.service();
    }
}
