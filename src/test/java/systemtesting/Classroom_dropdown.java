package systemtesting;

import java.time.Duration;

import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

import baseclass.Baseclass;
import objectrepository.Classroommodule;
import objectrepository.Logoutpage;

public class Classroom_dropdown extends Baseclass{
	
	@Test
	public void enterDetails() throws InterruptedException {
	JavaUtility j=new JavaUtility();
    int r =j.getRandomNumber();
    driver .manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
    
    
    Classroommodule cl=new Classroommodule(driver);
	cl.addDetailsofclass("TestEng_"+r, "45");
	
	
	WebDriverUtility d =new WebDriverUtility();
    d.waitforelementpresent(driver, cl.getPopup());
    
    d.select(cl.getShow(), 0);
	

}
}
