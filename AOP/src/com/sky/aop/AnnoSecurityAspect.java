package com.sky.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
@Aspect
public class AnnoSecurityAspect {
	@Before ("execution(* com.sky.aop.ApplicationService.*(..))") public void VerifyApplicationForm() {
		System.out.println("Ina anno before call");
	}
	@After ("execution(* com.sky.aop.ApplicationService.*(..))") public void processResults() {
		System.out.println("Process Result");
	}
	
	@Before("@annotation(auditable)") public void doAccessCheck4(Auditable auditable) 
	{System.out.print("do access check 4"+ " "+ auditable.value());
	
	}
}
