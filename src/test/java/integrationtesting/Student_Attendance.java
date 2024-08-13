package integrationtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import objectrepository.Attendance;
import objectrepository.Loginpage;

public class Student_Attendance {
	
	@Test
	public void checkDetails() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility w=new WebDriverUtility();
		w.waitforpagetoload(driver);
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		Attendance a=new Attendance(driver);
		a.getAttendance().click();
		a.getAddattendance().click();
		a.getEnterindexnumber().sendKeys("193");
		a.getSubmit().click();
		
		driver.navigate().back();
		
		a.getAttendance().click();
		
		a.getCheckstu().click();
		w.select(a.getYear(), 1);
		w.select(a.getGrade(), 2);
		w.select(a.getMonth(), 2);
	}
	

}
