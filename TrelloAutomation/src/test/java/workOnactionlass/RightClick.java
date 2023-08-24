package workOnactionlass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		
		Actions actions=new Actions(driver);
		WebElement facebooklogo = driver.findElement(By.cssSelector("img[class='fb_logo _8ilh img']"));
		actions.contextClick(facebooklogo).perform();
		// it will click at (0,0)i.e left top most corner
		actions.contextClick().perform();
}
}
