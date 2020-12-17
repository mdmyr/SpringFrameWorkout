package com.beanLifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.beanLifeCycle")
@PropertySource("classpath:email.properties")
public class SedanConfigClass {
	

	
	@Bean
	public SedanCars sedanCars() {
		System.out.println("Setting thru Bean");
		SedanCars sedanCar = new SedanCars();
		return sedanCar;
	}
	
	@Bean
	public SedanMaster sedanMaster() {
		return new SedanMaster();
	}

}
 