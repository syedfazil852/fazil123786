package workOnactionlass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClassModifiers {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		WebElement usernametextfield = driver.switchTo().activeElement();
		Actions actions=new Actions(driver);
		actions.keyDown(usernametextfield, Keys.SHIFT).sendKeys("a").keyUp( Keys.SHIFT).sendKeys("a").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
}
}
