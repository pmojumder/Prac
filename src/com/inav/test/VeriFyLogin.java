package com.inav.test;

//Fetching Credential from excel sheet INAV/ICOMS

import org.testng.annotations.Test;

import com.inav.generic.BaseTest;
import com.inav.generic.ExcelData;
import com.inav.pom.LoginPage;

public class VeriFyLogin extends BaseTest 
{
	@Test()
	public void verifylogin() throws InterruptedException
	{
	String username=ExcelData.getData("Sheet1",1,0);
	String password=ExcelData.getData("Sheet1",1,1);
	String Iusername=ExcelData.getData("Sheet2",1,0);
	String Ipassword=ExcelData.getData("Sheet2",1,1);



	LoginPage lp=new LoginPage(driver);
	lp.enterusername(username);
	lp.enterpass(password);
	lp.entercheckbox();
	lp.Ientercheckbox();
	lp.Icomuser(Iusername);
	lp.Icompass(Ipassword);
	lp.ClickLogin();
	}

}
