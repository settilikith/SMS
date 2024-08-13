package systemtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import objectrepository.Loginpage;
import objectrepository.Teacher;

public class AddTeacherNegative {
	@Test
	public void notSubmit() throws InterruptedException
	{
		WebDriver driver =new EdgeDriver();
		
		WebDriverUtility wb=new WebDriverUtility();
		 wb.waitforpagetoload(driver);
		 		 
		 driver.manage().window().maximize();
		 
		 Loginpage l=new Loginpage(driver);
		 l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		 
		 Teacher t=new Teacher(driver);
		 t.getTeacher().click();
		 t.getRadio().click();
		 t.getSubmit().click();
		 
		 
	}

}
