package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTable {
	public WebDriver driver;
	public TimeTable(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='timetable.php']")
	private WebElement TimeTable;
	
	@FindBy(xpath="//select[@class='form-control']")
	private WebElement select;
	public WebElement getTimeTable() {
		return TimeTable;
	}

	public WebElement getSelect() {
		return select;
	}

}
