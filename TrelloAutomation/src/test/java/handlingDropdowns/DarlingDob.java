package handlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DarlingDob {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		//identify all the dropdowns in webpage
		List<WebElement> alldropdowns = driver.findElements(By.tagName("select"));
		int countofdropdown = alldropdowns.size();
		System.out.println("countofdropdown ="  +  countofdropdown);
		//iterate the dropdowns
		for(WebElement dropdown:alldropdowns) 
		{
			if(dropdown.isDisplayed())
			{
				Select dropdownselect = new Select(dropdown);
			
			if(dropdown.getAttribute("title").equals("Day")) 
			{
				dropdownselect.selectByIndex(7);
			}
			else if(dropdown.getAttribute("title").equals("Month"))
			{
				dropdownselect.selectByIndex(0);
			}
			else if(dropdown.getAttribute("title").equals("Year")) 
			{
				dropdownselect.selectByValue("1999");
			}
			}
			
			
			
		}
		
	}

}

