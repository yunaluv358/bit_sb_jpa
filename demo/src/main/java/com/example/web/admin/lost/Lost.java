package com.example.web.admin.lost;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter @Setter
public class Lost {
	String lostID, itemName, date, array, location;

	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s", lostID, itemName, date, array, location);
	}
}