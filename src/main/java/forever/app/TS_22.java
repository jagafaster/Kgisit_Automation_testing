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

public class TS_22 extends BaseClass {

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

	// Check if the product images in product tile is redirected to the product page
	// of the same product in best sellers
	@Test
	public void TC_056() throws Exception {
		try {
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// product image function
			WebElement productImage = driver
					.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/a[1]/div/img"));
			productImage.click();

			try {
				// Assertion
				String currentUrl = driver.getCurrentUrl();
				Assert.assertEquals(currentUrl,
						"https://forever-frontend-gules.vercel.app/product/67ef94a291c3c71f74f8874d",
						"product page of item did not navigate correctly!");
			} catch (Exception e) {
				System.out.println("TC_056 - Test Failed: " + e.getMessage());
				screenShot("TC_056");
				throw e;
			}

		} catch (Exception e) {
			System.out.println("TC_056 - Test Failed: " + e.getMessage());
			screenShot("TC_056");
			throw e;
		}
	}

	// Check if the product title in product tile is redirected to the product page
	// of the same product
	@Test
	public void TC_057() throws Exception {
		try {
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// product image function
			WebElement productTitle = driver
					.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/a[1]/p[1]"));
			productTitle.click();

			try {
				// Assertion
				String currentUrl = driver.getCurrentUrl();
				Assert.assertEquals(currentUrl,
						"https://forever-frontend-gules.vercel.app/product/67ef94a291c3c71f74f8874d",
						"product page of item did not navigate correctly!");
			} catch (Exception e) {
				System.out.println("TC_057 - Test Failed: " + e.getMessage());
				screenShot("TC_057");
				throw e;
			}

		} catch (Exception e) {
			System.out.println("TC_057 - Test Failed: " + e.getMessage());
			screenShot("TC_057");
			throw e;
		}
	}

	// Check if the product price in product tile is redirected to the product page
	// of the same product
	@Test
	public void TC_058() throws Exception {
		try {
			launchUrl("https://forever-frontend-gules.vercel.app/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// product image function
			WebElement productPrice = driver
					.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/a[1]/p[2]"));
			productPrice.click();

			try {
				// Assertion
				String currentUrl = driver.getCurrentUrl();
				Assert.assertEquals(currentUrl,
						"https://forever-frontend-gules.vercel.app/product/67ef94a291c3c71f74f8874d",
						"product page of item did not navigate correctly!");
			} catch (Exception e) {
				System.out.println("TC_058 - Test Failed: " + e.getMessage());
				screenShot("TC_058");
				throw e;
			}

		} catch (Exception e) {
			System.out.println("TC_058 - Test Failed: " + e.getMessage());
			screenShot("TC_058");
			throw e;
		}
	}

	@AfterMethod
	public void afterTestCase() {
		System.out.println("After Test Case: Closing browser");
		closeEntireBrowser();
	}

}
