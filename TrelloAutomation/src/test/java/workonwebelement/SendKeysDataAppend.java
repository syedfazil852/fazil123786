package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysDataAppend {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernametextfield=driver.findElement(By.id("username"));
		usernametextfield.sendKeys("selenium");
		Thread.sleep(3000);
		usernametextfield.clear();
		Thread.sleep(3000);
		usernametextfield.sendKeys("seleniu");
		
	}

}
