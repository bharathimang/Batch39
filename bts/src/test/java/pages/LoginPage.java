package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionalLibrary.GenericLibrary;

public class LoginPage extends BasePage {
	
	public LoginPage() {
		PageFactory.initElements(driver, LoginPage.this);
	}
	
	@FindBy(id="txtUsername")
	WebElement userName;
	
	@FindBy(id="txtPassword")
	WebElement pwd;
	
	@FindBy(xpath="//input[@class='button']")
	WebElement btn;
	
	public void validateFields() {
		GenericLibrary.validateFieldDisplayedAndEnabled(userName);
		GenericLibrary.validateFieldDisplayedAndEnabled(pwd);
		GenericLibrary.validateFieldDisplayedAndEnabled(btn);
	}
	
	public void doLogin() throws Throwable {
		userName.sendKeys(config.readConfigData("userName"));
		GenericLibrary.createScreenCapture("test1");
		
		pwd.sendKeys(config.readConfigData("password"));
		GenericLibrary.createScreenCapture("test2");
		
		btn.click();
		GenericLibrary.createScreenCapture("test3");
	}

}
