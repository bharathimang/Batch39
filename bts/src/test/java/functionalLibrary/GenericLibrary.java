package functionalLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import pages.BasePage;

public class GenericLibrary extends BasePage {
	
	public static void validateFieldDisplayedAndEnabled(WebElement ele) {
		if(ele.isDisplayed() && ele.isEnabled()) {
			System.out.println("Pass: The Element is displayed and Enabled");
		}else {
			System.err.println("Fail: The Element is displayed and Enabled");
		}
	}
	
	public static void createScreenCapture(String fileName) throws Throwable {
		TakesScreenshot ss=(TakesScreenshot) driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dest=new File("src/test/resources/output/"+fileName+".png");
		FileHandler.copy(src, dest);
	}

}
