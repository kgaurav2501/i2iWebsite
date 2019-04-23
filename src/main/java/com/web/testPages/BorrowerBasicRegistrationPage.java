package com.web.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.GenericMethods;
import com.util.LaunchBrowser;
import com.util.SavedData;

public class BorrowerBasicRegistrationPage {

	WebDriver driver;

	public BorrowerBasicRegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Signup Button
	@FindBy(xpath = "//*[@id=\"containerNavbar\"]/ul[2]/li[2]/a/i")
	WebElement signup_buttom;

	// For personal Load
	@FindBy(xpath = "/html/body/app-root/div/app-signup/section/div/div/div/div/div[2]/ul/li[1]/a/div[2]/img")
	WebElement selectBorrowerOption;

	// First Name
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[1]/input")
	WebElement firstName;

	// Middle Name
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[2]/input")
	WebElement middleName;
	// Last Name
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[3]/input")
	WebElement lastName;

	// Male Radiobutton
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/div[1]/label[1]")
	WebElement radioBtnMale;

	// Female Radio button
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/div[1]/label[2]")
	WebElement radioBtnfemale;

	// Aadhaar Number
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/div[2]/input")
	WebElement aadharNum;

	// Pan Card Number
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/pan-fileinput/div/input")
	WebElement panNum;

	// Email ID
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[3]/email-fileinput/div/input")
	WebElement email;

	// Password Field
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[3]/div[1]/input")
	WebElement password;

	// Re-Enter Password Field
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[3]/div[2]/input")
	WebElement rePassword;

	// Mobile Number Field
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[4]/div[1]/div[2]/input")
	WebElement mobileNum;

	// Mobile validation msg
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[4]/div[1]/div[3]")
	WebElement mobileValiMsg;

	// Send OTP button
	@FindBy(xpath = "//div[@class='form-box form-box1 padding-left0']/button")
	WebElement sendOTPbtn;
	// Mobile OTP Field
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[5]/div[1]/input")
	WebElement mobileOTP;

	// Email OTP Field
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[5]/div[2]/input")
	WebElement emailOTP;

	// Email OTP
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[5]/div[2]/div[3]\r\n")
	WebElement OTPofEmail;

	// Mobile OTP
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[5]/div[1]/div[3]")
	WebElement OTPofMobile;

	// Terms and condition Check Box
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/div[1]/label/span[1]")
	WebElement termsConditions;

	// Privacy policy check Box
	@FindBy(xpath = "//*[contains(text(), 'I agree to i2ifunding.com requesting, processing and utilizing my personal data as mentioned in')]")
	WebElement privicyPolicy;

	// Submit button
	@FindBy(xpath = "//div[@class='tab-form-btn']/button")
	WebElement submitBtn;

	// Title of Check Eligibility
	@FindBy(xpath = "/html/body/app-root/div/app-refferalcode-verify/div/div/div/div/div/div[2]")
	WebElement headerOfreff;
	
	@FindBy(xpath = "//*[@id=\"navbarDropdownMenuLink\"]")
	WebElement myProfileBtn;
	
	@FindBy(xpath = "//*[@id=\"containerNavbar\"]/ul[2]/li[1]/div/a[3]")
	WebElement signOutBtn;

	// -------------------------------------ActionMethods--------------------------------

	GenericMethods gm = new GenericMethods();
	public static SavedData save = new SavedData();

	public void borrowerBasicSignup(String first_name, String middle_name, String last_name, String gender,
			String aadhar_num, String pan_num, String email_id, String enter_password, String re_enter_Password,
			String mobile_num) throws InterruptedException {
		signup_buttom.click();
		selectBorrowerOption.click();
		firstName.sendKeys(first_name);
		middleName.sendKeys(middle_name);
		lastName.sendKeys(last_name);
		if (gender.equals("Male")) {
			radioBtnMale.click();
		}
		if (gender.equals("Female")) {
			radioBtnfemale.click();
		}
		aadharNum.sendKeys(aadhar_num);
		panNum.sendKeys(pan_num);
		save.setPanNum(panNum.getAttribute("value"));
		email.sendKeys(email_id);
		save.setEmail(email.getAttribute("value"));
		password.sendKeys(enter_password);
		rePassword.sendKeys(re_enter_Password);
		mobileNum.sendKeys(mobile_num);
		save.setMobileNum(mobileNum.getAttribute("value"));
		// gm.ExplicitWaitUnitlMsgDisable(mobileValiMsg,LaunchBrowser.driver);
		Thread.sleep(2000);
		sendOTPbtn.click();

		Thread.sleep(2000);
//		gm.ExplicitWaitVisible(submitBtn, LaunchBrowser.driver);
		mobileOTP.sendKeys(OTPofMobile.getText());

		// gm.ExplicitWaitVisible(submitBtn, driver);
		emailOTP.sendKeys(OTPofEmail.getText());
		privicyPolicy.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(termsConditions).click().perform();
		Thread.sleep(2000);
		submitBtn.click();
		Thread.sleep(6000);
		System.out.println("Borrower Basic Signup Success and redirected to" + headerOfreff.getText());
	}
	
