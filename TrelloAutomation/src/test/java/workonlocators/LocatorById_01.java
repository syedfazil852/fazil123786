package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorById_01 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//find the element of keep login check box
		WebElement keepLoggedInCheckBox=driver.findElement(By.id("keepLoggedInCheckBox"));
		Thread.sleep(3000);
		keepLoggedInCheckBox.click();
	}

}
