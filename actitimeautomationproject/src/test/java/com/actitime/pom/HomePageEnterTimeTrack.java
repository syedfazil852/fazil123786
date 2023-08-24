package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageEnterTimeTrack {
		@FindBy (xpath="//a[@class='content tasks']") 
		private WebElement taskbutton;
		
		@FindBy (id="logoutLink")
		private WebElement logoutbtn;
		
		public HomePageEnterTimeTrack(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void setTaskButton()
		{
			taskbutton.click();
		}
		public void setLogout()
		{
			logoutbtn.click();
		}
		
}
