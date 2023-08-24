package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneSmallScript {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//enter the user name as admin
		WebElement usernametextfield=driver.findElement(By.id("username"));
		Thread.sleep(3000);
		usernametextfield.clear();
		usernametextfield.sendKeys("admin");
		//enter the password
		WebElement password=driver.findElement(By.name("pwd"));
		password.clear();
		password.sendKeys("manager");
		Thread.sleep(3000);
		//click on login button
		WebElement loginbutton=driver.findElement(By.id("loginButton"));
		loginbutton.click();
		Thread.sleep(3000);


		
	}

}
