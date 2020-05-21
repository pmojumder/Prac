package com.inav.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inav.generic.BasePage;

public class Inav_AccountPage extends BasePage {
	
	@FindBy(xpath="//input[@id='location']")
	private WebElement Site;

	@FindBy(xpath="//div[text()='NE - Omaha -132']")
private WebElement SiteID;
	
	/*@FindBy(xpath="//div[text()='CA - Orange County -333']")
	private WebElement SiteIDORANGE;*/
	
	
	@FindBy(xpath="//input[@id='searchType']")
	private WebElement AccountSearch;
	@FindBy(xpath="//div[text()='Account Number']")
	private WebElement SelectAccount;
	@FindBy(xpath="//input[@id='searchValue']")
	private WebElement Account;
	@FindBy(xpath="//input[@id='woAgent']")
	private WebElement AgentId;

	public Inav_AccountPage(WebDriver driver)
	{
		super(driver);
	PageFactory.initElements(driver, this);
	}

	public void clicksite()
	{
	 Site.click();
	}
	public void EnterAccount(String ac)
	{
	 Account.sendKeys(ac);
	}
	
	public void clicksiteid()
	{
		Actions act=new Actions(driver);
		act.moveToElement(SiteID).click().perform();
		
	}
	
	/*public void clicksiteid1()
	{
		Actions act=new Actions(driver);
		act.moveToElement(SiteIDORANGE).click().perform();
		
	}*/
	
	public void clickAccount()
	{
	 AccountSearch.click();
	}
	
	public void accountoption()
	{
		Actions act1=new Actions(driver);
		act1.moveToElement(SelectAccount).click().perform();

	}
	public void EnteragentId(String ID)
	{
		AgentId.sendKeys(ID);

	}


}
