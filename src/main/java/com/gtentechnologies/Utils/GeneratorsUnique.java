package com.gtentechnologies.Utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GeneratorsUnique {
	
	public static String getUniqueEmail() {
		return "demouser"+ getCurrentDateTime() +"@yopmail.com";
	}
	
	
	public static String getCurrentDateTime() {
		
		 String dateTime = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(Calendar.getInstance().getTime());
		 return dateTime.replaceAll("[^0-9]","");
	}

}


