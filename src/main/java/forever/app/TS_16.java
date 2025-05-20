package forever.app;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TS_16 extends BaseClass {

	@BeforeClass
	public static void browseropen() {
		// To set the system properties and maximize the browser
		System.out.println("BeforeClass");
		Date d = new Date();
		System.out.println("Test case executed at :" + d);
	}
	
	@BeforeMethod
	public void beforeTestCase() {
		// This method is used to navigate to the url before each tes
		launchBrowser();
		windowMaximize();
		
	}
	//Verify that cart icon in navbar is clickable
	@Test
	public void TC_040() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//cart icon function
			WebElement cartIcon = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/a/p"));
			cartIcon.click();
			
			
		}catch (Exception e){
			System.out.println("TC_040 - Test Failed: " + e.getMessage());  
	        screenShot("TC_040");  
	        throw e;  
		}
	}
	
	//Verify that cart icon is redirecting to order page by clicking on it
	@Test
	public void TC_041() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//cart icon function
			WebElement cartIcon = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/a/p"));
			cartIcon.click();
			
			
			try {
				// Assertion
		        String currentUrl = driver.getCurrentUrl();
		        Assert.assertEquals(currentUrl, "https://forever-frontend-gules.vercel.app/cart", "cart page did not navigate correctly!");
			}catch (Exception e){
				System.out.println("TC_041 - Test Failed: " + e.getMessage());  
		        screenShot("TC_041");  
		        throw e;  
			}
			
			
		}catch (Exception e){
			System.out.println("TC_041 - Test Failed: " + e.getMessage());  
	        screenShot("TC_041");  
	        throw e;  
		}
	}
	
	//Verify that cart icon number indicator is changing based on products we add.
	
	@Test
	public void TC_042() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//cart icon function			
			WebElement product1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/a[1]/div/img"));
			product1.click();
			
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div[2]/div/button[2]")).click();
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/button")).click();
			
			 try {
					// Assertion
			        String currentCartNum = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/a/p")).getText();
			        Assert.assertEquals(currentCartNum, "1", "cart did not add correctly!");
				}catch (Exception e){
					System.out.println("TC_042 - Test Failed: " + e.getMessage());  
			        screenShot("TC_042");  
			        throw e;  
				}
			
			
		}catch (Exception e){
			System.out.println("TC_042 - Test Failed: " + e.getMessage());  
	        screenShot("TC_042");  
	        throw e;  
		}
	}
		
	
	
	@AfterMethod
	public void afterTestCase() {
		System.out.println("After Test Case: Closing browser");
		closeEntireBrowser();
	}
	
}
