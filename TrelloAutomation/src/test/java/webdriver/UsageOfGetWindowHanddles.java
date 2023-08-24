package webdriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetWindowHanddles {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.facebook.com/");
		Set<String> allwindowsid=driver.getWindowHandles();
		//check for how many windows id
		int windowsid=allwindowsid.size();
		System.out.println(windowsid);
		//iterates the set of windowsid
		for(String wid:allwindowsid)
		{
			System.out.println(wid);
		}
	}

}
