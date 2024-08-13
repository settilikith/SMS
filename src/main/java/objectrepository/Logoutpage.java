package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage {
	
	public WebDriver driver;
	public Logoutpage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements( driver,this);
	}
	@FindAll({@FindBy(xpath="//img[@class='user-image']"),@FindBy(xpath="//span[text()='Admin']")})
	private WebElement img;
	@FindAll({@FindBy(xpath="//a[@class='btn btn-default btn-flat']"),@FindBy(xpath="//a[text()='Sign out']")})
	private WebElement signout;
	public WebElement getImg() {
		return img;
	}
	public WebElement getSignout() {
		return signout;
	}
	
//	 public void logOuttheApp()
//	  {
//		 getImg().click();
//		 getSignout().click();
//	  }

}
