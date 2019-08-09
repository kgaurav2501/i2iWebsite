package com.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OpenAllLinksInDifferentTab extends LaunchBrowser {
	@Test
	public void openAllLinksOnHomepage() {
		List<WebElement> allLinks = LaunchBrowser.driver.findElements(By.tagName("a"));
		for (WebElement link : allLinks) {
			// link.sendKeys(Keys.CONTROL + link.click()).click();

			//To open in new TAB
			new Actions(driver).sendKeys(link, Keys.chord(Keys.CONTROL, Keys.RETURN)).click().build().perform();
			//To open in new window
			new Actions(driver).keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
	}
}
