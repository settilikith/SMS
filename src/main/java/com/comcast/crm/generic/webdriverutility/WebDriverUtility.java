package com.comcast.crm.generic.webdriverutility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void waitforpagetoload(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void waitforelementpresent(WebDriver driver,WebElement element)
	{
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void switchNewBrowserTab(WebDriver driver,String partailUrl)
	{
		Set<String> set =driver.getWindowHandles();
		Iterator<String> it =set.iterator();
		while(it.hasNext())
		{
			String wid =it.next();
			driver.switchTo().window(wid);
			String actUrl =driver.getCurrentUrl();
			if(actUrl.contains(partailUrl)) {
				break;
			}
		}
	}
	public void switchToTabonTittle(WebDriver driver,String partailString)
	{
		Set<String> set = driver.getWindowHandles();
		Iterator<String> i =set.iterator();
		while(i.hasNext())
		{
			String w =i.next();
			driver.switchTo().window(w);
			String c =driver.getCurrentUrl();
			if(c.contains(partailString))
			{
				break;
			}
		}
	}
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver,String nameID)
	{
		driver.switchTo().frame(nameID);
	}
	public void switchtoFrame(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public void switchtoAlertAndAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void switchtoAlertandcancel(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public void select(WebElement element,int index)
	{
		Select sel =new Select(element);
		sel.selectByIndex(index);
	}
	public void mousemoveOnElement(WebDriver driver,WebElement element)
	{
		Actions act =new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	public void doubleclick(WebDriver driver,WebElement element)
	{
		Actions act =new Actions(driver);
		act.doubleClick(element).perform();
	}
}
