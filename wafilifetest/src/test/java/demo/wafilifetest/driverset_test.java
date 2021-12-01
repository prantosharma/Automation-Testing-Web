package demo.wafilifetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class driverset_test {
	
	public static WebDriver driver;
	
	
	@BeforeSuite
	public static void opendriver() {
		System.getProperty("driver.chrome.driver",".//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	
	@AfterSuite
	public static void closedriver() {
		driver.close();
		
		
	}
	
	

}
