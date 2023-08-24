package handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rediff.com/");
			driver.switchTo().frame("moneyiframe");
			String value = driver.findElement(By.id("nseindex")).getText();
			System.out.println(value);
			driver.quit();
		}
}
