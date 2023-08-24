package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorIndependentAndDependentXpath {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//label[text()='Male']/../input[@type='radio']"));
		element.click();
		
	}

}
