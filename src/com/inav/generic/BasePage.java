package com.inav.generic;

//Common methods used in POM class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
public void verifyTitle(String title)
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	try
	{
		wait.until(ExpectedConditions.titleIs(title));
		Reporter.log("Titile is matching" +title,true);
	}
	catch(Exception e)
	{
		Reporter.log("Titile is not matching" +title,true);
		Reporter.log("Titile Actual" +driver.getTitle(),true);

	}
}

}
