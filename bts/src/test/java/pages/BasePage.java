package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import utils.ConfigUtils;
import utils.ExcelUtils;

public class BasePage {
	public static WebDriver driver;
	public static ConfigUtils config;
	public static ExcelUtils excel;

	@BeforeClass
	public void setUp() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		config=new ConfigUtils();
		excel=new ExcelUtils();
		driver.get(config.readConfigData("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

}
