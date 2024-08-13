package functionaltesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import objectrepository.Loginpage;
import objectrepository.SubjectRouting;

public class Subjectroute_module {
	
	@Test
	public void  navigatetoSubjectRouting() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com", "12345");
		SubjectRouting s=new SubjectRouting(driver);
		s.getSubjectro().click();
		driver.quit();
	}
	
	@Test
	public void addDetailstoSubject() throws InterruptedException
	{
		WebDriverUtility w=new WebDriverUtility();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com", "12345");
		SubjectRouting s=new SubjectRouting(driver);
		s.getSubjectro().click();
		s.getAddsubject().click();
		w.select(s.getGrade(), 1);
		w.select(s.getSubject(), 1);
		w.select(s.getTeacher(), 1);
		s.getFee().sendKeys("1000");
		driver.quit();
	}
	@Test
	public void  submitDetails() throws InterruptedException
	{
		WebDriverUtility w=new WebDriverUtility();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com", "12345");
		SubjectRouting s=new SubjectRouting(driver);
		s.getSubjectro().click();
		s.getAddsubject().click();
		w.select(s.getGrade(), 3);
		w.select(s.getSubject(), 3);
		w.select(s.getTeacher(), 3);
		s.getFee().sendKeys("2000");
		s.getSubmit().submit();
		Thread.sleep(2000);
		s.getSearchit().sendKeys("Grade 3");
	}
	
	@Test
	public void  searchDetails() throws InterruptedException
	{
		WebDriverUtility w=new WebDriverUtility();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com", "12345");
		SubjectRouting s=new SubjectRouting(driver);
		s.getSubjectro().click();
		s.getSearchit().sendKeys("Grade 3");
		s.getDelete().click();
		s.getYes().click();
		driver.quit();
	}
	@Test
	public void  showEntrie() throws InterruptedException
	{

		WebDriverUtility w=new WebDriverUtility();
		WebDriver driver =new ChromeDriver();
	    w.waitforpagetoload(driver);
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com", "12345");
		SubjectRouting s=new SubjectRouting(driver);
		s.getSubjectro().click();
		w.select(s.getShow(), 1);
		driver.quit();
	}
	@Test
	public void editDetails() throws InterruptedException
	{

		WebDriverUtility w=new WebDriverUtility();
		WebDriver driver =new ChromeDriver();
	    w.waitforpagetoload(driver);
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com", "12345");
		SubjectRouting s=new SubjectRouting(driver);
		s.getSubjectro().click();
		s.getSearchit().sendKeys("Grade 3");
		s.getEditit().click();
		s.getUpdate().click();
		driver.quit();
	}

}
