package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DemoAssertion {
	@Test
		public void verifyTitle() {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			String eTitle = "Google";
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
			driver.close();
			//SoftAssert s=new SoftAssert();
			//s.assertEquals(aTitle, eTitle);
			//driver.close();
			///s.assertAll();
			
		}
}
