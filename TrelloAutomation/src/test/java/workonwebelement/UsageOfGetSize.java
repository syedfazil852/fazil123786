package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//identify the user name
		WebElement usernametextfield=driver.findElement(By.id("username"));
		Dimension usernamesize=usernametextfield.getSize();
		System.out.println(usernamesize);
		int usernamewidth=usernamesize.getWidth();
		System.out.println("usernamewidth  ="+ usernamewidth);
		int usernameheight=usernamesize.getHeight();
		System.out.println("usernameheight="+usernameheight);
		//post condition
		driver.manage().window().minimize();
		driver.quit();

		
	}

}
