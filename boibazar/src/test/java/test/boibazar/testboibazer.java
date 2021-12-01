package test.boibazar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testboibazer extends driverset {
	
	public static String url = "https://www.boibazar.com/";
	
	@Test
	public static void boibazar() throws InterruptedException{
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		
		WebElement elnt =driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/div/div/div[3]/div/div[2]/ul/li[2]/a "));
		Actions act= new Actions(driver);
		String btncolor = elnt.getAttribute("background-color");
		act.moveToElement(elnt).build().perform();
		String btnafter =elnt.getCssValue("color");
		Thread.sleep(2000);
		
		WebElement afterhover = driver.findElement(By.xpath("//span[contains(text(),'হুমায়ূন আহমেদ')]"));
		String bookauthor = afterhover.getCssValue("background");
		act.moveToElement(afterhover).perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'হুমায়ূন আহমেদ')]")).click();
		
		jse.executeScript("window.scrollBy(0,280)");
		
		WebElement bishoy=driver.findElement(By.xpath("//a[@id='categoryList']"));
		String bishoymark= bishoy.getCssValue("background-color");
		act.moveToElement(bishoy).perform();
		String bishoafterymark = bishoy.getCssValue("-webkit-tap-highlight-color");
		
		driver.findElement(By.xpath("//input[@id='category2']")).click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,550)");
		driver.findElement(By.xpath("//a[@id='addbtn756']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='fb-root']")).click();
		
		//click cart icon
		driver.findElement(By.xpath("//span[contains(text(),'CART')]")).click();
		Thread.sleep(1000);
		//click next button
		driver.findElement(By.xpath("//button[@id='checkout-btn']")).click();
		
		//create account
		driver.findElement(By.xpath("//input[@id='mobile-no-input']")).sendKeys("017599654");
		driver.findElement(By.xpath("//button[text()=\"NEXT\"]")).click();
		driver.findElement(By.xpath("//input[@id='ca-name-input']")).sendKeys("pranto sharma");
		driver.findElement(By.xpath("//input[@id='ca-email-input']")).sendKeys("prantro@344");
		driver.findElement(By.xpath("//input[@id='password-input-signup']")).sendKeys("12345@boibazer");
		//two feild district and thana are not complele
		
		//address part
		driver.findElement(By.xpath("//textarea[@id='receiver-address-input']")).sendKeys("mohammadpur,dhaka");
		//click next
		driver.findElement(By.xpath("//button[@id='next-btn-shipping']")).click();
		
	}
	
	
	

}
