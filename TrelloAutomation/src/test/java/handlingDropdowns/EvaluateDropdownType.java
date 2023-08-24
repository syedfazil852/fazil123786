package handlingDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EvaluateDropdownType {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		//identify the month dropdown
		WebElement monthdropdown = driver.findElement(By.id("month"));
		//create select class object
		Select monthselect = new Select(monthdropdown);
		if(monthselect.isMultiple()) {
			System.out.println("booleantrue");
			System.out.println("month dropdown is multi-select dropdown");
		}else {
			System.out.println("booleanfalse");
			System.out.println("month dropdown is single-select dropdown");
		}
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
