package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatIfWrongAdress {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//find the element of login button
		WebElement loginbutton=driver.findElement(By.id("u_0_5_MY"));
		Thread.sleep(3000);
		loginbutton.click();
		
		//reason - when we write the wrong address
	}

}
