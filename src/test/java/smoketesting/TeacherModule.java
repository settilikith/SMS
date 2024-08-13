package smoketesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import objectrepository.Loginpage;
import objectrepository.Teacher;

public class TeacherModule {
	
	@Test
	public void  NavigatetoAddTeacherpage() throws InterruptedException
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
		
		driver.quit();

	}
	@Test
	public void  navigateToALLTeacherpage() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility w=new WebDriverUtility();
		w.waitforpagetoload(driver);
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		
		Teacher t=new Teacher(driver);
		
		t.getTeacher().click();
		t.getAllteacher().click();
		driver.quit();
		

	}
	@Test
	public void  enterAllTeacherdetails() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility w=new WebDriverUtility();
		w.waitforpagetoload(driver);
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		
		Teacher t=new Teacher(driver);
		t.addTeacherdetails("8976", "Kedar", "V", "KukatapallyHyderabad", "888-999-7896", "kk@gmail.com");
		
//		t.getGender().click();
		w.select(t.getGender(), 1);
		
		driver.quit();
		
	}
	@Test
	public void  ChoosePhoto() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility w=new WebDriverUtility();
		w.waitforpagetoload(driver);
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		
		Teacher t=new Teacher(driver);
		t.choosePhoto();
		driver.quit();
		
	}
	@Test
	public void submitCheck() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility w=new WebDriverUtility();
		w.waitforpagetoload(driver);
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		
		Teacher t=new Teacher(driver);
		t.addTeacherdetails("8976", "Kedar", "V", "KukatapallyHyderabad", "888-999-7896", "kk@gmail.com");
		t.getPhoto().sendKeys("C:\\Users\\setti\\Downloads\\IMG_20230803_144544.jpg");
		t.getDone().submit();
		t.getTeacher().click();
	}
	@Test
	public void    searchDetails() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility w=new WebDriverUtility();
		w.waitforpagetoload(driver);
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		
		Teacher t=new Teacher(driver);
		t.getTeacher().click();
		t.getAllteacher().click();
		t.getAllsearch().sendKeys("Kedar");
		driver.quit();

	}
	@Test
	public void editDetails() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility w=new WebDriverUtility();
		w.waitforpagetoload(driver);
		driver.manage().window().maximize();
		
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		Teacher t=new Teacher(driver);
		t.getTeacher().click();
		t.getAllteacher().click();
		t.getAllsearch().sendKeys("Teacher 1 h");
		t.getEditall().click();
		t.getUpdateall().click();
		driver.quit();
	}
	@Test
	public void  PaymentHistory() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility w=new WebDriverUtility();
		w.waitforpagetoload(driver);
		driver.manage().window().maximize();
		
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		Teacher t=new Teacher(driver);
		t.getTeacher().click();
		t.getAllteacher().click();
		t.getAllsearch().sendKeys("Teacher 1 h");
		t.getPayall().click();
	}

}
