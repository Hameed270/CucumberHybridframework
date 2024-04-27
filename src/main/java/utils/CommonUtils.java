package utils;

import java.util.Date;

public class CommonUtils {

	public String getTimeStampEmail()
	{
		Date date = new Date();
		return "hameed123"+ date.toString().replace(" ", "_").replace(":", "_")+ "@gmail.com";
		 
	}
}
