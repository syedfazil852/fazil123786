package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickRelatedException {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		//WebElement menTshirts = driver.findElement(By.xpath("//a[text()='Topwear']/../..//a[text()='T-Shirts']"));
		WebElement menTshirts = driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Men']"));
		Actions s= new Actions(driver);
		s.moveToElement(menTshirts).perform();
		WebElement menTshirtse = driver.findElement(By.xpath("//a[text()='T-Shirts']"));
// org.openqa.selenium.ElementNotInteractableException:	
		//menTshirts.click();
		Thread.sleep(3000);
		menTshirtse.click();
		driver.manage().window().minimize();
		driver.quit();
	}

}
