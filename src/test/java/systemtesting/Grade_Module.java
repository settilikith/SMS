package systemtesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import baseclass.Baseclass;
import objectrepository.Grade;

public class Grade_Module extends Baseclass {
	@Test
	public void details()
	{
	 WebDriverUtility wb=new WebDriverUtility();
	 wb.waitforpagetoload(driver);
	 
	 JavaUtility j=new JavaUtility();
	 int r= j.getRandomNumber();
	 
	 driver.manage().window().maximize();
	 
	 Grade gd=new Grade(driver);
	 gd.gradeDetails("AB"+r, "1000","12");
	 
	}
	

}
