package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {

	public void scroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
	}

	public void explicitWaitUnitlElementNotVisible(WebElement element_location1) {
		WebDriverWait wait = new WebDriverWait(LaunchBrowser.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element_location1));
	}

	public void explicitWaitUntilElementNotClickable(WebElement element_location2) {
		WebDriverWait wait = new WebDriverWait(LaunchBrowser.driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element_location2));
	}

	public void explicitWaitUnitlElementNotInvisible(WebElement element_location3) {
		WebDriverWait wait = new WebDriverWait(LaunchBrowser.driver, 20);
		wait.until(ExpectedConditions.invisibilityOf(element_location3));
	}

//	public void fluentWait() {
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(LaunchBrowser.driver)							
//	.withTimeout(30, TimeUnit.SECONDS) 			
//	.pollingEvery(, TimeUnit.MILLISECONDS) 			
//	.ignoring(NoSuchElementException.class);
}
