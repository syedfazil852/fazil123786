package handlingDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleOptions {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/sohai/Desktop/daydropdown.html");
		WebElement daydropdown = driver.findElement(By.id("day"));
		Select dayselect = new Select(daydropdown);
		dayselect.selectByIndex(0);
		Thread.sleep(5000);
		dayselect.selectByIndex(1);
		Thread.sleep(5000);
		dayselect.selectByIndex(2);
		Thread.sleep(5000);

		dayselect.selectByIndex(3);

		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
