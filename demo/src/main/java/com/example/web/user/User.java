package com.example.web.user;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
	String name, userid, password, ssn, address, email, phoneNumber, profile, registerDate;
	
	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", name, userid, password, ssn, address, email, phoneNumber, profile, registerDate);
	}
}