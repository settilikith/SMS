package integrationtesting;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import graphql.language.Argument;
import objectrepository.Grade;
import objectrepository.Loginpage;
import objectrepository.TimeTable;

public class Grade_module {
	@Test
	public void  addDetails() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility wb=new WebDriverUtility();
		 wb.waitforpagetoload(driver);
		 
		 JavaUtility j=new JavaUtility();
		 int r= j.getRandomNumber();
		 
		 String u="AU"+r;
		 
		 driver.manage().window().maximize();
		 
		 Loginpage l =new Loginpage(driver);
		 l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		    
		 
		 Grade gd=new Grade(driver);
		 gd.gradeDetails(u, "1000","12");
		 
		 TimeTable t=new TimeTable(driver);
		 t.getTimeTable().click();
		 
		 WebElement s=t.getSelect();
		 s.click();
		 Select su=new Select(s);
		 //su.selectByIndex(25);
		 su.selectByVisibleText(u);
		 driver.quit();
	}


}
