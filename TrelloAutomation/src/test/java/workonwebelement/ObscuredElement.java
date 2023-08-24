package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObscuredElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		// org.openqa.selenium.ElementClickInterceptedException:
		WebElement customerservice=driver.findElement(By.xpath("(//a[text()=\"Today's Deals\"])/following-sibling::a[text()='Customer Service']"));
		
		//it has obscured element(barrier)
		//handle the Obscured element
		WebElement obscuredelement=driver.findElement(By.xpath("( //span[contains(.,\" Don't Change\")])/preceding-sibling::input"));
		obscuredelement.click();customerservice.click();
		
		}

}
