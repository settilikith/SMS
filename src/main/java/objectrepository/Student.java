package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class Student {
	
	WebDriverUtility w=new WebDriverUtility();
	public WebDriver driver;
	
	public Student(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='Student']")
	private WebElement student;
	
	@FindBy(xpath="//a[text()=' Add Student']")
	private WebElement addstudent;
	
	@FindBy(xpath="//input[@id='index_number']")
	private WebElement addindexstu;
	
	@FindBy(xpath="//input[@id='full_name']")
	private WebElement addfullnamestu;
	
	@FindBy(xpath="//input[@id='i_name']")
	private WebElement addintialstu;
	
	@FindBy(xpath="//input[@id='address']")
	private WebElement addaddressstu;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement addemailstu;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement addphonestu;
	
	@FindBy(xpath="//input[@id='b_date']")
	private WebElement addbrithdaystu;
	
	@FindBy(xpath="//select[@id='gender']")
	private WebElement addgenderstu;
	
	@FindBy(xpath="//input[@id='fileToUpload']")
	private WebElement choosephotostu;
	
	@FindBy(xpath="//input[@id='g_index']")
	private WebElement gudindex;
	
	@FindBy(xpath="//input[@id='g_full_name']")
	private WebElement gudfullname;
	
	@FindBy(xpath="//input[@id='g_i_name']")
	private WebElement gudiname;
	
	@FindBy(xpath="//input[@id='g_address']")
	private WebElement gudaddress;
	
	@FindBy(xpath="//input[@id='g_phone']")
	private WebElement gudphone;
	
	@FindBy(xpath="//input[@id='g_email']")
	private WebElement gudemail;
	
	@FindBy(xpath="//input[@id='g_b_date']")
	private WebElement gudbday;
	
	@FindBy(xpath="//select[@id='g_gender']")
	private WebElement gudgender;
	
	@FindBy(xpath="//input[@id='g_fileToUpload']")
	private WebElement gudfileload;
	
	@FindBy(xpath="//button[@id='btnSubmit']")
	private WebElement next;
	
	
	@FindBy(xpath="//a[text()=' All Student']")
	private WebElement allstudent;
	
	@FindBy(xpath="//select[@id='grade']")
	private WebElement searchit;

	@FindBy(xpath = "//select[@id='grade']")
	private WebElement selectgrade;
	
	public WebElement getSelectgrade() {
		return selectgrade;
	}

	public WebElement getAllstudent() {
		return allstudent;
	}

	public WebElement getSearchit() {
		return searchit;
	}

	public WebElement getGudemail() {
		return gudemail;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getStudent() {
		return student;
	}

	public WebElement getAddstudent() {
		return addstudent;
	}

	public WebElement getAddindexstu() {
		return addindexstu;
	}

	public WebElement getAddfullnamestu() {
		return addfullnamestu;
	}

	public WebElement getAddintialstu() {
		return addintialstu;
	}

	public WebElement getAddaddressstu() {
		return addaddressstu;
	}

	public WebElement getAddemailstu() {
		return addemailstu;
	}

	public WebElement getAddphonestu() {
		return addphonestu;
	}

	public WebElement getAddbrithdaystu() {
		return addbrithdaystu;
	}

	public WebElement getAddgenderstu() {
		return addgenderstu;
	}

	public WebElement getChoosephotostu() {
		return choosephotostu;
	}

	public WebElement getGudindex() {
		return gudindex;
	}

	public WebElement getGudfullname() {
		return gudfullname;
	}

	public WebElement getGudiname() {
		return gudiname;
	}

	public WebElement getGudaddress() {
		return gudaddress;
	}

	public WebElement getGudphone() {
		return gudphone;
	}

	public WebElement getGudbday() {
		return gudbday;
	}

	public WebElement getGudgender() {
		return gudgender;
	}

	public WebElement getGudfileload() {
		return gudfileload;
	}
	public void addStudentdetails(String index,String name,String intials,String address,String email,String phone,String dateofbrith)
	{
		getAddindexstu().sendKeys(index);
		getAddfullnamestu().sendKeys(name);
		getAddintialstu().sendKeys(intials);
		getAddaddressstu().sendKeys(address);
		getAddemailstu().sendKeys(email);
		getAddphonestu().sendKeys(phone);
		getAddbrithdaystu().sendKeys(dateofbrith);
	}
	
	public void addguddetails(String name,String intials,String address,String email,String phone,String dateofbrith)
	{
		//getGudindex().sendKeys(index);
		getGudfullname().sendKeys(name);
		getGudiname().sendKeys(intials);
		getGudaddress().sendKeys(address);
		getGudemail().sendKeys(email);
		getGudphone().sendKeys(phone);
		getGudbday().sendKeys(dateofbrith);
	}

}
