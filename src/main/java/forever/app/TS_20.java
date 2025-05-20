package forever.app;

import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TS_20 extends BaseClass {

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

	// verify the email input field of subscribe to our news letter accepts input
	@Test
	public void TC_063() throws Exception {
		try {
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// product image function
			WebElement emailInput = driver
					.findElement(By.name("mail"));
			emailInput.sendKeys("jaga");
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("TC_063 - Test Failed: " + e.getMessage());
			screenShot("TC_063");
			throw e;
		}
	}
	
		
		@Test
		public void TC_064() throws Exception {
		    try {
		        launchUrl("https://forever-frontend-gules.vercel.app/");
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		        // Locate email input field
		        WebElement emailInput = driver.findElement(By.name("mail"));

		        // Define test inputs
		        String[] testInputs = {"jaga123", "123jaga", "jaga@123.com"};
		        
		        for (String input : testInputs) {
		            emailInput.clear(); // Clear previous input
		            emailInput.sendKeys(input);
		            Thread.sleep(1000);

		            // Retrieve and compare entered value
		            String enteredValue = emailInput.getAttribute("value");
		            try  {
		            	enteredValue.equals(input);
		                System.out.println("Input accepted: " + input);
		            } catch (Exception e) {
		            	System.out.println("TC_064 - Test Failed: " + e.getMessage());
				        screenShot("TC_064");
				        throw e;
		            }
		        }
		    } catch (Exception e) {
		        System.out.println("TC_064 - Test Failed: " + e.getMessage());
		        screenShot("TC_064");
		        throw e;
		    }
		}
		
		
		@Test
		public void TC_065() throws Exception {
		    try {
		        launchUrl("https://forever-frontend-gules.vercel.app/");
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		        // Locate email input field
		        WebElement emailInput = driver.findElement(By.name("mail"));

		        // Define test inputs
		        String[] testInputs = {"jaga123", "123jaga", "jaga@123.com"};
		        
		        for (String input : testInputs) {
		            emailInput.clear(); // Clear previous input
		            emailInput.sendKeys(input);
		            Thread.sleep(1000);

		            // Retrieve and compare entered value
		            String enteredValue = emailInput.getAttribute("value");
		            try  {
		            	enteredValue.equals(input);
		                System.out.println("Input accepted: " + input);
		            } catch (Exception e) {
		            	System.out.println("TC_065 - Test Failed: " + e.getMessage());
				        screenShot("TC_065");
				        throw e;
		            }
		        }
		    } catch (Exception e) {
		        System.out.println("TC_065 - Test Failed: " + e.getMessage());
		        screenShot("TC_065");
		        throw e;
		    }
		}
		
		@Test
		public void TC_066() throws Exception {
		    try {
		        launchUrl("https://forever-frontend-gules.vercel.app/");
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		        WebElement emailInput = driver.findElement(By.name("mail"));
		        String[] testEmails = {"jaga123@example.com", "hello@world", "user@.com", "@domain.com"};

		        for (String email : testEmails) {
		            emailInput.clear();
		            emailInput.sendKeys(email);
		            Thread.sleep(1000);

		            String enteredValue = emailInput.getAttribute("value");
		            System.out.println("Entered: " + enteredValue + " | Expected: " + email);

		            // Check for validation message (if any)
		            try {
		                WebElement errorMessage = driver.findElement(By.cssSelector(".error-message"));
		                System.out.println("Validation Error Displayed: " + errorMessage.getText());
		            } catch (NoSuchElementException e) {
		                System.out.println("No validation error for: " + email);
		                screenShot("TC_066");
		            }
		        }
		    } catch (Exception e) {
		        System.out.println("TC_066 - Test Failed: " + e.getMessage());
		        screenShot("TC_066");
		        throw e;
		    }
		}

	

	@AfterMethod
	public void afterTestCase() {
		System.out.println("After Test Case: Closing browser");
		closeEntireBrowser();
	}

}
