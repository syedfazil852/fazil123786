package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
	
	@FindBy(id="username")
	private WebElement userTB;
	
	@FindBy(name="pwd")
	private WebElement paswordTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement logBT;

	public LoginPagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String Un)
	{
		userTB.sendKeys(Un);
	}
	public void passText(String Pw)
	{
		paswordTB.sendKeys(Pw);
	}
	public void loginBt()
	{
		logBT.click();	
	}
}
