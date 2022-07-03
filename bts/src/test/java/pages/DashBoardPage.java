package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BasePage {
	
	public DashBoardPage() {
		PageFactory.initElements(driver, DashBoardPage.this);
	}
	
	@FindBy(xpath="//a[contains(@id,'menu_pim_viewMyDetails')]")
	WebElement myInfoTab;
	
	public void clickOnMyInfo() throws Throwable {
		Thread.sleep(5000);
		myInfoTab.click();
	}

	
	public void validateTitle() {
		System.out.println(driver.getTitle());
	}

}
