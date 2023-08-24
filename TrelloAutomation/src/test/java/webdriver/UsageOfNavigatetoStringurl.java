package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigatetoStringurl {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		
	}

}
