package handlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetCountOfOptionsInListBox {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		List<WebElement> alldropdowns = driver.findElements(By.tagName("select"));
		System.out.println(alldropdowns.size());
		for(WebElement dropdown:alldropdowns ) 
		{
			if(dropdown.isDisplayed()) 
			{
				Select dropdownselect = new Select(dropdown);
				List<WebElement> alloptions = dropdownselect.getOptions();
				//System.out.println(alloptions.size());
				for(WebElement options: alloptions)
				{
					System.out.println(options.getText());
				}
			}
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
