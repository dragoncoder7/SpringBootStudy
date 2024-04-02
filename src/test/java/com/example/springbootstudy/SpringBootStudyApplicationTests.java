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
    public static void main(String[] args) {
        // 创建Spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        // 从容器中获取bean
        LogicalService logicalService = context.getBean("landlord",LogicalService.class);
        // 调用bean的方法
        logicalService.service();

        // 关闭Spring容器
        context.close();
    }

}
