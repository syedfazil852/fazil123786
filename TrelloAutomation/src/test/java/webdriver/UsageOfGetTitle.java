package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {
	    public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String webpagetitle=driver.getTitle();
		System.out.println("webpageTitle ="+  webpagetitle);
		
		
		

	}
}
