package com.inav.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.inav.generic.BaseTest;
import com.inav.generic.ExcelData;
import com.inav.pom.Inav_AccountPage;
import com.inav.pom.LoginPage;

public class CreateTroublecall extends BaseTest {
	
@Test()
	
	public void verifyCreateTrouble() throws InterruptedException, AWTException
	{
		String username=ExcelData.getData("Sheet1",1,0);
		String password=ExcelData.getData("Sheet1",1,1);
		String Iusername=ExcelData.getData("Sheet2",1,0);
		String Ipassword=ExcelData.getData("Sheet2",1,1);
		String AccountNumber=ExcelData.getData("Sheet3",1,0);
		String AgentId=ExcelData.getData("Sheet3",1,1);



		LoginPage lp=new LoginPage(driver);
		Inav_AccountPage Ip=new Inav_AccountPage(driver);

		lp.enterusername(username);
		lp.enterpass(password);
		lp.entercheckbox();
		Thread.sleep(10000);
		lp.Ientercheckbox();
		lp.Icomuser(Iusername);
		lp.Icompass(Ipassword);
		Thread.sleep(10000);
		lp.ClickLogin();
		Thread.sleep(10000);
	driver.switchTo().frame("ext-comp-1105Id");
	Ip.clicksite();
	Ip.clicksiteid();

	//Ip.clicksiteid1();
	
	/*WebElement web=driver.findElement(By.xpath("//div[text()='NE - Omaha -132']"));
	act.moveToElement(web).click().perform();*/
	Thread.sleep(10000);
	Actions act=new Actions(driver);

	/*WebElement ele1=driver.findElement(By.xpath("//input[@id='searchType']"));
	ele1.click();
	WebElement web1=driver.findElement(By.xpath("//div[text()='Account Number']"));
	act.moveToElement(web1).click().perform();*/
	Ip.clickAccount();
	Thread.sleep(10000);
	Ip.accountoption();
	Thread.sleep(10000);
    Ip.EnterAccount(AccountNumber);
	Thread.sleep(20000);

	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(20000);

	/*JavascriptExecutor j=(JavascriptExecutor)driver;
	String click="document.getElementById('location').click()";
	j.executeScript(click);*/
	/* Actions Act=new Actions(driver);
	 Act.moveToElement(ele).click();*/
	Set<String> allwh=driver.getWindowHandles();
	for (String wh: allwh)
	{
		driver.switchTo().window(wh);
		String title=driver.getTitle();
		if (title.equals("iNav Portal - QA"))
		{
		 break;
		}
		Thread.sleep(10000);
	}

	Thread.sleep(20000);
	driver.findElement(By.xpath("//div[@id='tabbar-1070-innerCt']"));
	driver.findElement(By.xpath("//span[text()='Tech Support']")).click();
	Thread.sleep(20000);
	driver.switchTo().frame("techSupportFrameId");
	//Actions actions = new Actions(driver);
	//actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,5000)");
	driver.findElement(By.xpath("//div[@id='ext-comp-1052']"));
	driver.findElement(By.xpath("//button[@id='ext-gen368']")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("//div[@id='ext-comp-1195']"));
	driver.findElement(By.xpath("//button[@id='ext-gen838']")).click();
	driver.findElement(By.xpath("//div[@id='ext-gen387']"));
	driver.findElement(By.xpath("//input[@name='woCreateServiceCategory']")).click();
	WebElement Workcategory=driver.findElement(By.xpath("//div[text()='Data/HSI']"));
act.moveToElement(Workcategory).click().perform();
Thread.sleep(10000);
driver.findElement(By.xpath("//input[@name='woProblemCode']")).click();
WebElement problemcode=driver.findElement(By.xpath("//div[text()='H1 - MODEM FAILURE']"));
act.moveToElement(problemcode).click().perform();
Thread.sleep(10000);

driver.findElement(By.xpath("//input[@name='woStageCodeCb']")).click();
WebElement Stagecode=driver.findElement(By.xpath("//div[text()='BL - BILLING']"));
act.moveToElement(Stagecode).click().perform();
Thread.sleep(10000);
driver.findElement(By.xpath("//input[@name='woCreateCallAheadType']")).click();
WebElement Element1=driver.findElement(By.xpath("//div[text()='Home']"));
act.moveToElement(Element1).click().perform();
Thread.sleep(10000);
driver.findElement(By.xpath("//input[@id='woOfficeOnly']")).click();
Thread.sleep(10000);
Ip.EnteragentId(AgentId);
Thread.sleep(10000);
driver.findElement(By.xpath("//input[@name='woSolutionCode']")).click();
WebElement Solutioncode=driver.findElement(By.xpath("//div[text()='70 - COMPLETED']"));
act.moveToElement(Solutioncode).click().perform();
Thread.sleep(10000);
driver.findElement(By.xpath("//input[@name='woFindingCode']")).click();
WebElement Findingcode=driver.findElement(By.xpath("//div[text()='98 - COMPLETED']"));
act.moveToElement(Findingcode).click().perform();
driver.findElement(By.xpath("//button[@id='ext-gen316']")).click();
//WebDriverWait wait=new WebDriverWait(driver, 10);
Thread.sleep(10000);
driver.findElement(By.xpath("//div[@id='ext-gen397']"));
WebElement element3=driver.findElement(By.xpath("//div[@id='woCreateResultResNumber']"));
String text=element3.getText();
Reporter.log(text);


}
}