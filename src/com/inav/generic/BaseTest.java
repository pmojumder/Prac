package com.inav.generic;

//Abstract class created for reutilization
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Autoconstant
{
 public WebDriver driver;
static
{
	System.setProperty(chrome_key,chrome_value);
}
	@BeforeMethod
	public void precondition() throws InterruptedException
	{
		// driver=new ChromeDriver();
		 ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("useAutomationExtension", false);
			 driver = new ChromeDriver(options);
		 driver.get("https://inav3.qa.cox.com/CoxDTI/Controller.jpf;jsessionid=widt84V8DmyPw0IOzQzWvKy_EfWt9txq7I4WlouGpODTkXRyLPaN!-1143358942");
		 driver.manage().window().maximize(); 
	}  
    /*  @AfterMethod
      public void postcondition()
      {
    	  driver.close();
      }*/
        

}
