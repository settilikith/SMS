package integrationtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import objectrepository.Loginpage;
import objectrepository.Subject;
import objectrepository.SubjectRouting;

public class Subject_module {
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
		 
		 s.subAdd("SQLTest");
		 SubjectRouting st=new SubjectRouting(driver);
			st.getSubjectro().click();
			st.getSubjectro().click();
			st.getAddsubject().click();
			wb.select(st.getGrade(), 3);
			wb.select(st.getSubject(), 19);
			
			wb.select(st.getTeacher(), 3);
			

			
			st.getFee().sendKeys("2000");
			s.getSubmit().submit();
			
			driver.quit();
	}
			
	       @Test
			public void SearchSubjectName() throws InterruptedException
			{
		      WebDriver driver =new EdgeDriver();
				
				WebDriverUtility wb=new WebDriverUtility();
				 wb.waitforpagetoload(driver);
				 
				 
				 driver.manage().window().maximize();
				 
				 Loginpage l=new Loginpage(driver);
				 l.loginToapp("http://49.249.28.218:8081/AppServer/Student_Management_System/view/login.php", "admin@gmail.com","12345");
				 	
				 SubjectRouting st=new SubjectRouting(driver);
				   st.getSubjectro().click();
			      st.getSearchit().sendKeys("Grade 3");
		         //driver.quit();
		
	}

}
