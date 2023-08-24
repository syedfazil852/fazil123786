package handlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleAutosuggestions {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("quran");
		List<WebElement> list = driver.findElements(By.xpath("//li[@role='presentation']//div[@role='presentation']/span"));
		System.out.println(list.size());
		
		for(WebElement listelements:list)
		{
			if(listelements.getText().contains("pdf"))
			{
				listelements.click();
		break;
		}
	}
	
	
	
	}}
