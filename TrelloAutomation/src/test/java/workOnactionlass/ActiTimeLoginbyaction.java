package workOnactionlass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLoginbyaction {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		// user name text field
		WebElement usernametextfield = driver.findElement(By.id("username"));
		// password text field
		WebElement passwordtextfield = driver.findElement(By.name("pwd"));
		// login button
		WebElement loginbutton = driver.findElement(By.id("loginButton"));
		// create the object of action class
		Actions actions = new Actions(driver);
		Thread.sleep(5000);
		actions.sendKeys(usernametextfield, "admin").sendKeys(passwordtextfield, "manager").click(loginbutton).build()
				.perform();
		Thread.sleep(5000);

		driver.manage().window().minimize();
		driver.quit();
	}
}
