package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.DashBoardPage;
import pages.LoginPage;
import pages.MyInfoPage;

public class ModifyPersonalDetails extends BasePage{

	@Test
	public void testCase1() throws Throwable {
		LoginPage lp=new LoginPage();
		lp.validateFields();
		lp.doLogin();
		
		DashBoardPage dp=new DashBoardPage();
		dp.clickOnMyInfo();
		
		MyInfoPage mp=new MyInfoPage();
		mp.modifyPersonalDetails();
	}

}
