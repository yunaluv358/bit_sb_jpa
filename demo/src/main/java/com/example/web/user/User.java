package com.example.web.user;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
public class User {
	private String name, userid, password, ssn, address, profile, email, phoneNumber, registerDate;
	@Override 
	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", userid,password,name,ssn,address,profile,email,phoneNumber,registerDate);
	}
}