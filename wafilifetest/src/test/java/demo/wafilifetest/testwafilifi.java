package demo.wafilifetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class testwafilifi extends driverset_test {
	
	public static String url="https://www.wafilife.com/";
	
	@Test
	
	public static void wafilife() throws InterruptedException {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		
		driver.findElement(By.xpath("//*[@id=\"menu-main-menu-1\"]/li[4]/a/span")).click();
		
		jse.executeScript("window.scrollBy(0,900)");
		
		//click next arrow
		driver.findElement(By.xpath("//a[contains(text(),'→')]")).click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		
		//author 
		driver.findElement(By.xpath("//h3[contains(text(),'Anamika Huq Lilly')]")).click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		
		//order
		driver.findElement(By.xpath("//a[text()=\"গ্রেটওয়ালের দেশে\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"অর্ডার করুন\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]")).click();
		Thread.sleep(2000);
		
		//billing information
		driver.findElement(By.xpath("//input[@id='billing_first_name']")).sendKeys("Pranto Sharma");
		driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("12694652");
		driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("Pranto@15963.gail.com");
		
		Select dristrict = new Select(driver.findElement(By.xpath("//select[@id='billing_state']")));
		dristrict.selectByValue("BD-53");
		jse.executeScript("window.scrollBy(0,350)");
		Thread.sleep(2000);
		
		Select area = new Select(driver.findElement(By.xpath("//select[@id='billing_area']")));
		area.selectByValue("379");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@id='billing_address_1']")).sendKeys("house;t/23,mohammadpur,dhaka");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-350)");
		Thread.sleep(2000);
		
		//bill by nagad
		jse.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//*[@id=\"payment\"]/ul/li[4]/label/img")).click();
		Thread.sleep(4000);	
			
	}
		

}
