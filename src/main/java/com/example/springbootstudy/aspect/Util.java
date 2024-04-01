package com.example.springbootstudy.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Util {

    // 这里可以定义一些公共的方法和逻辑
    @Before("execution(* com.example.springbootstudy.pojo.LogicalService.service())")
    public void beforeAdvice() {
        System.out.println("执行前置通知");
    }


    // 这里可以定义一些后置通知的方法
    @After("execution(* com.example.springbootstudy.pojo.LogicalService.service())")

    public void afterAdvice() {
        System.out.println("执行后置通知");
    }

    //这里可以定义一些异常通知的方法
    public void exceptionAdvice() {
        System.out.println("执行异常通知");
    }


    //这里可以定义一些最终通知的方法

    public void finalAdvice() {
        System.out.println("执行最终通知");
    }

    //这里可以定义一些环绕通知的方法
    @Around("execution(* com.example.springbootstudy.pojo.*.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        beforeAdvice();
        joinPoint.proceed(); // 执行目标方法
        afterAdvice();
        return null;
    }

}
