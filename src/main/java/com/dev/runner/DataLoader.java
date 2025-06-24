package com.dev.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.dev.entity.CitizenPlan;
import com.dev.repo.CitizenPlanRepository;


@Component
public class DataLoader  implements ApplicationRunner{
	
	
	@Autowired
	private CitizenPlanRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
		CitizenPlan c1 = new CitizenPlan();
		
		c1.setCitizenName("tony");
		
		c1.setGender("Male");
		
		
	}
	
	

}
