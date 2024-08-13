package com.comcast.crm.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int getRandomNumber()
	{
		Random random =new Random();
		int rannum =random.nextInt();
		return rannum;
		
	}
	public String getSystemDateYYYYDDMM()
	{
		Date dateobj =new Date();
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		String start =sim.format(dateobj);
		return start;
	}
	public String getRequiredDate(int days)
	{
		Date dateobj =new Date();
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal =Calendar.getInstance();
		cal.getTime();
		String start =sim.format(dateobj);
		cal.add(Calendar.DAY_OF_MONTH,30);
		String reqDate =sim.format(cal.getTime());
		return reqDate;	
	}

}
