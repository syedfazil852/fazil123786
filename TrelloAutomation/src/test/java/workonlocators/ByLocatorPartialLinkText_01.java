package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorPartialLinkText_01 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://alvas.org/");
		WebElement element = driver.findElement(By.partialLinkText(
				"Alva’s College of Medical Laboratory Technology &amp; Post Graduate Research Centre"));
		element.click();
	}

}
