package handlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectCheck {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/sohai/Desktop/daydropdown.html");
		 WebElement daydropdown = driver.findElement(By.tagName("select"));
		Select  dayselect=new Select(daydropdown);
		if(dayselect.isMultiple())
		{
			System.out.println("Boolean true-multiselect");
		}
		else
		{
			System.out.println("Boolean false-singleselect");
		}
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
