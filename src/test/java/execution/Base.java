package execution;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {
public static WebDriver driver;
	@Test
	public void startup() {
		
		
	
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		
		driver.close();

		
		
	}
	public void screen() throws IOException {
	File take=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(take,new File(""));
	
	// please take care of this 
}
}


