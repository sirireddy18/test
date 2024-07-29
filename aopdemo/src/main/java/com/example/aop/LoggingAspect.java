package com.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Before;


@Aspect
@Component
public class LoggingAspect{
	
	@Before("execution(* com.example.service.*.*(..))")
	public void logBefore() {
		System.out.println("Executing logging aspect");
	}
}