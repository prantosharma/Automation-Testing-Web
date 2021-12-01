package autotest.testrokomari;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class testbasic extends driverset {
	
	public static String url="https://www.rokomari.com/book";
	
	//static JavascriptExecutor js =(JavascriptExecutor) driver;
	
	@Test
	public static void rokomari() throws InterruptedException {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		Actions act= new Actions(driver);
			
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='j_username']")).sendKeys("prantosharma7539@gmail.com");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"j_password\"]")).sendKeys("pranto@1995");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='js--authors']")).click();
		
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//body/section[@id='authorList']/div[3]/section[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/img[1]")).click();
		js.executeScript("window.scrollBy(0,400)");
		
		// Scroll Down and go to Next Page
		driver.findElement(By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]")).click();
		js.executeScript("window.scrollBy(0,5500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,600)");
		WebElement book= driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/section[2]/div[2]/div/div[1]/div/a"));
		String bookelmt= book.getCssValue("box-shadow");
		act.moveToElement(book).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[2]/section[2]/div[2]/div[1]/div[5]/div[1]/div[1]/a[1]")).click();
		
		driver.findElement(By.xpath("//body[1]/div[5]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/a[2]/span[1]")).click();
		
		driver.findElement(By.xpath("//*[@id='cart-icon']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Go to Shipping Page')]")).click();

		//order shipping form
		Select country = new Select( driver.findElement(By.xpath("//select[@id='js--country']")));
		
		country.selectByVisibleText("Bangladesh");
		
		Thread.sleep(2000);
		
		Select city = new Select (driver.findElement(By.xpath("//select[@id='js--city']")));
		city.selectByVisibleText("রাজবাড়ী");
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		
		Select area  = new Select(driver.findElement(By.xpath("//select[@id='js--area']")));
		area.selectByValue("233");
		Thread.sleep(2000);
		
		Select zone= new Select(driver.findElement(By.xpath("//select[@id='js--zone']")));
		zone.selectByVisibleText("নবাবপুর ইউনিয়ন");
		Thread.sleep(2000);
		
		
		js.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("//body/div[@id='shipping-payment']/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[2]/textarea[1]")).sendKeys("house t/23");
		js.executeScript("window.scrollBy(0,700)");
		driver.findElement(By.xpath("//span[contains(text(),'Cash on Delivery')]")).click();
		Thread.sleep(3000);
		
		//confirm order
		//driver.findElement(By.xpath("//span[contains(text(),'Confirm Order')]")).click();
		
		Thread.sleep(2000);
		
			
	
		
		
	}

}
