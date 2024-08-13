package systemtesting;

import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import baseclass.Baseclass;
import objectrepository.Grade;

public class Grade_search extends Baseclass {
	@Test
	public void searchDe()
	{
		 WebDriverUtility wb=new WebDriverUtility();
		 wb.waitforpagetoload(driver);
		 
		 JavaUtility j=new JavaUtility();
		 int r= j.getRandomNumber();
		 
		 driver.manage().window().maximize();
		 
		 String s="AB"+r;
		 
		 Grade gd=new Grade(driver);
		 gd.gradeDetails(s, "1000","12");
		 
		 gd.searchDetails(s);
		 
	}
	
	
	

}

