package com.example.chapter03.pojo;

import com.example.chapter03.pojo.definition.Animal;
import com.example.chapter03.pojo.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BussinessPerson implements Person {

    @Autowired(required = false)
    private Animal animal = null;
    /**
     * 由于Animal接口中存在多个子类实现Animal接口，故不可自动注入
     * 我们只是将属性的名称从animal 修改为了dog，那么我们再测试的时候，
     * 你可以看到是采用狗来提供服务的。那是因为＠A u tow ired 提供这
     * 样的规则， 首先它会根据类型找到对应的Bean,如果对应类型的Bean
     * 不是唯一的，那么它会根据其属性名称和Bean 的名称进行匹配。
     * 如果匹配得上，就会使用该Bean ：如果还无法匹配，就会抛出异常。
     */

    @Override
    public void service() {
       this.animal.use();
    }

    @Override
    public void setAnimal(Animal animal) {

        this.animal = animal;
    }
}
