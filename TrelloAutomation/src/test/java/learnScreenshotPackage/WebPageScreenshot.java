package learnScreenshotPackage;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageScreenshot {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.samsung.com/in/offer/online/samsung-fest/");
		//explicit type casting
		TakesScreenshot ts = (TakesScreenshot)driver;
		//the image will be stored in src reference but we don't no exactly where it has been stored
		File src = ts.getScreenshotAs(OutputType.FILE);
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		//storing the image in target location which wehave created i.e screenshort folder
		File targetlocation = new File("./sceenshots/"+timestamp+"homepage.png");
		FileUtils.copyFile(src, targetlocation);
		Thread.sleep(5000);
		driver.quit();
	
	}

}
