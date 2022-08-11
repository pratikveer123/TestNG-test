package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Baseclass {
	
 public static WebDriver driver;
	
	@BeforeMethod
	public void BM() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
         driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
	       Thread.sleep(3000);
	    
	}
			
	
	@AfterMethod
	public void AM()
	{
		driver.close();
	}


}
