package J2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Framework {
     
	@Test()
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver1.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
 WebDriver driver=new ChromeDriver(options);
driver.get("https://inav3.qa.cox.com/CoxDTI/Controller.jpf;jsessionid=widt84V8DmyPw0IOzQzWvKy_EfWt9txq7I4WlouGpODTkXRyLPaN!-1143358942");
driver.manage().window().maximize();
	}

}
