package com.web.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class IndividualInvestorBasicRegPage {

	WebDriver driver;

	public IndividualInvestorBasicRegPage(WebDriver driver) {
		this.driver = driver;
	}

	// Signup Button
	By signup_buttom = By.xpath("//*[@id=\"containerNavbar\"]/ul[2]/li[2]/a/i");

	By investorIcon = By
			.xpath("/html/body/app-root/div/app-signup/section/div/div/div/div/div[2]/ul/li[2]/a/div[2]/img");

	// For personal Load
	By selectIndividualInvestorIcon = By
			.xpath("/html/body/app-root/div/app-signup/section/div/div/div/div/div[2]/ul/li[2]/a/div[3]");

	By selectIndividualInvestorOpt = By.xpath("//*[@id=\"investor-pop\"]/div/div/div/div[2]/ul/li[1]");

	// First Name
	By firstName = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[1]/input");

	// Middle Name
	By middleName = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[2]/input");

	// Last Name
	By lastName = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[3]/input");

	// Male Radiobutton
	By radioBtnMale = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/div[1]/label[1]");

	// Female Radio button
	By radioBtnfemale = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/div[1]/label[2]");

	// Aadhaar Number
	By aadharNum = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/div[2]/input");

	// Pan Card Number
	By panNum = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/pan-fileinput/div/input");

	// Email ID
	By email = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[3]/email-fileinput/div/input");

	// Password Field
	By password = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[3]/div[1]/input");

	// Re-Enter Password Field
	By rePassword = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[3]/div[2]/input");

	// Mobile Number Field
	By mobileNum = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[4]/div[1]/div[2]/input");

	// Send OTP button
	By sendOTPbtn = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[4]/div[2]/button");

	// Mobile OTP Field
	By mobileOTP = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[5]/div[1]/input");

	// Email OTP Field
	By emailOTP = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[5]/div[2]/input");

	// Mobile OTP
	By OTPofMobile = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[5]/div[1]/div[3]");

	// Email OTP
	By OTPofEmail = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[5]/div[2]/div[3]");

	// Terms and condition Check Box
	By termsConditions = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/div[1]/label/span[1]");

	// Privacy policy check Box
	By privicyPolicy = By.xpath(
			"//*[contains(text(), 'I agree to i2ifunding.com requesting, processing and utilizing my personal data as mentioned in')]");

	// Submit button
	By submitBtn = By
			.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/div[3]/button");

	// Fee Payment
	// Enter Coupon Code txt field
	By enterCoupanCode = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[1]/div[2]/input");
	// Apply Now btn
	By applyNowBtn = By.xpath(
			"/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[1]/div[2]/button");

	// Pay Now Btn
	By payNowBtn = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[2]/button");

	By submitFeeBtn = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[2]/button");

	// -------------------------------------ActionMethods--------------------------------

	// To click on signup Button
	public void clickOnSignupBtn() {
		driver.findElement(signup_buttom).click();
	}

	// To click on Borrower Option
	public void clickOnInvestorIcon() {
		driver.findElement(investorIcon).click();
	}

	public void selectInvestorOption() {
		driver.findElement(selectIndividualInvestorOpt).click();
	}

	// To send text in First Name field
	public void enterFirstName(String first_name) {
		driver.findElement(firstName).sendKeys(first_name);
	}

	public String getFirstName() {
		return (driver.findElement(firstName).getAttribute("value"));
	}

	// To send text in Middle Name
	public void enterMiddleName(String middle_name) {
		driver.findElement(middleName).sendKeys(middle_name);
	}

	// Enter last name
	public void enterLastName(String last_name) {
		driver.findElement(lastName).sendKeys(last_name);
	}

	// Select Male option
	public void selectMaleBtn() {
		driver.findElement(radioBtnMale).click();
	}

	// Select Female option
	public void selectFemaleBtn() {
		driver.findElement(radioBtnfemale).click();
	}

	// Enter Aadhaar number
	public void enterAddharNum(String aadhar_num) {
		driver.findElement(aadharNum).sendKeys(aadhar_num);
	}

	// Enter pan Number
	public void enterPanNum(String pan_num) {
		driver.findElement(panNum).sendKeys(pan_num);
	}

	// Enter Email Number
	public void enterEmail(String email_id) {
		driver.findElement(email).sendKeys(email_id);
	}

//	Get Email
	public String getEmail() {
		return (driver.findElement(email).getAttribute("value"));
	}

	// Enter Password
	public void enterPassword(String pass_word) {
		driver.findElement(password).sendKeys(pass_word);
	}

	public String getPass() {
		return (driver.findElement(password).getAttribute("value"));
	}

	// Enter confirm passowrd
	public void enterRepassword(String re_password) {
		driver.findElement(rePassword).sendKeys(re_password);
	}

	// Enter mobile number
	public void enterMobileNum(String mobile_num) {
		driver.findElement(mobileNum).sendKeys(mobile_num);
	}

	// Click on send
	public void clickOnSendOTPBtn() {
		driver.findElement(sendOTPbtn).click();
	}

	// Enter mobile OTP
	public void enterMobileOTP(String mobile_OTP) {
		driver.findElement(mobileOTP).sendKeys(mobile_OTP);
	}

	// Enter email OTP
	public void enterEmailOTP(String email_OTP) {
		driver.findElement(emailOTP).sendKeys(email_OTP);
	}

	// Click on trems and conditions check box
	public void clickOnTermsConditions() {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(termsConditions)).click().perform();
	}

	// Click on Privicy and Policy checkbox
	public void clickOnPrivacyPolicy() {
		driver.findElement(privicyPolicy).click();
	}

	// Click on submit button
	public void clickOnSubmitBtn() {
		driver.findElement(submitBtn).click();
	}

	// Read Mobile OTP
	public String getMobileOTP() {
		String mobile_OTP = driver.findElement(OTPofMobile).getText();
		return (mobile_OTP);
	}

	// Read Email OTP
	public String getEmailOTP() {
		String email_OTP = driver.findElement(OTPofEmail).getText();
		return (email_OTP);
	}

	// Fee
	public void enterCouponCode(String enter_coupon_code) {
		driver.findElement(enterCoupanCode).sendKeys(enter_coupon_code);
	}

	public void clickOnApplyNowBtn() {
		driver.findElement(applyNowBtn).click();
	}

	public void clickOnFeeSubmitBtn() {
		driver.findElement(submitFeeBtn).click();
	}

	public void clickOnPayNowBtn() {
		driver.findElement(payNowBtn).click();
	}

}
