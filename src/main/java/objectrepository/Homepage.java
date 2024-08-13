package objectrepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class Homepage {
	public WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	WebDriverUtility w=new WebDriverUtility();
	@FindBy(xpath="//span[text()='My Profile']")
	private WebElement profile;
	
	@FindBy(xpath="//a[@id='btnEdit']")
	private WebElement note;
	
	@FindBy(xpath="//input[@id='full_name1']")
	private WebElement fullname;
	
	@FindBy(xpath="//input[@id='i_name1']")
	private WebElement intials;
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement  value;
	
	@FindBy(xpath="//select[@id='gender2']")
	private WebElement  gender;
	
	@FindBy(xpath="//input[@id='email1']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='phone1']")
	private WebElement phoneno;
	
	@FindBy(xpath="//td[@id='user_name1']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password1']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement update;
	
	
	public WebElement getProfile() {
		return profile;
	}


	public WebElement getNote() {
		return note;
	}


	public WebElement getFullname() {
		return fullname;
	}


	public WebElement getIntials() {
		return intials;
	}


	public WebElement getValue() {
		return value;
	}


	public WebElement getGender() {
		return gender;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPhoneno() {
		return phoneno;
	}


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getUpdate() {
		return update;
	}


	public void updateProfile(String name,String intial,String address,String email,String phone) 
	{
		getProfile().click();
		getNote().click();
		
		getFullname().clear();
		getFullname().sendKeys(name);
		
		getIntials().clear();
		getIntials().sendKeys(intial);
		
		getValue().clear();
		getValue().sendKeys(address);
		
		getEmail().clear();
		getEmail().sendKeys(email);
		
		getPhoneno().clear();
		getPhoneno().sendKeys(phone);
	}
	

}
