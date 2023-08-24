package handlingDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChectDefaultSelectOption {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/signup");
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select monthselect = new Select(monthdropdown);
		String selectedoption = monthselect.getFirstSelectedOption().getText();
		System.out.println(selectedoption);
		String dayoption = new Select(driver.findElement(By.id("day"))).getFirstSelectedOption().getText();
		System.out.println(dayoption);
		String yearoption = new Select(driver.findElement(By.id("year"))).getFirstSelectedOption().getText();
		System.out.println(yearoption);
		driver.manage().window().minimize();
		driver.quit();
	}

}
