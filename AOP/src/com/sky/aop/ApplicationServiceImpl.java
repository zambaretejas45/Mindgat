package com.sky.aop;

import org.springframework.stereotype.Service;
@Service
public class ApplicationServiceImpl implements ApplicationService{

	@Override
	public void processApplication() {
		// TODO Auto-generated method stub
		System.out.println("Process Application form");
		
	}
 @Auditable(value = "check")
	@Override
	public String processApplicationWithAudit() {
	System.out.println("Process Application Form");
		return "sucess";
	}

}
