package com.springmvcDropdown;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Student {

		private String firstName;
		private String lastName;
		private String location;
		private String country;
		public void setOperatingSystems(ArrayList<String> operatingSystems) {
			this.operatingSystems = operatingSystems;
		}
		private String language;
		//introducing the country drop down
		//private LinkedHashMap<String, String> country = new LinkedHashMap<String, String>();
		private ArrayList<String> operatingSystems;
	
		private ArrayList<String> javaOperatingSystems = new ArrayList<String>();
		
		
	
		public void setCountry(String country) {
			this.country = country;
		}



		public ArrayList<String> getJavaOperatingSystems() {
			return javaOperatingSystems;
		}



		public ArrayList<String> getOperatingSystems() {
			return operatingSystems;
		}
		

		public String getLanguage() {
			return language;
		}



		public void setLanguage(String language) {
			this.language = language;
		}



		public Student() {
			System.out.println(" Student Class Invoked, country list in the constructor0");
			//set the country list 
			
//			country.put("IN", "India");
//			country.put("US", "USA");
//			country.put("PK", "Pakistan");
//			country.put("FR", "France");
//			country.put("CAN", "Canada");
//			country.put("NP", "Nepal");
			
			
			javaOperatingSystems.add("Linux");
			javaOperatingSystems.add("Windows");
			javaOperatingSystems.add("Mac");
//			
		}
		
		
		
//		public LinkedHashMap<String, String> getCountry2() {
//			return country;
//		}



		public String getFirstName() {
			return firstName;
		}
		public String getCountry() {
			return country;
		}



		public void setFirstName(String firstName) {
			System.out.println("sET Fname");
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		
		
	
}
