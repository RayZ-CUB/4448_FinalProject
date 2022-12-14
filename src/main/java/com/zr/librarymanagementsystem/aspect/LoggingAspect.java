package com.zr.librarymanagementsystem.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Pointcut("execution(* com.zr.librarymanagementsystem..*(..))"
            + "&& !@annotation(com.zr.librarymanagementsystem.aspect.NoLog)"
            + "&& !@target(com.zr.librarymanagementsystem.aspect.NoLog)")
    public void logPointcut(){
    }

    @Before("logPointcut()")
    public void logAllMethodCallsAdvice(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + " medthod is running");
    }
}
