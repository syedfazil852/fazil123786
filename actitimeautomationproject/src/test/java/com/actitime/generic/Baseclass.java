package com.actitime.generic;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePageEnterTimeTrack;
import com.actitime.pom.LoginPage;

public class Baseclass {
	public static	WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
	@BeforeMethod
	public void login() throws Throwable
	{
	Filelib f=new Filelib();
	String url = f.getPropertyData("url");
	String username = f.getPropertyData("username");
	String password = f.getPropertyData("password");
	driver.get(url);
	Thread.sleep(3000);
	LoginPage l=new LoginPage(driver);
	l.setLogin(username, password);
	}
	@AfterMethod
	public void logout()
	{
		HomePageEnterTimeTrack h=new HomePageEnterTimeTrack(driver);
	h.setLogout();
	}
}
