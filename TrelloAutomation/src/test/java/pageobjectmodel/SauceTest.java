package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceTest {
		@Test
		public void saucetest() {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/v1/");
			SaucePOM s=new SaucePOM(driver);
			s.enterUserNamePaaswordName("standard_use", "secret_sauc");
		}
}
