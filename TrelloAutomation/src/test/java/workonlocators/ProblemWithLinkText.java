package workonlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemWithLinkText {
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nbtindia.gov.in/");
		
		/*WebElement element=driver.findElement(By.linkText("CATALOGUES"));*/
		WebElement element=driver.findElement(By.partialLinkText("CATALOGUES"));
		
		element.click();
		
	}

}
