
package com.web.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BorrowerEducationDetails {
	WebDriver driver;

	public BorrowerEducationDetails(WebDriver driver) {
		this.driver = driver;
	}

	// Higher degree
	By higherDegree = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[1]/div[1]/input");

	// College Name
	By collegeName = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[1]/div[2]/input");

	// Specilization
	By specilization = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[1]/div[3]/input");

	// GraduationYear
	By graduationYear = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[1]/div[4]/select");

	// Previous
	By PreBtn = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[2]/button[1]");

	// Save
	By saveBtn = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[2]/button[2]");

	// Next Button
	By nextBtn = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[2]/button[3]");

	public void enterEducationDetails(String higher_degree,String college_name, String spec, String gradutaion_year) {
		driver.findElement(higherDegree).sendKeys(higher_degree);
		driver.findElement(collegeName).sendKeys(college_name);
		driver.findElement(specilization).sendKeys(spec);
		Select year = new Select(driver.findElement(graduationYear));
		year.selectByVisibleText(gradutaion_year);
		driver.findElement(nextBtn).click();
	}

}
