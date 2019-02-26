package com.cg.project.beans;

import java.util.List;

public class Associate {
	int associateId;
	String password;
	String email;
	String telephone;
	List <String>communication;
	
	public Associate(int associateId, String password, String email, String telephone, List<String> communication) {
		super();
		this.associateId = associateId;
		this.password = password;
		this.email = email;
		this.telephone = telephone;
		this.communication = communication;
	}

	
	
	
	
	public Associate(int associateId, String password) {
		super();
		this.associateId = associateId;
		this.password = password;
	}
	
	
	public Associate() {}
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String  getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
