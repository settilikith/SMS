package systemtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import objectrepository.Classroommodule;
import objectrepository.Grade;
import objectrepository.Loginpage;
import objectrepository.Subject;

public class Negativeclassdropdown {
	@Test
	public void  withOutDropdown() throws InterruptedException
	{
		WebDriver driver =new EdgeDriver();
		JavaUtility j=new JavaUtility();
		 int r= j.getRandomNumber();
		
		WebDriverUtility wb=new WebDriverUtility();
		 wb.waitforpagetoload(driver);
		 
		 
		 driver.manage().window().maximize();
		 Loginpage l=new Loginpage(driver);
		 l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		 
		 Subject s=new Subject(driver);
		 s.getSubject().click();
		 s.getEntrie().click();
		 
		 driver.quit();
		 
	}

}
