package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHandle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String facebookid=driver.getWindowHandle();
		System.out.println(facebookid);
		driver.quit();
		
	}

}
