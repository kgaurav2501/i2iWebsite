package com.web.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BorrowerEmploymentDetailsPage {

	WebDriver driver;

	public BorrowerEmploymentDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	// Designation in current orgination
	By currentOrgDesignation = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[1]/div/div/div/input");

	// Official Email
	By officialEmail = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[1]/div/div/email-fileinput/div/input");

	// Office Address
	By officeAddress = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[3]/app-addressinput/div/div[1]/input");

	// Office Pin
	By officePin = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[3]/app-addressinput/div/div[2]/input");

	// Office city
	By officeCity = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[3]/app-addressinput/div/div[3]/input");

	// Office state
	By officeState = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[3]/app-addressinput/div/div[4]/input");

	// STD Code
	By officeCode = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[3]/div/div[2]/input[1]");

	// Phone No.
	By officePhone = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[3]/div/div[2]/input[2]");

	// Previous btn
	By previousBtn = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[4]/button[1]");

	// Save Btn
	By saveBtn = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[4]/button[2]/span");

	// Next Btn
	By nextBtn = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[4]/button[3]");

	// ------------------------------------------------ActionMethods-------------------------------------------------

	public void enterEmploymentDetails(String current_org_designation, String org_email, String org_address,
			String org_pin, String org_phone_code, String org_phone_number) {
		
		driver.findElement(currentOrgDesignation).sendKeys(current_org_designation);
		driver.findElement(officialEmail).sendKeys(org_email);
		driver.findElement(officeAddress).sendKeys(org_address);
		driver.findElement(officePin).sendKeys(org_pin);
		driver.findElement(officeCode).sendKeys(org_phone_code);
		driver.findElement(officePhone).sendKeys(org_phone_number);
		driver.findElement(nextBtn).click();

	}

}
