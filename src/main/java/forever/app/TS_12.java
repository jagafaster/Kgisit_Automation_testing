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

public class TS_12 extends BaseClass {

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
	public void TC_023() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//search icon function
			WebElement searchIcon = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/img[1]"));
			searchIcon.click();
			
			
		}catch (Exception e){
			System.out.println("TC_023 - Test Failed: " + e.getMessage());  
	        screenShot("TC_023");  
	        throw e;  
		}
	}
	
	@Test
	public void TC_024() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//search icon function			
			WebElement searchIcon1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/img[1]"));
			searchIcon1.click();
			WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/input"));
			searchInput.sendKeys("men");
			
			
		}catch (Exception e){
			System.out.println("TC_024 - Test Failed: " + e.getMessage());  
	        screenShot("TC_024");  
	        throw e;  
		}
	}
	
	@Test
	public void TC_026() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//searchIcon link function
			
			try {
				// Assertion
				WebElement searchIcon3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/img[1]"));
				searchIcon3.click();
				WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/input"));
				searchInput.sendKeys("men");
				Thread.sleep(2000);
				WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/img"));
				searchButton.click();
				
			}catch (Exception e){
				System.out.println("TC_026 - Test Failed: " + e.getMessage());  
		        screenShot("TC_026");  
		        throw e;  
			}
			
			
		}catch (Exception e){
			System.out.println("TC_026 - Test Failed: " + e.getMessage());  
	        screenShot("TC_026");  
	        throw e;  
		}
	}
	
	@Test
	public void TC_027() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//searchIcon link function
			
			try {
				// Assertion
				WebElement searchIcon = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/img[1]"));
				searchIcon.click();
				WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/input"));
				searchInput.sendKeys("men");
				Thread.sleep(2000);
				WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/img"));
				searchButton.click();
				
				try {
					// Assertion
			        String currentUrl = driver.getCurrentUrl();
			        Assert.assertEquals(currentUrl, "https://forever-frontend-gules.vercel.app/collection", "search did not navigate correctly!");
				}catch (Exception e){
					System.out.println("TC_027 - Test Failed: " + e.getMessage());  
			        screenShot("TC_027");  
			        throw e;  
				}
				
			}catch (Exception e){
				System.out.println("TC_027 - Test Failed: " + e.getMessage());  
		        screenShot("TC_027");  
		        throw e;  
			}
			
			
		}catch (Exception e){
			System.out.println("TC_027 - Test Failed: " + e.getMessage());  
	        screenShot("TC_027");  
	        throw e;  
		}
	}
	
	
	
	
	@AfterMethod
	public void afterTestCase() {
		System.out.println("After Test Case: Closing browser");
		closeEntireBrowser();
	}
	
}
