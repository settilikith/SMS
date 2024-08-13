package integrationtesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import objectrepository.Loginpage;
import objectrepository.Student;

public class Student_module {
	@Test
	public void checkStudentdetails() throws InterruptedException, AWTException
	{
		WebDriver driver =new ChromeDriver();
		WebDriverUtility w=new WebDriverUtility();
		w.waitforpagetoload(driver);
		driver.manage().window().maximize();
		Loginpage l=new Loginpage(driver);
		l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
		
		Student s=new Student(driver);
		s.getStudent().click();
		s.getAddstudent().click();
		s.addStudentdetails("246", "Triveni_2", "p", "Forest", "trivenis@gmail.com", "111-111-1111", "12-nov-2000");
		w.select(s.getAddgenderstu(), 2);
		s.getChoosephotostu().sendKeys("C:\\Users\\setti\\Downloads\\IMG_20230803_144544.jpg");
		
		s.addguddetails( "HRs_2", "p", "Ap", "HRs@gmail.com", "111-111-1111", "19-jan-1985");
		w.select(s.getGudgender(), 1);
		s.getGudfileload().sendKeys("C:\\Users\\setti\\Downloads\\IMG_20230803_144544.jpg");
		
		Thread.sleep(1000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
				
		s.getNext().click();
		w.select(s.getSelectgrade(), 3);
		
		
		Thread.sleep(5000);
		s.getAllstudent().click();
		s.getSearchit().sendKeys("Grade 3");
	}

}
