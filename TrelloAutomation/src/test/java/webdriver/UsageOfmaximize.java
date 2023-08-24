package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfmaximize {
	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.dassault-aviation.com/en/");
	}

}
