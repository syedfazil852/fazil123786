package webdriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSetSize {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.facebook.com/");
	Thread.sleep(3000);
	Dimension targetwindowsize=new Dimension(200,300);
	driver.manage().window().setSize(targetwindowsize);
	
}
}
