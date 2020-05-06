package com.example.web.util;

import java.io.File;

public enum Data {
	ADMINS, USERS, ITEMS;
	// C:\Users\bit\git\repository4\demo\src\main\resources\static\resources\file
	@Override
	public String toString() {
		String path = "C:"+File.separator+"Users"+File.separator+"bit"+File.separator
				+"git"+File.separator+"repository4"+File.separator+"demo"+File.separator
				+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"static"
				+File.separator+"resources"+File.separator+"file"+File.separator;
		
		switch(this) {
		case ADMINS: path = path.concat("admins.csv");break;
		case USERS: path = path.concat("users.csv");break;
		case ITEMS: path = path.concat("items.csv");break;
		default:
			break;
		}
		return path;
	}
}