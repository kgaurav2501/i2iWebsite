package com.util;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchBrowser {

	public static WebDriver driver = null;
	
	@BeforeMethod
	public void launchChromebrowser() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// To maximize browser
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// To open facebook
		driver.get("https://www.stagingi2i.com/");
	}

	@AfterMethod
	public void closeBrowser() {
		 driver.manage().deleteAllCookies();
		 driver.close();
	}
	
	
	

	// Method to generate random mobilenumber
	public static Integer mobileNumber() {
		Random r = new Random(System.currentTimeMillis());
		return 1000000000 + r.nextInt(2000000000);
	}

	// Method to generate randam Aadhaar Number
	public static Long aadhaarNumber() {
		// return (long) (Math.random() * 1000000000000L);
		Random random = new Random();
		StringBuilder sb = new StringBuilder();
		// first not 0 digit
		sb.append(random.nextInt(9) + 1);
		// rest of 11 digits
		for (int i = 0; i < 11; i++) {
			sb.append(random.nextInt(10));
		}
		return Long.valueOf(sb.toString()).longValue();
	}

	// Method to generate random emailID
	public static String randomEmailID() {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		String rEmail = "username" + randomInt + "@gmail.com";
		return (rEmail);
	}

	public static String rPanNum() {
		Random randomGenerator = new Random();
		String randomInt = String.format("%04d", randomGenerator.nextInt(10000));
		String rEmail = "BDJPG" + randomInt + "L";
		return (rEmail);
	}
	
	public void explicitWaitUnitlElementNotVisible(WebElement element_location1) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element_location1));
	}

	public void explicitWaitUntilElementNotClickable(WebElement element_location2) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element_location2));
	}

	public void explicitWaitUnitlElementNotInvisible(WebElement element_location3) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOf(element_location3));
	}
	
}
