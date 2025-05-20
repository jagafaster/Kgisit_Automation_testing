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

public class TS_10 extends BaseClass {

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
	
	@Test
	public void TC_019() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//contact link function
			WebElement contact = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/ul/a[4]/p"));
			contact.click();
			
			
		}catch (Exception e){
			System.out.println("TC_019 - Test Failed: " + e.getMessage());  
	        screenShot("TC_019");  
	        throw e;  
		}
	}
	
	@Test
	public void TC_020() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app/contact");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//contact link function
			WebElement contact = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/ul/a[4]/p"));
			contact.click();
			
			try {
				// Assertion
		        String currentUrl = driver.getCurrentUrl();
		        Assert.assertEquals(currentUrl, "https://forever-frontend-gules.vercel.app/contact", "home did not navigate correctly!");
			}catch (Exception e){
				System.out.println("TC_020 - Test Failed: " + e.getMessage());  
		        screenShot("TC_020");  
		        throw e;  
			}
			
			
		}catch (Exception e){
			System.out.println("TC_020 - Test Failed: " + e.getMessage());  
	        screenShot("TC_020");  
	        throw e;  
		}
	}
	
	
	@AfterMethod
	public void afterTestCase() {
		System.out.println("After Test Case: Closing browser");
		closeEntireBrowser();
	}
	
}
