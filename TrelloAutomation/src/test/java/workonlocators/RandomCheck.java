package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomCheck {
	public static void main(String[] args) throws Throwable  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/");
	     Thread.sleep(3000);
		// by id
		// driver.findElement(By.id("my-acc-btn")).click();
		// by class name
		// driver.findElement(By.className("transparent")).click();
		// driver.findElement(By.cssSelector("button[class='transparent']")).click();
		// by tag name by chance
		// driver.findElement(By.tagName("button")).click();
		//by css selector
		//driver.findElement(By.cssSelector("button[class='transparent']")).click();
		//driver.findElement(By.cssSelector("button[id='my-acc-btn']")).click();
		//by x path complete attribute value
		//driver.findElement(By.xpath("//button[@class='transparent']")).click();
        //BY X PATH partial attribute value
		//driver.findElement(By.xpath("//button[contains(@class,'parent')]")).click();
		//x path by complete main tag text
		// there is no main tag text
		//x path complete sub tag text
		//driver.findElement(By.xpath("//button[.='Login &nbsp;|&nbsp; Register']")).click();
		//x path by partial sub/main tag text
	     //driver.findElement(By.xpath("//button[contains(.,'Login')] ")).click();
	     //xpath by dependent and independent 
	     driver.findElement(By.xpath("//span[@class='loginRegister']/parent::button")).click();
	}

	}


