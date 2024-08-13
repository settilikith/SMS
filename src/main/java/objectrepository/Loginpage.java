package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
      WebDriver driver;
      public Loginpage(WebDriver driver)
  	{
  		this.driver=driver;
  		PageFactory.initElements( driver,this);
  	}
      
       @FindAll({@FindBy(id="email"),@FindBy(xpath="//input[@placeholder='Enter email address']")})
      private WebElement emailtext;
      @FindBy(xpath="//input[@id='password']")
      private WebElement passwordtext;
      @FindBy(xpath="//button[@id='btnSubmit']")
      private WebElement submit;
      
      
	public WebElement getPasswordtext() {
		return passwordtext;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getEmailtext() {
		return emailtext;
	}
	  
	
	public void  loginToapp(String url,String username,String password) throws InterruptedException
	{
		driver.get(url);
	    getEmailtext().sendKeys(username);
		getPasswordtext().sendKeys(password);
		getSubmit().click();
	}
      
	}


