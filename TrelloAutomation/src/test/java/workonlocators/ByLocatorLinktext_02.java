package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocatorLinktext_02 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//find the element of forgotten password
		WebElement forgetpasswordoption=driver.findElement(By.id("toPasswordRecoveryPageLink"));
		forgetpasswordoption.click();
		//NosuchElementException
        WebElement forgetpasswordoption1=driver.findElement(By.linkText("Forgot your password?"));
		forgetpasswordoption1.click();
		
	}

}
