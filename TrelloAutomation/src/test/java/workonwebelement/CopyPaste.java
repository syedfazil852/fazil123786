package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify the user name text field
		WebElement usernametextfield=driver.findElement(By.id("email"));
		usernametextfield.sendKeys("selenium");
		Thread.sleep(4000);
		usernametextfield.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(4000);																												
		usernametextfield.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(4000);
		WebElement passwordtextfield=driver.findElement(By.id("pass"));
		passwordtextfield.sendKeys(Keys.CONTROL+"v");
		//post condition
		driver.manage().window().minimize();
		driver.quit();

		
		
	}

}
