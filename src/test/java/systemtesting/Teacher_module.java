package systemtesting;

import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import baseclass.Baseclass;
import objectrepository.Teacher;

public class Teacher_module extends Baseclass {
	@Test
	public void photoSelect()
	{
		WebDriverUtility wb=new WebDriverUtility();
		wb.waitforpagetoload(driver);
		
		driver.manage().window().maximize();
		
		Teacher t=new Teacher(driver);
		t.choosePhoto();
	}

}
