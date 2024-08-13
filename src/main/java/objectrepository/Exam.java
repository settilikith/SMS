package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Exam {
	
	public WebDriver driver;
	public Exam(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='Exam']")
	private WebElement exam;
	
	@FindBy(xpath="//a[text()='Create Exam']")
	private WebElement createexam;
	
	@FindBy(xpath="//a[text()='Add ']")
	private WebElement add;
	
	@FindBy(xpath="//input[@placeholder='Enter exam name']")
	private WebElement examname;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//a[@href='exam_timetable.php']")
	private WebElement examtimetable;
	
	@FindBy(xpath="//select[@name='grade']")
	private WebElement grade;
	
	@FindBy(xpath="//select[@name='exam']")
	private WebElement selectexam;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement next;
	public WebElement getNext() {
		return next;
	}

	public WebElement getExam() {
		return exam;
	}

	public WebElement getCreateexam() {
		return createexam;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getExamname() {
		return examname;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getExamtimetable() {
		return examtimetable;
	}

	public WebElement getGrade() {
		return grade;
	}

	public WebElement getSelectexam() {
		return selectexam;
	}

}
