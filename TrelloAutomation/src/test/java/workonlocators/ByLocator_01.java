package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocator_01 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//identify the login button
		WebElement loginbutton=driver.findElement(By.id("loginButton"));
		Thread.sleep(3000);
		//click on button
		loginbutton.click();
	}

}
