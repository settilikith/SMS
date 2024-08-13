package integrationtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import objectrepository.Exam;
import objectrepository.Loginpage;

public class Exam_module {
	@Test
	public void examDetails() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility w=new WebDriverUtility();
		w.waitforpagetoload(driver);
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		
		Exam e=new Exam(driver);
		e.getExam().click();
		e.getCreateexam().click();
		e.getAdd().click();
		e.getExamname().sendKeys("API");
		e.getSubmit().click();
		Thread.sleep(5000);
		e.getExam().click();
		e.getExamtimetable().click();
		w.select(e.getGrade(), 2);
		Select s=new Select(e.getSelectexam());
		s.selectByVisibleText("API");
		e.getNext().click();
		
	}

}
