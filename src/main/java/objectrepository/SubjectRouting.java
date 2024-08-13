package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubjectRouting {
	public WebDriver driver;
	public SubjectRouting(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='subject_routing.php']")
	private WebElement subjectro;
	
	@FindBy(xpath="//a[@href='#modalInsertform']")
	private WebElement addsubject;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchit;
	
	@FindBy(xpath="//select[@id='grade']")
	private WebElement grade;
	
	@FindBy(xpath="//select[@id='subject']")
	private WebElement subject;
	
	@FindBy(xpath="//select[@id='teacher']")
	private WebElement teacher;
	
	@FindBy(xpath="//input[@id='fee']")
	private WebElement fee;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//a[@id='delete_sfee_19']")
	private WebElement delete;
	
	@FindBy(xpath="//a[@id='btnYes']")
	private WebElement yes;
	
	
	@FindBy(xpath="//select[@name='example1_length']")
	private WebElement show;
	
	@FindBy(xpath="//td[@id='action_19']")
	private WebElement editit;
	
	@FindBy(xpath="//button[@id='btnSubmit1']")
	private WebElement update;
	
	public WebElement getEditit() {
		return editit;
	}

	public WebElement getUpdate() {
		return update;
	}

	public WebElement getShow() {
		return show;
	}

	public WebElement getYes() {
		return yes;
	}




	public WebElement getDelete() {
		return delete;
	}




	public WebElement getSubmit() {
		return submit;
	}



	public WebElement getTeacher() {
		return teacher;
	}



	public WebElement getFee() {
		return fee;
	}



	public WebElement getAddsubject() {
		return addsubject;
	}



	public WebElement getSearchit() {
		return searchit;
	}



	public WebElement getGrade() {
		return grade;
	}



	public WebElement getSubject() {
		return subject;
	}



	public WebElement getSubjectro() {
		return subjectro;
	}
	

}
