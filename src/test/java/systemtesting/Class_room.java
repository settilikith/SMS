package systemtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.JavaUtility;

import baseclass.Baseclass;
import objectrepository.Classroommodule;

public class Class_room extends Baseclass{
	@Test
	public void loginApplication() throws InterruptedException
	{
		
		JavaUtility j=new JavaUtility();
		     int r =j.getRandomNumber();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
		
		
		Classroommodule cl=new Classroommodule(driver);
		cl.addDetailsofclass("TestEng_"+r, "45");
		
	}

}
