package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNewWindow {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.quit();
	}

}
