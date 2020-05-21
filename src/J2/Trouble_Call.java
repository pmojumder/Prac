package J2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trouble_Call {

	// TODO Auto-generated method stub
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver1.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver(options);
		driver.get(
				"https://inav3.qa.cox.com/CoxDTI/Controller.jpf;jsessionid=widt84V8DmyPw0IOzQzWvKy_EfWt9txq7I4WlouGpODTkXRyLPaN!-1143358942");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("B68921");
		driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("Omago@1234");
		driver.findElement(By.xpath("//input[@id='chkNetwork']")).click();
		driver.findElement(By.xpath("//input[@id='chkCentral']")).click();
		driver.findElement(By.xpath("//input[@name='i_username']")).sendKeys("B68921");
		driver.findElement(By.xpath("//input[@name='i_password']")).sendKeys("B68921");
		driver.findElement(By.xpath("//button[@value='Login']")).click();
		Thread.sleep(30000);
		// int size = driver.findElements(By.tagName("iframe")).size();
		// System.out.println(size);
		Thread.sleep(10000);
		driver.switchTo().frame("ext-comp-1105Id");
		WebElement ele = driver.findElement(By.xpath("//input[@id='location']"));
		ele.click();
		Actions act = new Actions(driver);
		WebElement web = driver.findElement(By.xpath("//div[text()='NE - Omaha -132']"));
		act.moveToElement(web).click().perform();
		Thread.sleep(20000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='searchType']"));
		ele1.click();
		WebElement web1 = driver.findElement(By.xpath("//div[text()='Account Number']"));
		act.moveToElement(web1).click().perform();
		Thread.sleep(30000);

		driver.findElement(By.xpath("//input[@id='searchValue']")).sendKeys("48236601");
		Thread.sleep(40000);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(30000);

		/*
		 * JavascriptExecutor j=(JavascriptExecutor)driver; String
		 * click="document.getElementById('location').click()"; j.executeScript(click);
		 */
		/*
		 * Actions Act=new Actions(driver); Act.moveToElement(ele).click();
		 */
		Set<String> allwh = driver.getWindowHandles();
		for (String wh : allwh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			if (title.equals("iNav Portal - QA")) {
				break;
			}
			Thread.sleep(10000);
		}

		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[@id='tabbar-1070-innerCt']"));
		driver.findElement(By.xpath("//span[text()='Tech Support']")).click();
		Thread.sleep(20000);
		driver.switchTo().frame("techSupportFrameId");
		// Actions actions = new Actions(driver);
		// actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		JavascriptExecutor j = (JavascriptExecutor) driver;
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
Thread.sleep(20000);

driver.findElement(By.xpath("//input[@name='woStageCodeCb']")).click();
WebElement Stagecode=driver.findElement(By.xpath("//div[text()='BL - BILLING']"));
act.moveToElement(Stagecode).click().perform();
driver.findElement(By.xpath("//input[@name='woCreateCallAheadType']")).click();
WebElement Element1=driver.findElement(By.xpath("//div[text()='Home']"));
act.moveToElement(Element1).click().perform();
Thread.sleep(30000);
driver.findElement(By.xpath("//input[@id='woOfficeOnly']")).click();
Thread.sleep(30000);
driver.findElement(By.xpath("//input[@id='woAgent']")).sendKeys("99999");
Thread.sleep(30000);
driver.findElement(By.xpath("//input[@name='woSolutionCode']")).click();
WebElement Solutioncode=driver.findElement(By.xpath("//div[text()='70 - COMPLETED']"));
act.moveToElement(Solutioncode).click().perform();
Thread.sleep(30000);
driver.findElement(By.xpath("//input[@name='woFindingCode']")).click();
WebElement Findingcode=driver.findElement(By.xpath("//div[text()='98 - COMPLETED']"));
act.moveToElement(Findingcode).click().perform();
driver.findElement(By.xpath("//button[@id='ext-gen316']")).click();
//WebDriverWait wait=new WebDriverWait(driver, 10);
WebElement element3=driver.findElement(By.xpath("//div[@id='woCreateResultResNumber']"));
String text=element3.getText();
System.out.println(text);


	}
}



