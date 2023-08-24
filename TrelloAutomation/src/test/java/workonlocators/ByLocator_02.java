package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocator_02 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		// identify the user name text field
		WebElement usernametextfield = driver.findElement(By.id("username"));
		usernametextfield.sendKeys("admin");
		Thread.sleep(3000);
        // identify the password text field
		WebElement passwordtextfield = driver.findElement(By.name("pwd"));
		passwordtextfield.sendKeys("manager");
		Thread.sleep(3000);
		// identify the login button
		WebElement loginbutton = driver.findElement(By.id("loginButton"));
		loginbutton.click();
	}

}
