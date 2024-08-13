package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Attendance {
	public WebDriver driver;
	
	public Attendance(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='Attendance']")
	private WebElement attendance;
	
	@FindBy(xpath="//a[text()=' Add Attendance']")
	private WebElement addattendance;
	
	@FindBy(xpath="//input[@placeholder='Enter index number']")
	private WebElement enterindexnumber;
	
	@FindBy(xpath="//button[@id='btnSubmit']")
	private WebElement submit;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement year;
	
	@FindBy(xpath = "//select[@id='grade']")
	private WebElement grade;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement month;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement studentatte;
	
	@FindBy(xpath="//button[@id='btnSubmit']")
	private WebElement stusubmit;
	
	@FindBy(xpath="//a[text()='Student Attendance History ']")
	private WebElement checkstu;
	
	@FindBy(xpath="//a[text()=' Teacher Attendance History']")
	private WebElement checktea;
	
	@FindBy(xpath="//select[@name='year']")
	private WebElement teachyear;
	
	@FindBy(xpath="//select[@name='month']")
	private WebElement teachmonth;
	
	@FindBy(xpath="//button[@id='btnSubmit']")
	private WebElement teachsubmit;

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getStusubmit() {
		return stusubmit;
	}

	public WebElement getTeachsubmit() {
		return teachsubmit;
	}

	public WebElement getAttendance() {
		return attendance;
	}

	public WebElement getAddattendance() {
		return addattendance;
	}

	public WebElement getEnterindexnumber() {
		return enterindexnumber;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGrade() {
		return grade;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getStudentatte() {
		return studentatte;
	}

	public WebElement getCheckstu() {
		return checkstu;
	}

	public WebElement getChecktea() {
		return checktea;
	}

	public WebElement getTeachyear() {
		return teachyear;
	}

	public WebElement getTeachmonth() {
		return teachmonth;
	}
	

}
