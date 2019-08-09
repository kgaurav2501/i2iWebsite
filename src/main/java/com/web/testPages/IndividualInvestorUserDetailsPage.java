package com.web.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndividualInvestorUserDetailsPage {
	WebDriver driver;

	public IndividualInvestorUserDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[1]/h1")
	WebElement titleOfEmpDetails;
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[1]/app-nameinput/div/div[2]/div[1]/input")
	WebElement firstName;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[1]/app-nameinput/div/div[2]/div[2]/input")
	WebElement middleName;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[1]/app-nameinput/div/div[2]/div[3]/input")
	WebElement lastName;
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/div[1]/label[1]")
	WebElement single;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/div[1]/label[2]/span[2]")
	WebElement married;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/my-date-picker/div/div/input")
	WebElement dob;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/app-addressinput/div/div[1]/input")
	WebElement address;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/app-addressinput/div/div[2]/input")
	WebElement pin;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/app-addressinput/div/div[3]/input")
	WebElement city;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/app-addressinput/div/div[4]/input")
	WebElement state;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[3]/button[1]")
	WebElement save;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[3]/button[2]")
	WebElement next;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[1]/div[2]/input")
	WebElement enterCouponCode;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[1]/div[2]/button")
	WebElement applyNowBtn;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[2]/button")
	WebElement payNow;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[2]/button")
	WebElement submitBtn;

	public void enterFirstName(String first_name) {
		firstName.sendKeys(first_name);
	}

	public void enterMiddleName(String middle_name) {
		middleName.sendKeys(middle_name);
	}

	public void enterLastName(String last_name) {
		lastName.sendKeys(last_name);
	}

	public void clickOnSingle() {
		single.click();
	}
	public String getTitleOfEmpDetails() {
		return titleOfEmpDetails.getText();
	}

	public void enterdob() throws InterruptedException {
//		Select select = new Select(driver.findElement(dob));
//		select.selectByValue(enter_dob);
		Thread.sleep(2000);
		dob.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/my-date-picker/div/div[2]/table[1]/tbody/tr/td[3]/div/div[2]/button"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/my-date-picker/div/div[2]/table[2]/tbody/tr[1]/td/button"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/my-date-picker/div/div[2]/table[2]/tbody/tr[2]/td[1]/div"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/my-date-picker/div/div[2]/table[2]/tbody/tr[3]/td[5]/div/span"))
				.click();

	}

	public void enterAddress(String enter_address) {
		address.sendKeys(enter_address);
	}

	public void enterpin(String enter_pin) {
		pin.sendKeys(enter_pin);
	}

	public void clickOnNext() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		next.click();
	}

	// Enter coupon
	public void couponPayment(String enter_coupon_code) throws InterruptedException {
		enterCouponCode.sendKeys(enter_coupon_code);
		Thread.sleep(2000);
		applyNowBtn.click();
		Thread.sleep(2000);
		submitBtn.click();
	}

	public void clickPayNowBtn() throws InterruptedException {
		Thread.sleep(2000);
		payNow.click();
	}

}
