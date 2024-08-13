package functionaltesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import objectrepository.Classroommodule;
import objectrepository.Loginpage;


public class Classroom {
	
	@Test
	public void classroomModule() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		JavaUtility j=new JavaUtility();
	     int r =j.getRandomNumber();
	     
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		
		driver.quit();
	}
	@Test
	public void  addClassroomdetails() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		
		WebDriverUtility wb=new WebDriverUtility();
		wb.waitforpagetoload(driver);
		
		driver.manage().window().maximize();
		
		JavaUtility j=new JavaUtility();
	     int r =j.getRandomNumber();
	     
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		
		Classroommodule cl=new Classroommodule(driver);
		cl.addDetailsofclass("TestEng_"+r, "45");
		
		driver.quit();
	}
	
	@Test
	public void dropDownclass() throws InterruptedException
	{
		
		
		JavaUtility j=new JavaUtility();
	     int r =j.getRandomNumber();
	     
	     WebDriver driver =new ChromeDriver();
			
			WebDriverUtility wb=new WebDriverUtility();
			wb.waitforpagetoload(driver);
			
			driver.manage().window().maximize();
	     
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		
		Classroommodule cl=new Classroommodule(driver);
		cl.addDetailsofclass("TestEng_"+r, "45");
		
		wb.waitforelementpresent(driver, cl.getPopup());
		
		wb.select(cl.getShow(), 0);
		
		driver.quit();
	}

}
