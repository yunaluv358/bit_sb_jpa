package com.example.web.util;

import java.io.File;

public enum Data {
	USER_PATH, ADMIN_PATH, CSV, LIST;
	
	@Override
	public String toString() {
		String returnValue = "";
		switch(this) {
		case USER_PATH: returnValue = "C:"+File.separator+"User"+File.separator+"bit"+File.separator
							+"spring-workspace"+File.separator+"occamsrazor"+File.separator
							+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"static"
							+File.separator+"user"+File.separator; break;
		case ADMIN_PATH: returnValue = "C:"+File.separator+"Users"+File.separator+"bit"+File.separator+
				"sts-workspace"+File.separator+"demo"+File.separator+"src"+File.separator+"main"+File.separator+
				"resources"+File.separator+"static"+File.separator+"admin"+File.separator; break;
		
		//C:\Users\bit\sts-workspace\demo\src\main\resources\static\admin
		case CSV: returnValue = ".csv";break;
		case LIST: returnValue = "list"; break;
		default:
			break;
		}
		return returnValue;
	}
}