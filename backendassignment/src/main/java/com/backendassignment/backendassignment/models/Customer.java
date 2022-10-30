package com.backendassignment.backendassignment.models;

//import java.beans.Transient;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//import @javax.persistence.Transient;


@Document(collection = "customers")
public class Customer {
	
	//@Transient
    public static final String SEQUENCE_NAME = "users_sequence";
   @Id
	private int id;
	private String customer_name;
	private String email;
	private String mobile_number;
	private String city;
	
	
	public Customer( String customer_name, String email, String mobile_number, String city) {
		super();
		
		this.customer_name = customer_name;
		this.email = email;
		this.mobile_number = mobile_number;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
