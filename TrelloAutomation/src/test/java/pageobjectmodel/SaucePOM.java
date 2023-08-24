package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaucePOM {
		@FindBy(id="user-name") WebElement username;
		@FindBy(id="password") WebElement password;
		@FindBy(id="login-button") WebElement  loginbutton;
		
		public SaucePOM(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void enterUserNamePaaswordName(String UN,String PW)
		{
			username.sendKeys(UN);
			password.sendKeys(PW);
			loginbutton.click();
			
		}

		
			
		
}
