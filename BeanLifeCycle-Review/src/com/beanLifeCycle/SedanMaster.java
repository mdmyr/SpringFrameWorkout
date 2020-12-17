package com.beanLifeCycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SedanMaster implements vehicleInter {
@Value("${foo.email}")
	private String email;
@Value("${foo.location}")
	private String location;
	
	


public String getEmail() {
	return email;
}

public String getlocation() {
	return location;
}


	@Autowired
	SedanCars sedanCar;
	
	@Override
	public void start() {
		sedanCar.start(); 
	}

	@Override
	public void stop() {
		sedanCar.stop();
	}
	
	
	public void status() {
		System.out.println(getEmail());
		System.out.println(getlocation());
	}
	

}
