package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import functionalLibrary.GenericLibrary;

public class MyInfoPage extends BasePage {
	
	public MyInfoPage() {
		PageFactory.initElements(driver, MyInfoPage.this);
	}
	
	@FindBy(xpath="(//input[@value='Edit'])[1]")
	WebElement btnEdit;
	
	@FindBy(name="personal[txtEmpFirstName]")
	WebElement firstName;
	
	@FindBy(id="personal_txtEmpMiddleName")
	WebElement middleName;
	
	@FindBy(name="personal[txtEmpLastName]")
	WebElement lastName;
	
	public void modifyPersonalDetails() throws Throwable {
		btnEdit.click();
		GenericLibrary.createScreenCapture("MyInfoPage");
		
		firstName.clear();
		firstName.sendKeys(excel.readData("Data", 1, 0));

		lastName.clear();
		lastName.sendKeys(excel.readData("Data", 1, 2));
	
		middleName.clear();
		middleName.sendKeys(excel.readData("Data", 1, 1));
		
		GenericLibrary.createScreenCapture("ModifyDetails");
	}
	
	public void modifyContactDetails() {
		
	}

}
