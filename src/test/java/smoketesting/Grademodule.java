package smoketesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import objectrepository.Grade;
import objectrepository.Loginpage;

public class Grademodule {
	@Test
	public void  navigateToGrade() throws InterruptedException
	{
      WebDriver driver =new ChromeDriver();
		
		WebDriverUtility wb=new WebDriverUtility();
		wb.waitforpagetoload(driver);
		
	    driver.manage().window().maximize();
	    
	    Loginpage l =new Loginpage(driver);
	    l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
	    
         Grade g=new Grade(driver);
         g.getGrade().click();
         
         driver.quit();
	}
	
	@Test
	public void  addDetails() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility wb=new WebDriverUtility();
		 wb.waitforpagetoload(driver);
		 
		 JavaUtility j=new JavaUtility();
		 int r= j.getRandomNumber();
		 
		 driver.manage().window().maximize();
		 
		 Loginpage l =new Loginpage(driver);
		 l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		    
		 
		 Grade gd=new Grade(driver);
		 gd.gradeDetails("AB"+r, "1000","12");
		 driver.quit();
	}
	
	@Test
	public void  submitButton() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility wb=new WebDriverUtility();
		 wb.waitforpagetoload(driver);
		 
		 JavaUtility j=new JavaUtility();
		 int r= j.getRandomNumber();
		 
		 driver.manage().window().maximize();
		 
		 Loginpage l =new Loginpage(driver);
		 l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		    
		 
		 Grade gd=new Grade(driver);
		 gd.gradeDetails("AB"+r, "1000","12");
		 
		 driver.quit();
	}
	
	@Test
	public void selectEntries() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		WebDriverUtility wb=new WebDriverUtility();
		 wb.waitforpagetoload(driver);
		 
		 JavaUtility j=new JavaUtility();
		 int r= j.getRandomNumber();
		 
		driver.manage().window().maximize();
		
		
		Loginpage l =new Loginpage(driver);
		 l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		    
		 
		 Grade gd=new Grade(driver);
		 gd.getGrade().click();
		 
		 wb.select(gd.getEntrie(), 1);
		 driver.quit();
	}
	@Test
	public void searchDetails() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility wb=new WebDriverUtility();
		 wb.waitforpagetoload(driver);
		 
		 JavaUtility j=new JavaUtility();
		 int r= j.getRandomNumber();
		 
		 driver.manage().window().maximize();
		 Loginpage l=new Loginpage(driver);
		 l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		 
		 String s="AB"+r;
		 
		 Grade gd=new Grade(driver);
//		 gd.gradeDetails(s, "1000","12");
//		 
//		 wb.waitforelementpresent(driver,gd.getSubmit());
		 
		 gd.getGrade().click();
		 
		 gd.searchDetails(s);
		 driver.quit();
	}

}
