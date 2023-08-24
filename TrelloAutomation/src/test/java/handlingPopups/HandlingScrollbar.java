package handlingPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingScrollbar {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		//using java script
		/*JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,3000)");*/
		//using action class
		Actions action=new Actions(driver);
		action.scrollByAmount(0,4000).perform();
		

	}
}
