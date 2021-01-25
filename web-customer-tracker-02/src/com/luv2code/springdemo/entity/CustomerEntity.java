package com.luv2code.springdemo.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Customer Entity.


@Entity
@Table(name = "customer")
public class CustomerEntity {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id	
	private String ID;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name = "email")
	private String email;
	

	
	//setter and getters 
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "CustomerEntity [ID=" + ID + ", first_Name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + "]";
	}

	public String getFirst_Name() {
		return first_name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_name = first_Name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
