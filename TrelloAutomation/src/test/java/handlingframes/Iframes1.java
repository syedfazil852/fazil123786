package handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes1 {
 
	 public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/3.141.59/index.html");
			driver.switchTo().frame("packageFrame");
			
			driver.findElement(By.xpath("//a[@title='annotation in org.openqa.selenium']")).click();
			driver.quit();
}
}
