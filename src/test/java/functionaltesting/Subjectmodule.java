package functionaltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import objectrepository.Loginpage;
import objectrepository.Subject;

public class Subjectmodule {
	@Test
	public  void navigatetoSubjectPage() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		
		WebDriverUtility wb=new WebDriverUtility();
		 wb.waitforpagetoload(driver);
		 
		 
		 driver.manage().window().maximize();
		 
		 Loginpage l=new Loginpage(driver);
		 l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		 
		 Subject s=new Subject(driver);
		 s.getSubject().click();
		 
		 driver.quit();
		 	 
	}
	@Test
	public void addSubjectName() throws InterruptedException
	{
      WebDriver driver =new EdgeDriver();
		
		WebDriverUtility wb=new WebDriverUtility();
		 wb.waitforpagetoload(driver);
		 
		 
		 driver.manage().window().maximize();
		 
		 Loginpage l=new Loginpage(driver);
		 l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		 
		 Subject s=new Subject(driver);
		 s.getSubject().click();
		 
		 s.subAdd("Langauage");
		 
		 driver.quit();
		
	}
	
	@Test
	public void  submitSubject() throws InterruptedException
	{
WebDriver driver =new EdgeDriver();
		
		WebDriverUtility wb=new WebDriverUtility();
		 wb.waitforpagetoload(driver);
		 
		 
		 driver.manage().window().maximize();
		 
		 Loginpage l=new Loginpage(driver);
		 l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		 
		 Subject s=new Subject(driver);
		 s.getSubject().click();
		 
		 s.addSubject("Maths_12");
		 
		 driver.quit();
		 
	}
	
	@Test
	public void  selectEntrie() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility wb=new WebDriverUtility();
		 wb.waitforpagetoload(driver);
		 
		 
		 driver.manage().window().maximize();
		 
		 Loginpage l=new Loginpage(driver);
		 l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		 
		 Subject s=new Subject(driver);
		 s.getSubject().click();
		 		 
		 wb.select(s.getEntrie(), 1);
		 
		 driver.quit();
	}
	@Test
	public void searchContent() throws InterruptedException
	{
		
		JavaUtility j=new JavaUtility();
	     int  r=j.getRandomNumber();
		
		WebDriver driver =new ChromeDriver();
		WebDriverUtility wb=new WebDriverUtility();
		 wb.waitforpagetoload(driver);
		 
		 
		 driver.manage().window().maximize();
		 
		 Loginpage l=new Loginpage(driver);
		 l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		 
		 Subject s=new Subject(driver);
		 s.getSubject().click();
//		 
//		 s.addSubject("Maths"+r);
//		 
//		s.getPopup().click();
		 
		 
		 s.searcht("Math");
		
	}
	@Test
	public void editSubject() throws InterruptedException 
	{
		JavaUtility j=new JavaUtility();
	     int  r=j.getRandomNumber();
		
		WebDriver driver =new ChromeDriver();
		WebDriverUtility wb=new WebDriverUtility();
		 wb.waitforpagetoload(driver);
		 
		 
		 driver.manage().window().maximize();
		 
		 Loginpage l=new Loginpage(driver);
		 l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		 
		 Subject s=new Subject(driver);
		 s.getSubject().click();
		 
		 //s.searchSubject("Maths_12");
		 s.updateValue("Maths_12","Maths_123");
		 
		 
	}

}
