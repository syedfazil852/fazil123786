package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetPosition {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.FACEBOOK.com/");
		//set the size of window
		Dimension targetwindowsize=new Dimension(200,300);
		driver.manage().window().setSize(targetwindowsize);
		Thread.sleep(3000);
		Point targetwindowposition =new Point(150,300);
		driver.manage().window().setPosition(targetwindowposition);
		Thread.sleep(3000);
		//capture the windowsize
		Dimension windowsize=driver.manage().window().getSize();
		int width=windowsize.getWidth();
		int height=windowsize.getHeight();
		System.out.println(width);
		System.out.println(height);
		//capture the windowposition
		Point windowsizex=driver.manage().window().getPosition();
		int x=windowsizex.getX();
		int y=windowsizex.getY();
		System.out.println(x);
		System.out.println(y);
		
		
		
		
		
	}

}
