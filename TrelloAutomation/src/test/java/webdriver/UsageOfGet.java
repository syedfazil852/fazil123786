package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.instagram.com/");
	}

}
