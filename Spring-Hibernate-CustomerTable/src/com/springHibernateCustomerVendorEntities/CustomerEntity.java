package com.springHibernateCustomerVendorEntities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


// define table as entity and the define the tablename here
@Entity
@Table(name = "customer")
public class CustomerEntity {

	// Looks like identifier is important.
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private String id;
	
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name ="last_name")
	private String lastName;
	
	/**
	 * 
	 */
	@Column(name="locaton")
	private String locaton;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLocaton() {
		return locaton;
	}

	public void setLocaton(String locaton) {
		this.locaton = locaton;
	}

	public CustomerEntity( String firstName, String lastName, String locaton) {
		super();
		//this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.locaton = locaton;
	}

	// this is import to query the data.
	public CustomerEntity() {
		
	}
	
	
}
