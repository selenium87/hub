package execution;

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
		//hehe, please don't forget to close browsers!!!!
		// thanks for reminding me
		//lets do it 
		//again
		//1212121212121212121212
		
		//final
		
		
	}
	
	// add screenshots 
	
	
	
}
