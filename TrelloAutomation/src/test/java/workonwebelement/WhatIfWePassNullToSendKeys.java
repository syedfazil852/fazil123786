package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatIfWePassNullToSendKeys {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//we cannot pass null values to send keys
		//illegal argumentException-java-runtime
		driver.findElement(By.id("email")).sendKeys(null);
	}

}
