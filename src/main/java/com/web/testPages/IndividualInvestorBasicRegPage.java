package com.web.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndividualInvestorBasicRegPage {

	WebDriver driver;

	public IndividualInvestorBasicRegPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Signup Button
	@FindBy(xpath = "//*[@id=\"containerNavbar\"]/ul[2]/li[2]/a/i")
	WebElement signup_buttom;

	@FindBy(xpath = "/html/body/app-root/div/app-signup/section/div/div/div/div/div[2]/ul/li[2]/a/div[2]/img")
	WebElement investorIcon;

	// For personal Load
	@FindBy(xpath = "/html/body/app-root/div/app-signup/section/div/div/div/div/div[2]/ul/li[2]/a/div[3]")
	WebElement selectIndividualInvestorIcon;

	@FindBy(xpath = "//*[@id=\"investor-pop\"]/div/div/div/div[2]/ul/li[1]")
	WebElement selectIndividualInvestorOpt;

	// First Name
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[1]/input")
	WebElement firstName;

	// Middle Name
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[2]/input")
	WebElement middleName;

	// Last Name
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[3]/input")
	WebElement lastName;

	// Male Radiobutton
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/div[1]/label[1]")
	WebElement radioBtnMale;

	// Female Radio button
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/div[1]/label[2]")
	WebElement radioBtnfemale;

	// Aadhaar Number
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/div[2]/input")
	WebElement aadharNum;

	// Pan Card Number
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/pan-fileinput/div/input")
	WebElement panNum;

	// Email ID
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[3]/email-fileinput/div/input")
	WebElement email;

	// Password Field
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[3]/div[1]/input")
	WebElement password;

	// Re-Enter Password Field
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[3]/div[2]/input")
	WebElement rePassword;

	// Mobile Number Field
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[4]/div[1]/div[2]/input")
	WebElement mobileNum;

	// Send OTP button
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[4]/div[2]/button")
	WebElement sendOTPbtn;

	// Mobile OTP Field
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[5]/div[1]/input")
	WebElement mobileOTP;

	// Email OTP Field
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[5]/div[2]/input")
	WebElement emailOTP;

	// Mobile OTP
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[5]/div[1]/div[3]")
	WebElement OTPofMobile;

	// Email OTP
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[5]/div[2]/div[3]")
	WebElement OTPofEmail;

	// Terms and condition Check Box
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/div[1]/label/span[1]")
	WebElement termsConditions;

	// Privacy policy check Box
	@FindBy(xpath = "//*[contains(text(), 'I agree to i2ifunding.com requesting, processing and utilizing my personal data as mentioned in')]")
	WebElement privicyPolicy;

	// Submit button
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/div[3]/button")
	WebElement submitBtn;

	// -------------------------------------ActionMethods--------------------------------

	public void enterBasicDetailsOfIndividualInvestor(String first_name, String middle_name, String last_name,
			String aadhar_num, String pan_num, String email_id, String pass_word, String re_password,
			String mobile_num) {
		
		signup_buttom.click();
		investorIcon.click();
		selectIndividualInvestorOpt.click();
		firstName.sendKeys(first_name);
		middleName.sendKeys(middle_name);
		lastName.sendKeys(last_name);
		radioBtnMale.click();
		aadharNum.sendKeys(aadhar_num);
		panNum.sendKeys(pan_num);
		email.sendKeys(email_id);
		password.sendKeys(pass_word);
		rePassword.sendKeys(re_password);
		mobileNum.sendKeys(mobile_num);
		sendOTPbtn.click();
		mobileOTP.sendKeys(OTPofMobile.getText());
		emailOTP.sendKeys(email.getAttribute("value"));
		Actions actions = new Actions(driver);
		actions.moveToElement(termsConditions).click().perform();
		privicyPolicy.click();
		submitBtn.click();

	}

	// To click on signup Button
	public void clickOnSignupBtn() {
		
		signup_buttom.click();
	}

	// To click on Borrower Option
	public void clickOnInvestorIcon() {
		investorIcon.click();
	}

	public void selectInvestorOption() {
		selectIndividualInvestorOpt.click();
	}

	// To send text in First Name field
	public void enterFirstName(String first_name) {
		firstName.sendKeys(first_name);
	}

	public String getFirstName() {
		return (firstName.getAttribute("value"));
	}

	// To send text in Middle Name
	public void enterMiddleName(String middle_name) {
		middleName.sendKeys(middle_name);
	}

	// Enter last name
	public void enterLastName(String last_name) {
		lastName.sendKeys(last_name);
	}

	// Select Male option
	public void selectMaleBtn() {
		radioBtnMale.click();
	}

	// Select Female option
	public void selectFemaleBtn() {
		radioBtnfemale.click();
	}

	// Enter Aadhaar number
	public void enterAddharNum(String aadhar_num) {
		aadharNum.sendKeys(aadhar_num);
	}

	// Enter pan Number
	public void enterPanNum(String pan_num) {
		panNum.sendKeys(pan_num);
	}

	// Enter Email Number
	public void enterEmail(String email_id) {
		email.sendKeys(email_id);
	}

//	Get Email
	public String getEmail() {
		return (email.getAttribute("value"));
	}

	// Enter Password
	public void enterPassword(String pass_word) {
		password.sendKeys(pass_word);
	}

	public String getPass() {
		return (password.getAttribute("value"));
	}

	// Enter confirm passowrd
	public void enterRepassword(String re_password) {
		rePassword.sendKeys(re_password);
	}

	// Enter mobile number
	public void enterMobileNum(String mobile_num) {
		mobileNum.sendKeys(mobile_num);
	}

	// Click on send
	public void clickOnSendOTPBtn() {
		sendOTPbtn.click();
	}

	// Enter mobile OTP
	public void enterMobileOTP(String mobile_OTP) {
		mobileOTP.sendKeys(mobile_OTP);
	}

	// Enter email OTP
	public void enterEmailOTP(String email_OTP) {
		emailOTP.sendKeys(email_OTP);
	}

	// Click on trems and conditions check box
	public void clickOnTermsConditions() {
		Actions actions = new Actions(driver);
		actions.moveToElement(termsConditions).click().perform();
	}

	// Click on Privicy and Policy checkbox
	public void clickOnPrivacyPolicy() {
		privicyPolicy.click();
	}

	// Click on submit button
	public void clickOnSubmitBtn() {
		submitBtn.click();
	}

	// Read Mobile OTP
	public String getMobileOTP() {
		String mobile_OTP = OTPofMobile.getText();
		return (mobile_OTP);
	}

	// Read Email OTP
	public String getEmailOTP() {
		String email_OTP = OTPofEmail.getText();
		return (email_OTP);
	}
}
