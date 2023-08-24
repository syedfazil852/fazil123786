package workonwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatHappensWithWrongUsageOfSubmit {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement loginbutton=driver.findElement(By.id("loginButton"));
		//java.lang.UnsupportedOperationException-java-runtime
		//note:submit() can be called upon the <form> nested element
		loginbutton.submit();
	}

}
