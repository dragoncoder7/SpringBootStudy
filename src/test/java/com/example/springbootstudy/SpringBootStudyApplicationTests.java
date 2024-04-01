package com.example.springbootstudy;

import com.example.springbootstudy.pojo.LogicalService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class SpringBootStudyApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public void main(String[] args) {
        // 创建Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        // 从容器中获取bean
        LogicalService logicalService = context.getBean("landlord",LogicalService.class);
        // 调用bean的方法
        logicalService.service();
        /*ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Landlord landlord = (Landlord) context.getBean("landlord", Landlord.class);
        landlord.service();*/
    }

}
