package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Grade {
	public WebDriver driver;
	public Grade(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='grade.php']")
	private WebElement grade;
	
	@FindAll({@FindBy(xpath="//input[@id='name']"),@FindBy(xpath="//input[@placeholder='Enter name']")})
	private WebElement  gradetype;
	
	@FindAll({@FindBy(xpath="//input[@id='admission_fee']"),@FindBy()})
	private WebElement fee;
	
	@FindAll({@FindBy(xpath="//button[@id='btnSubmit']"),@FindBy(xpath="//button[text()='Next']")})
	private WebElement next;
	
	@FindAll({@FindBy(xpath="//div[@class='panel-heading']/parent::div/descendant::button[@class='close']"),@FindBy(xpath="//h3[@class='panel-title']")})
	private WebElement submit;
	
	@FindAll({@FindBy(xpath="//input[@id='hall_charge']"),@FindBy(xpath="//input[@placeholder='Enter hall charge']")})
	private WebElement hallfree;
	
	@FindAll({@FindBy(xpath="//input[@class='form-control input-sm']"),@FindBy(xpath="//input[@type='search']")})
	private WebElement search;
	
	@FindBy(xpath="//a[text()='Edit']")
	private WebElement edit;
	@FindBy(xpath="//button[@onclick='Updategrade(this)']")
	private WebElement update;
	
	
	@FindBy(xpath="//select[@class='form-control input-sm']")
	private WebElement entrie;
	
	
	public WebElement getEntrie() {
		return entrie;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getUpdate() {
		return update;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getHallfree() {
		return hallfree;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getGradetype() {
		return gradetype;
	}

	public WebElement getFee() {
		return fee;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getGrade() {
		return grade;
	}
	
	public void gradeDetails(String grade,String fee,String per)
	{
		getGrade().click();
		getGradetype().sendKeys(grade);
		getFee().sendKeys(fee);
		getHallfree().sendKeys(per);;
		getNext().click();
		getSubmit().click();
	}
	public void searchDetails(String grade)
	{
		getSearch().sendKeys(grade);
		getEdit().click();
		getUpdate().click();
	}

}
