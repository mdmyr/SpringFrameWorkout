package com.springConstructorInjection;

//Simple driver class which holds the data about the 
//driver 
public class DriverClass {
	DriverCategory drivingCategory;

	
	
	public void getName() {
		System.out.println("Enter Name of the driver :");
	}
	public void  getDOB(){
		System.out.println("Enter the DOB :");
	}
	public void  getAddress() {
		System.out.println("Enter the Address Details : ");
	}
	
	//setting for the drivingCategory class
	public void setDrivingCategory(DriverCategory drivingCategory) {
		this.drivingCategory = drivingCategory;
	}
	



	
}
