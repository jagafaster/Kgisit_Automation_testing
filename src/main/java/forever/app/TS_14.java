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

public class TS_14 extends BaseClass {

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
	//Verify that user icon in navbar is clickable
	@Test
	public void TC_030() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//user icon function
			WebElement userIcon = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/img"));
			userIcon.click();
			
			
		}catch (Exception e){
			System.out.println("TC_030 - Test Failed: " + e.getMessage());  
	        screenShot("TC_030");  
	        throw e;  
		}
	}
	
	//Verify that search icon in navbar is clickable and opens a dropdown options
	@Test
	public void TC_031() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//user icon function			
			WebElement userIcon1 = driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div[1]/div[1]/div/img"));
			userIcon1.click();
			
			
		}catch (Exception e){
			System.out.println("TC_031 - Test Failed: " + e.getMessage());  
	        screenShot("TC_031");  
	        throw e;  
		}
	}
	
	//Verify that dropdown myprofile option is visible and present user icon in navbar is clickable
	
	@Test
	public void TC_032() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//user icon function			
			WebElement userIcon1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/img"));
			userIcon1.click();
			
			WebElement userIconDropdown = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/div/div/p[1]"));
			userIconDropdown.click();
			
			
		}catch (Exception e){
			System.out.println("TC_032 - Test Failed: " + e.getMessage());  
	        screenShot("TC_032");  
	        throw e;  
		}
	}
	
	//Verify that dropdown myprofile option in user icon is redirecting to profile page by clicking on it
	
	@Test
	public void TC_033() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//user icon function			
			WebElement userIcon1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/img"));
			userIcon1.click();
			
			//myprofile
			WebElement userIconDropdown = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/div/div/p[1]"));
			userIconDropdown.click();
			
			try {
				// Assertion
		        String currentUrl = driver.getCurrentUrl();
		        Assert.assertEquals(currentUrl, "https://forever-frontend-gules.vercel.app/my-profile", "myprofile did not navigate correctly!");
			}catch (Exception e){
				System.out.println("TC_033 - Test Failed: " + e.getMessage());  
		        screenShot("TC_033");  
		        throw e;  
			}
			
			
		}catch (Exception e){
			System.out.println("TC_033 - Test Failed: " + e.getMessage());  
	        screenShot("TC_033");  
	        throw e;  
		}
	}
	
	
	//Verify that dropdown orders option is visible and present user icon in navbar is clickable
	@Test
	public void TC_034() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//user icon function			
			WebElement userIcon1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/img"));
			userIcon1.click();
			
			//orders
			WebElement userIconDropdown = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/div/div/p[2]"));
			userIconDropdown.click();
			
			
		}catch (Exception e){
			System.out.println("TC_034 - Test Failed: " + e.getMessage());  
	        screenShot("TC_034");  
	        throw e;  
		}
	}
	
	
	//Verify that dropdown orders option in user icon is redirecting to order page by clicking on it
	@Test
	public void TC_035() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//user icon function			
			WebElement userIcon1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/img"));
			userIcon1.click();
			
			//orders
			WebElement userIconDropdown = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/div/div/p[2]"));
			userIconDropdown.click();
			
			try {
				// Assertion
		        String currentUrl = driver.getCurrentUrl();
		        Assert.assertEquals(currentUrl, "https://forever-frontend-gules.vercel.app/orders", "orders page did not navigate correctly!");
			}catch (Exception e){
				System.out.println("TC_035 - Test Failed: " + e.getMessage());  
		        screenShot("TC_035");  
		        throw e;  
			}
			
			
		}catch (Exception e){
			System.out.println("TC_035 - Test Failed: " + e.getMessage());  
	        screenShot("TC_035");  
	        throw e;  
		}
	}
	
	
	//Verify that dropdown logout option is visible and present user icon in navbar is clickable
	@Test
	public void TC_036() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//user icon function			
			WebElement userIcon1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/img"));
			userIcon1.click();
			
			//login
			WebElement userIconDropdown = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/div/div/p[3]"));
			userIconDropdown.click();			
			
		}catch (Exception e){
			System.out.println("TC_036 - Test Failed: " + e.getMessage());  
	        screenShot("TC_036");  
	        throw e;  
		}
	}
	
	@Test
	public void TC_037() throws Exception {
		try{
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//user icon function			
			WebElement userIcon1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/img"));
			userIcon1.click();
			
			//login
			WebElement userIconDropdown = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div/div/div/p[3]"));
			userIconDropdown.click();
			
			try {
				// Assertion
		        String currentUrl = driver.getCurrentUrl();
		        Assert.assertEquals(currentUrl, "https://forever-frontend-gules.vercel.app/login", "login page did not navigate correctly!");
			}catch (Exception e){
				System.out.println("TC_037 - Test Failed: " + e.getMessage());  
		        screenShot("TC_037");  
		        throw e;  
			}
			
			
		}catch (Exception e){
			System.out.println("TC_037 - Test Failed: " + e.getMessage());  
	        screenShot("TC_037");  
	        throw e;  
		}
	}
	
	
	
	
	@AfterMethod
	public void afterTestCase() {
		System.out.println("After Test Case: Closing browser");
		closeEntireBrowser();
	}
	
}