	public void logOut() throws InterruptedException {
		myProfileBtn.click();
		signOutBtn.click();
		Thread.sleep(4000);
	}

}

//	GenericMethods gm = new GenericMethods();
//
//	// To click on signup Button
//	public void clickOnSignupBtn() {
//		gm.ExplicitWait(signup_buttom, driver);
//		signup_buttom.click();
//	}
//
//	// To click on Borrower Option
//	public void clickOnBorrowerIcon() {
//		gm.ExplicitWait(selectBorrowerOption, driver);
//		selectBorrowerOption.click();
//	}
//
//	// To send text in First Name field
//	public void enterFirstName(String first_name) {
//		gm.ExplicitWait(firstName, driver);
//		firstName.sendKeys(first_name);
//	}
//
//	public String getFirstName() {
//		return (firstName.getAttribute("value"));
//	}
//
//	// To send text in Middle Name
//	public void enterMiddleName(String middle_name) {
//		middleName.sendKeys(middle_name);
//
//	}
//
//	// Enter last name
//	public void enterLastName(String last_name) {
//		lastName.sendKeys(last_name);
//
//	}
//
//	// Select Male option
//	public void selectMaleBtn() {
//		radioBtnMale.click();
//
//	}
//
//	// Select Female option
//	public void selectFemaleBtn() {
//		radioBtnfemale.click();
//	}
//
//	// Enter Aadhaar number
//	public void enterAddharNum(String aadhar_num) {
//		aadharNum.sendKeys(aadhar_num);
//	}
//
//	// Enter pan Number
//	public void enterPanNum(String pan_num) {
//		panNum.sendKeys(pan_num);
//	}
//
//	// Enter Email Number
//	public void enterEmail(String email_id) {
//		email.sendKeys(email_id);
//	}
//
////	Get Email
//	public String getEmail() {
////		WebElement mm =  email);
////		((JavascriptExecutor)driver executeScript("arguments[0].scrollIntoView(true);", mm);
//		return (email.getAttribute("value"));
//	}
//
//	// Enter Password
//	public void enterPassword(String pass_word) {
//		password.sendKeys(pass_word);
//	}
//
//	public String getPass() {
//		return (password.getAttribute("value"));
//	}
//
//	// Enter confirm passowrd
//	public void enterRepassword(String re_password) {
//		rePassword.sendKeys(re_password);
//	}
//
//	// Enter mobile number
//	public void enterMobileNum(String mobile_num) {
//		gm.ExplicitWait(mobileNum, driver);
//		mobileNum.sendKeys(mobile_num);
//	}
//
//	// Click on send OTP
//	public void clickOnSendOTPBtn() {
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		sendOTPbtn.click();
//	}
//
//	// Enter mobile OTP
//	public void enterMobileOTP(String mobile_OTP) {
//		gm.ExplicitWait(mobileOTP, driver);
//		mobileOTP.sendKeys(mobile_OTP);
//	}
//
//	// Enter email OTP
//	public void enterEmailOTP(String email_OTP) {
//		gm.ExplicitWait(emailOTP, driver);
//		emailOTP.sendKeys(email_OTP);
//	}
//
//	// Click on trems and conditions check box
//	public void clickOnTermsConditions() {
//		Actions actions = new Actions(driver);
//		actions.moveToElement(termsConditions).click().perform();
//	}
//
//	// Click on Privicy and Policy checkbox
//	public void clickOnPrivacyPolicy() {
//		privicyPolicy.click();
//	}
//
//	// Click on submit button
//	public void clickOnSubmitBtn() {
//		gm.ExplicitWait(submitBtn, driver);
//		submitBtn.click();
//	}
//
//	// Read Mobile OTP
//	public String getMobileOTP() {
//		gm.ExplicitWait(OTPofMobile, driver);
//		return (OTPofMobile.getText());
//	}
//
//	// Read Email OTP
//	public String getEmailOTP() {
//		gm.ExplicitWaitTocheckClickable(OTPofEmail, driver);
//		return (OTPofEmail.getText());
//	}
//
//	public String get_CheckLoanEligibility_Title() {
//		gm.ExplicitWait(titleOfCheckLoanEligibilit, driver);
//		return (titleOfCheckLoanEligibilit.getText());
//	}
//----------------------------------------------------------------------------------------------------------

//	public void enterBasicRegDetails(String first_name, String middle_name, String last_name, ) {
//		firstName.sendKeys(first_name);
//
//		radioBtnMale.click();
//	}
