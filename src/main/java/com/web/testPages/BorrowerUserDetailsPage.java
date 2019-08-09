package com.web.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BorrowerUserDetailsPage {
	WebDriver driver;

	public BorrowerUserDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Father first Name
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[1]/app-nameinput/div/div[2]/div[1]/input")
	WebElement fatherFirstName;

	// Father middile name
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[1]/app-nameinput/div/div[2]/div[2]/input")
	WebElement fatherMiddileName;
	// Father Last Name
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[1]/app-nameinput/div/div[2]/div[3]/input")
	WebElement fatherLastName;

	// Permanent Address
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-addressinput[1]/div/div[1]/input")
	WebElement permanentAddress;

	// Permanent Pincode
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-addressinput[1]/div/div[2]/input")
	WebElement permanentPinCode;

	// Permanent City
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-addressinput[1]/div/div[3]/input")
	WebElement city;

	// Permanent State
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-addressinput[1]/div/div[4]/input")
	WebElement state;

	// Current Address if same as Permanent Address
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-addressinput[2]/div/div[2]/input")
	WebElement currenAddressSameAspermanetAdressRadioBtn;

	// Current Address
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-addressinput[2]/div/div[1]/input")
	WebElement currenAddress;

	// Current Address pin
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-addressinput[2]/div/div[2]/input")
	WebElement cpinCode;

	// Current Address City
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-addressinput[2]/div/div[3]/input")
	WebElement cCity;

	// Current Address state
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-addressinput[2]/div/div[4]/input")
	WebElement cState;
	// Save button
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[5]/button[1]/span")
	WebElement saveBtn;

	// Next Button
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[5]/button[2]")
	WebElement nextBtn;

	// ---------------------------------------------------------Action-------------------------------------------------------------------------

	public void enterUserDetails(String first_name, String middle_Name, String last_name, String permanent_address,
			String permanent_pin, String current_address, String current_pin) throws InterruptedException {
		Thread.sleep(2000);
		fatherFirstName.sendKeys(first_name);
		fatherMiddileName.sendKeys(middle_Name);
		fatherLastName.sendKeys(last_name);
		permanentAddress.sendKeys(permanent_address);
		Thread.sleep(2000);
		permanentPinCode.sendKeys(permanent_pin);
		currenAddress.sendKeys(current_address);
		// cpinCode.sendKeys(current_pin);
		Thread.sleep(2000);
		Thread.sleep(2000);
		nextBtn.click();
	}

}
