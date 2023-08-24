package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsageOfGetLocation {
		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			//identify the user name
			WebElement usernametextfield=driver.findElement(By.id("username"));
			Point usernamelocation=usernametextfield.getLocation();
			System.out.println(usernamelocation);
			int usernamestartx=usernamelocation.getX();
			System.out.println("usernamestartx  ="+ usernamestartx);
			int usernamestarty=usernamelocation.getY();
			System.out.println("usernamestarty="+usernamestarty);
			//post condition
			driver.manage().window().minimize();
			driver.quit();
		}
	}
