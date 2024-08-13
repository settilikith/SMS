package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subject {
	
	public WebDriver driver;
	
	public Subject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath="//span[text()='Subject']")
	private WebElement subject;
	
	@FindBy(xpath="//select[@class='form-control input-sm']")
	private WebElement entrie;
	
	@FindBy(id="name")
	private WebElement subname;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchtext;
	
	
	@FindBy(xpath="//a[text()='Delete']")
	private WebElement delete;
	
	
	@FindBy(xpath="//button[@class='close']")
	private WebElement popup;
	
	
	@FindBy(xpath="//a[@data-toggle='modal']")
	private WebElement edit;
	
	@FindBy(xpath="//input[@id='name1']")
	private WebElement newvalue;
	
	public WebElement getNewvalue() {
		return newvalue;
	}
	@FindBy(xpath="//button[@id='btnSubmit1']")
	private WebElement update;

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getUpdate() {
		return update;
	}

	public WebElement getPopup() {
		return popup;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getSearchtext() {
		return searchtext;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSubname() {
		return subname;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getEntrie() {
		return entrie;
	}
	
	public void addSubject(String subname)
	{
		getSubject().click();
		getSubname().sendKeys(subname);
		getSubmit().click();
	}
	public void subAdd(String subname)
	{
		getSubject().click();
		getSubname().sendKeys(subname);

}
	
	public void searchSubject(String name)
	{
		getSearchtext().sendKeys(name);
	}
	
	public void  searcht(String name)
	{
		getSearchtext().sendKeys(name);
		getDelete().click();
	}
	
	
	public void updateValue(String subject,String newaubject)
	{
		getSearchtext().sendKeys(subject);
		getEdit().click();
		getNewvalue().clear();
		getNewvalue().sendKeys(newaubject);
		getUpdate().click();
		
		driver.quit();
	}
}
