package integrationtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import objectrepository.Loginpage;
import objectrepository.Teacher;

public class Teacher_module {
	
	@Test
	public void addteacherdetails() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility w=new WebDriverUtility();
		w.waitforpagetoload(driver);
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		
		Teacher t=new Teacher(driver);
		t.getTeacher().click();
		t.getRadio().click();
		t.addTeacherdetails("198", "Venkat", "G", "Andhrapradesh", "888-999-7896", "Ve@gmail.com");
		w.select(t.getGender(), 1);
		t.getPhoto().sendKeys("C:\\Users\\setti\\Downloads\\IMG_20230803_144544.jpg");
		t.getDone().submit();
		Thread.sleep(5000);
		t.getTeacher().click();
		t.getAllteacher().click();
		t.getAllsearch().sendKeys("1998");

	}

}
