package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentUrl {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String actualLoginpageurl=driver.getCurrentUrl();
		System.out.println("actualLoginpageurl="+actualLoginpageurl);
	}

}
