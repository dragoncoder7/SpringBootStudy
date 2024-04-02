package com.example.springbootstudy.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Util {
    @Pointcut("execution(* com.example.springbootstudy.pojo.LogicalService.service())")
    public void pointcut() {

    }

    // 这里可以定义一些公共的方法和逻辑
    @Before("pointcut()")
    public void beforeAdvice() {
        System.out.println("执行前置通知");
    }


    // 这里可以定义一些后置通知的方法
    @After("pointcut()")
    public void afterAdvice() {
        System.out.println("执行后置通知");
    }

    //这里可以定义一些异常通知的方法
    @AfterThrowing("pointcut()")
    public void exceptionAdvice() {
        System.out.println("执行异常通知");
    }


    //这里可以定义一些最终通知的方法
    @AfterReturning("pointcut()")
    public void finalAdvice() {
        System.out.println("执行最终通知");
    }

    //这里可以定义一些环绕通知的方法
    //@Around("execution(* com.example.springbootstudy.pojo.*.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        beforeAdvice();
        joinPoint.proceed(); // 执行目标方法
        afterAdvice();
        return null;
    }

}
