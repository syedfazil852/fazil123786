package handlingDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectOptions {
		public static void main(String[] args) throws Throwable {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("file:///C:/Users/sohai/Desktop/monthdropdown.html");
			WebElement monthdropdown = driver.findElement(By.tagName("select"));
			Select monthselect=new Select(monthdropdown);
			monthselect.selectByIndex(0);
			Thread.sleep(5000);
			monthselect.selectByIndex(1);
			Thread.sleep(5000);

			monthselect.selectByIndex(2);
			Thread.sleep(5000);
			monthselect.deselectByIndex(0);
			
		}
}
