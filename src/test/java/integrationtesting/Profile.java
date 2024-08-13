package integrationtesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import objectrepository.Homepage;
import objectrepository.Loginpage;

public class Profile {
	@Test
	public void  profileSettings() throws InterruptedException, AWTException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility w=new WebDriverUtility();
		w.waitforpagetoload(driver);
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com", "12345");
		
		Homepage h=new Homepage(driver);
		h.updateProfile("Lucky", "s", "Telugu", "admin@gmail.com", "999-888-1778");
		w.select(h.getGender(), 0);
		
		Thread.sleep(2000);
	
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);

		h.getUpdate().click();
       
		
	}

}
