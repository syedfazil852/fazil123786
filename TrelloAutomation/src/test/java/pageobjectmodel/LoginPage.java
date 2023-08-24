package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	@Test
	public void login()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		 LoginPagePOM lg=new  LoginPagePOM(driver);
		 lg.enterUsername("admin");
		 lg.passText("manager");
		 lg.loginBt();
	}
}
