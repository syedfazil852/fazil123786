package handlingPopups;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingtoBottomOfaWebpage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		//scroll,to bottom of the web page
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//scroll to top of the web page
		Thread.sleep(4000);
		j.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(4000);
		driver.quit();
	}

}
