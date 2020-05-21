package com.inav.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inav.generic.BasePage;

public class LoginPage extends BasePage
{
	@FindBy(xpath="//input[@name='j_username']")
	private WebElement UsernameTB;
	@FindBy(xpath="//input[@name='j_password']")
	private WebElement PWTB;
	@FindBy(xpath="//input[@id='chkNetwork']")
	private WebElement Checkbox;
	@FindBy(xpath="//input[@id='chkCentral']")
	private WebElement ICOMSCheckbox;
	
	/*@FindBy(xpath="//input[@id='chkData1']")
	private WebElement ICOMSCheckbox1;*/
	@FindBy(xpath="//input[@name='i_username']")
	private WebElement Iuser;
	@FindBy(xpath="//input[@name='i_password']")
	private WebElement Ipass;
	@FindBy(xpath="//button[@value='Login']")
	private WebElement LoginBtn;	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	PageFactory.initElements(driver, this);
	}
public void enterusername(String un)
{
	UsernameTB.sendKeys(un);
}
		
public void enterpass(String pw)
{
	PWTB.sendKeys(pw);
}

public void entercheckbox()
{
	Checkbox.click();
}


public void Ientercheckbox()
{
	ICOMSCheckbox.click();
}


/*public void IentercheckboxData()
{
	ICOMSCheckbox1.click();
}*/


public void Icomuser(String IU)
{
	Iuser.sendKeys(IU);
}

public void Icompass(String IP)
{
	Ipass.sendKeys(IP);
}

public void ClickLogin()
{
	LoginBtn.click();
}
	}
	
	
	


