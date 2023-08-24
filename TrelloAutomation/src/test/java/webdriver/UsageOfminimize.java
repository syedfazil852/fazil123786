package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfminimize {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(4000);
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.manage().window().fullscreen();
		
	}

}
