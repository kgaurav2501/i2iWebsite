package com.util;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.web.testPages.LoginPage;

public class LaunchBrowser {

	public static WebDriver driver = null;

	@BeforeSuite
	public void launchChromebrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\i2i funding\\eclipse-workspace\\i2iFundingWebsite\\src\\test\\java\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// To maximize browser
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// To open facebook
		driver.get("http://www.demo.i2ifunding.com/");
	}

	@AfterSuite
	public void closeBrowser() {
		// driver.manage().deleteAllCookies();
		// LaunchBrowser.driver.close();
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

//	public void login(String emailID, String password) throws InterruptedException {
//		loginPage lp = new loginPage(driver);
//		lp.enterEmail(emailID);
//		lp.enterPwd(password);
//		lp.clickLoginBtn();
//	}

}
