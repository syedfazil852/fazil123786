package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSwitchToWindow {
       public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.facebook.com/");
		Thread.sleep(3000);
		for(String wid:driver.getWindowHandles())
		{
			String url=driver.switchTo().window(wid).getCurrentUrl();
			if(url.equals("https://www.instagram.com/"))
			{
				driver.close();
			}
			else if(url.equals("https://www.facebook.com/"))
			{
				driver.close();
			}
			
		}
        
	}
}
