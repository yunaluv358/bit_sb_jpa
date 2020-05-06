package com.example.web.util;

import java.io.File;

public enum Data {
	DATA_PATH,CSV, ADMIN_LIST, USER_LIST, LOST_LIST;
	//C:\Users\bit\git\repository4\demo\src\main\resources\static\resources
	@Override
	public String toString() {
		String returnValue = "";
		switch(this) {
		case DATA_PATH:
			returnValue = "C:"+File.separator+"Users" +
					File.separator + "bit" + 
					File.separator + "git" + 
					File.separator + "repository4" + 
					File.separator + "demo" + 
					File.separator + "src" + 
					File.separator + "main" + 
					File.separator + "resources" + 
					File.separator + "static" + 
					File.separator + "resources" + 
					File.separator + "file" +
					File.separator;
			break;

		case CSV:
			returnValue = ".csv";
			break;
			
		case ADMIN_LIST:
			returnValue = "admin_list";
			break;
		
		case USER_LIST:
			returnValue = "user_list";
			break;
		
		case LOST_LIST:
			returnValue = "lost_list";
			break;
			
		default:
			break;
		}
		return returnValue;
	}
}