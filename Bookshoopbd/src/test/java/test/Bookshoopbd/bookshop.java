package test.Bookshoopbd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class bookshop extends bookdriverset {
	
	public static String url = "https://bookshopbd.com/";
	
	@Test
	public static void bookshopbd() throws InterruptedException {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		
		
		driver.findElement(By.xpath("//header/div[1]/div[3]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("//h5[contains(text(),'হুমায়ূন আহমেদ')]")).click();
		
		jse.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.xpath("//option[contains(text(),'Any Author')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(text(),'হুমায়ূন আহমেদ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'দেবী')]")).click();
		Thread.sleep(2000);
		//confirm order
		driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Confirm Order\" )]")).click();
		
		//billing information
		driver.findElement(By.xpath("//input[@id='billing_first_name']")).sendKeys("Pranto");
		driver.findElement(By.xpath("//input[@id='billing_last_name']")).sendKeys("Sharma");
		
		Select region = new Select(driver.findElement(By.xpath("//select[@id='billing_country']")));
		region.selectByValue("BD");

		driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("12694652");
		driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Dhaka");
		
		Select option = new Select(driver.findElement(By.xpath("//select[@id='billing_state']")));
		option.selectByValue("BD-13");
		
		jse.executeScript("window.scrollBy(0,350)");
		
		driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("1207");
		driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("125596");
		driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("pranto@13456gmail.com");
		
		Thread.sleep(4000);	
		
	} 
			

}
