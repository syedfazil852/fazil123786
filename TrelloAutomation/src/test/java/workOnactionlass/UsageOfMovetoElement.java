package workOnactionlass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfMovetoElement {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		WebElement forgettenpassword = driver.findElement(By.linkText("Forgotten password?"));
		Actions actions=new Actions(driver);
		Thread.sleep(5000);
		actions.pause(2000) .moveToElement(forgettenpassword).perform();
		driver.manage().window().minimize();
		driver.quit();
	}
}
