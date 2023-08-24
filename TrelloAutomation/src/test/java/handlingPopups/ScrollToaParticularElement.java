package handlingPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToaParticularElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		/*int y = driver.findElement(By.xpath("//span[text()='Future Planet']")).getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,"+y+")");
		Thread.sleep(3000);*/
		// WebElement ty = driver.findElement(By.xpath("//span[text()='Future Planet']"));
		Actions action=new Actions(driver);
	
		action.scrollToElement(driver.findElement(By.xpath("//span[text()='Future Planet']"))).perform()
		;
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
		
	
	}

}
