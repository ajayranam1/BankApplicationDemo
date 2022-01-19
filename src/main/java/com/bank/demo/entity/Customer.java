package com.bank.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String cutomerId;
	private String firstName;
	private String lastName;
	private String address;
	private String idPrrof;
	private String password;
	private Date dob;
	
	
	
	public Customer(String cutomerId, String firstName, String lastName, String address, String idPrrof,
			String password, Date dob) {
		super();
		this.cutomerId = cutomerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.idPrrof = idPrrof;
		this.password = password;
		this.dob = dob;
	}
	
	
	
	public Customer() {
		super();
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCutomerId() {
		return cutomerId;
	}
	public void setCutomerId(String cutomerId) {
		this.cutomerId = cutomerId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdPrrof() {
		return idPrrof;
	}
	public void setIdPrrof(String idPrrof) {
		this.idPrrof = idPrrof;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	

}
