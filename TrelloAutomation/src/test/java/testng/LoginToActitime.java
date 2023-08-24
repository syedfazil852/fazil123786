package testng;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginToActitime {
	public WebDriver driver;
	@Test
	public void loginToActiTimeTest() throws Throwable
	{
	Properties pobj=new Properties();
	pobj.load(new FileInputStream("./src/test/resources/demo.properties"));
	String browsername=pobj.getProperty("browser");
	if(browsername.equals("chrome"))
	{
		driver=new ChromeDriver();
	}else if(browsername.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get(pobj.getProperty("url"));
	//identify the username textfield
	WebElement usernametextfield=driver.findElement(By.id("username"));
	usernametextfield.sendKeys(pobj.getProperty("username"));
	Thread.sleep(5000);
	//identify the password textfield
	WebElement passwordtextfield=driver.findElement(By.name("pwd"));
	passwordtextfield.sendKeys(pobj.getProperty("password"));
	Thread.sleep(5000);

	//identify the login button
	WebElement loginbutton=driver.findElement(By.id("loginButton"));
	loginbutton.click();
	Thread.sleep(5000);
	driver.quit();
	
	
	
		
		
		
		
		
	}

}
