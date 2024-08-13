package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class Teacher {
	public WebDriver driver;
	
	WebDriverUtility w=new WebDriverUtility();
	public Teacher(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='Teacher']")
	private WebElement teacher;
	
	@FindBy(xpath="//a[text()=' Add Teacher']")
	private WebElement radio;
	
	@FindBy(xpath="//input[@name='fileToUpload']")
	private WebElement photo;
	
	@FindBy(xpath="//button[@id='btnSubmit']")
	private WebElement submit;
	
	@FindBy(xpath="//a[@href='all_teacher.php']")
	private WebElement Allteacher;
	
	@FindBy(xpath="//input[@placeholder='Enter index number']")
	private WebElement addteacherindexname;
	
	@FindBy(xpath="//input[@placeholder='Enter full name']")
	private WebElement addFullnameofTeacher;
	
	
	@FindBy(xpath="//input[@placeholder='Enter name with initials']")
	private WebElement addInitialsnameofTeacher;
	
	
	@FindBy(xpath="//input[@placeholder='Enter address']")
	private WebElement addAddress;
	
	@FindAll({@FindBy(xpath="//select[@name='gender']"),@FindBy(xpath="//select[@id='gender']")})
	private WebElement gender;
	
	@FindBy(xpath="//input[@placeholder='123-456-7890']")
	private WebElement phoneno;
	
	@FindAll({@FindBy(xpath="//input[@placeholder='Enter valid email address']"),@FindBy(xpath="//input[@name='email']")})
	private WebElement email;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement done;
	
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement allsearch;
	
	@FindBy(xpath="//a[text()='Edit']")
	private WebElement editall;
	
	@FindBy(xpath="//button[@id='btnSubmit1']")
	private WebElement updateall;
	
	@FindBy(xpath="//a[text()='View Payments']")
	private WebElement payall;
	
	public WebElement getPayall() {
		return payall;
	}


	public WebElement getUpdateall() {
		return updateall;
	}


	public WebDriverUtility getW() {
		return w;
	}


	public WebElement getEditall() {
		return editall;
	}


	public WebElement getAllsearch() {
		return allsearch;
	}


	public WebElement getDone() {
		return done;
	}
	

	public WebElement getAllteacher() {
		return Allteacher;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getTeacher() {
		return teacher;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getPhoto() {
		return photo;
	}
	
	public WebElement getAddteacherindexname() {
		return addteacherindexname;
	}

	public WebElement getAddFullnameofTeacher() {
		return addFullnameofTeacher;
	}

	public WebElement getAddInitialsnameofTeacher() {
		return addInitialsnameofTeacher;
	}

	public WebElement getAddAddress() {
		return addAddress;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getPhoneno() {
		return phoneno;
	}

	public WebElement getEmail() {
		return email;
	}
	public void choosePhoto()
	{
		getTeacher().click();
		getRadio().click();
		getPhoto().sendKeys("C:\\Users\\setti\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-11-23 182807.png");
	}
	
	public void addTeacherdetails(String index,String name,String intial,String address,String phoneno,String email)
	{
		getTeacher().click();
		getRadio().click();
		getAddteacherindexname().sendKeys(index);
		getAddFullnameofTeacher().sendKeys(name);
		getAddInitialsnameofTeacher().sendKeys(intial);
		getAddAddress().sendKeys(address);
		getPhoneno().sendKeys(phoneno);
		getEmail().sendKeys(email);
		
	}


}
