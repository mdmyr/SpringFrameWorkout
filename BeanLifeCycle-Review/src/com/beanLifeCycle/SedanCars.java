package com.beanLifeCycle;

import org.springframework.stereotype.Component;

@Component
public class SedanCars implements vehicleInter {

	@Override
	public void start() {
		System.out.println("Starting Sedan Car");
	}

	@Override
	public void stop() {
		System.out.println("Stopping Sedan Car");
	}

}
