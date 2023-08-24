package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardSimulationBySendKeys {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify the username textfield
		WebElement usernametextfield=driver.findElement(By.id("email"));
		usernametextfield.sendKeys("syedfazil852@gmail.com");
		Thread.sleep(4000);
		//TAB 2times + enter
		//usernametextfield.sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
		usernametextfield.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(4000);
		usernametextfield.sendKeys(Keys.BACK_SPACE);
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
