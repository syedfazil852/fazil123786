package handlingPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingdisablesElement {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sohai/Desktop/disable.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		RemoteWebDriver r = (RemoteWebDriver) driver;
		Thread.sleep(3000);
		r.executeScript("document.getElementById('d2').value='manager'");
		Thread.sleep(3000);
		driver.findElement(By.id("d3")).click();
		driver.quit();
	}

}
