package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v113.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Classroommodule {
	public  WebDriver driver;
	public Classroommodule(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='class_room.php']")
	private WebElement classroom;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement classdata;
	
	@FindBy(xpath="//input[@id='student_count']")
	private WebElement countdata;
	
	@FindBy(xpath="//button[@id='btnSubmit']")
	private WebElement submit;
	
	
	@FindBy(xpath="//strong[contains(text(),'Success!')]/ancestor::div[@class='modal-content']/div/button/following-sibling::h4[text()='Information...!']")
	private WebElement popup;
	
	
	@FindBy(xpath="//select[@name='example1_length']")
	private WebElement show;
	
	public WebElement getShow() {
		return show;
	}

	public WebElement getPopup() {
		return popup;
	}

	public WebElement getCountdata() {
		return countdata;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getClassdata() {
		return classdata;
	}

	public WebElement getClassroom() {
		return classroom;
	} 
	public void  addDetailsofclass(String classname,String count)
	{
		classroom.click();
		classdata.sendKeys(classname);
		countdata.sendKeys(count);
		
		submit.click();
	}

}
