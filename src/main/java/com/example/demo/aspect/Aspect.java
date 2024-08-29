package com.example.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author wuhaoyu
 * @date 2024/8/29  下午10:07
 * @description:
 */
@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {

    //注意这里的Pointcut的写法，即在用*匹配所有文件之后，最后一个*是用来匹配所有方法的，千万不要忘记。
    @Pointcut("execution(* com.example.demo.service.*.*(..))")
    public void catchs(){

    }

    @Before("catchs()")
    public void before(){
        System.out.println("before run");
    }

    @After("catchs()")
    public void after(){
        System.out.println("after run");
    }
}
