package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy (id="username")
	private WebElement UNTB;
	
	@FindBy(name="pwd")
	private WebElement PWD;
	
	@FindBy (xpath="//div[text()='Login ']")
	private WebElement LGBTN;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setLogin(String username,String password)
	{
		UNTB.sendKeys(username);
		PWD.sendKeys(password);
		LGBTN.click();
	}
	
}
