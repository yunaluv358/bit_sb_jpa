package com.example.web.admin;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter @Setter
public class Admin {
private String employNumber, password, name, position, profile, email, phoneNumber, registerDate;

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s", 
				employNumber, password, name, position, profile, email, phoneNumber, registerDate);
	}
}