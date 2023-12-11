package com.example.icecreamDatabase.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Login {
	
	@Id
	private String email_id;
	private String password;
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
