package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BYlLocatorLinkText_01 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
        WebElement linktext=driver.findElement(By.linkText("Forgotten password?"));
		Thread.sleep(3000);
        linktext.click();
        Thread.sleep(3000);
	}

}
