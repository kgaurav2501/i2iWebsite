package com.web.testPages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.GenericMethods;
import com.util.SavedData;

public class BorrowerBasicRegistrationPage {

	WebDriver driver;
	GenericMethods gm = new GenericMethods();
	public static SavedData save = new SavedData();

	public BorrowerBasicRegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Signup Button
	@FindBy(xpath = "//*[@id=\"containerNavbar\"]/ul[2]/li[2]/a")
	WebElement signup_buttom;

	// For personal Load
	@FindBy(xpath = "/html/body/app-root/div/app-signup/section/div/div/div/div/div[2]/ul/li[1]/a/div[3]")
	WebElement selectBorrowerOption;

	// First Name
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[1]/input")
	WebElement firstName;

	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[1]/div[2]")
	WebElement FNerrorMsg;

	// Middle Name
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[2]/input")
	WebElement middleName;

	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[2]/popper-content/div/div[1]")
	WebElement middleNameValidationMsg;
	// Last Name
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[3]/input")
	WebElement lastName;

	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[3]/div[2]")
	WebElement lastNameValidationMsg;

	// Male Radiobutton
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/div[1]/label[1]")
	WebElement radioBtnMale;

	// Female Radio button
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/div[1]/label[2]")
	WebElement radioBtnfemale;

	// Aadhaar Number
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/div[2]/input")
	WebElement aadharNum;

	// Aadhaar error msg
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/div[2]/div[2]")
	WebElement aadharNumErrorMsg;

	// Pan Card Number
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/pan-fileinput/div/input")
	WebElement panNum;

	// Pan Num Error Msg
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/pan-fileinput/div/div[2]")
	WebElement panNumErrorMsg;

	// Email ID
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[3]/email-fileinput/div/input")
	WebElement email;

	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[3]/email-fileinput/div/div[2]")
	WebElement emailErrorMsg;

	// Password Field
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[3]/div[1]/input")
	WebElement password;

	// Re-Enter Password Field
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[3]/div[2]/input")
	WebElement rePassword;

	// Mobile Number Field
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[4]/div[1]/div[2]/input")
	WebElement mobileNum;

	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[4]/div[1]/div[3]")
	WebElement mobileErrorMsg;

	// Mobile validation msg
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[4]/div[1]/div[3]")
	WebElement mobileValiMsg;

	// Send OTP button
	@FindBy(xpath = "//div[@class='form-box form-box1 padding-left0']/button")
	WebElement sendOTPbtn;

	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[4]/div[2]/button\r\n")
	WebElement sendOTPbtnError;

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

	@FindBy(xpath = "//*[@id=\"containerNavbar\"]/ul[2]/li[1]/a")
	WebElement signInBtn;

	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[1]/h1")
	WebElement checkLoanEligibilityTitle;

	// -------------------------------------ActionMethods--------------------------------

	// To click on Borrower Option
	public void clickOnBorrowerOpt() {
		gm.explicitWaitUnitlElementNotVisible(selectBorrowerOption);
		selectBorrowerOption.click();
	}

	// To click on sign in Button
	public void clickOnSignInBtn() throws InterruptedException {
		gm.explicitWaitUnitlElementNotVisible(signInBtn);
		Thread.sleep(2000);
		signInBtn.click();
	}

	// To click on signup Button
	public void clickOnSignupBtn() {
		gm.explicitWaitUnitlElementNotVisible(signup_buttom);
		signup_buttom.click();
	}

	// To send text in First Name field
	public void enterFirstName(String first_name) {
		gm.explicitWaitUnitlElementNotVisible(firstName);
		firstName.sendKeys(first_name);
	}

	public String getFirstName() {
		return (firstName.getAttribute("value"));
	}

	public String getFirstNameErrorMsg() {
		return (FNerrorMsg.getText());
	}

	// To send text in Middle Name
	public void enterMiddleName(String middle_name) {
		gm.explicitWaitUnitlElementNotVisible(middleName);
		middleName.sendKeys(middle_name);
	}

	public String getMiddleName() {
		return (middleName.getAttribute("value"));
	}

	public String getMiddleNameValidationMsg() {
		middleName.click();
		gm.explicitWaitUnitlElementNotVisible(middleNameValidationMsg);
		return (middleNameValidationMsg.getText());
	}

	// Enter last name
	public void enterLastName(String last_name) {
		gm.explicitWaitUnitlElementNotVisible(lastName);
		lastName.sendKeys(last_name);
	}

	public String getLastName() {
		gm.explicitWaitUnitlElementNotVisible(lastName);
		return (lastName.getAttribute("value"));
	}

	public String getLastNameValidationMsg() {
		gm.explicitWaitUnitlElementNotVisible(lastName);
		return (lastNameValidationMsg.getText());
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

	public String getAddharNum() {
		return (aadharNumErrorMsg.getText());
	}

	// Enter pan Number
	public void enterPanNum(String pan_num) {
		gm.explicitWaitUnitlElementNotVisible(panNum);
		panNum.sendKeys(pan_num);
	}

	public String getPanErroMsg() {
		return (panNumErrorMsg.getText());
	}

	public String emailValidaionMsg() {
		return (emailErrorMsg.getText());
	}

	// Enter Email ID
	public void enterEmail(String email_id) throws InterruptedException {
		gm.explicitWaitUnitlElementNotVisible(email);
		email.clear();
		email.click();
		email.sendKeys(email_id);
		Thread.sleep(2000);
	}

	// Get Email
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
		gm.explicitWaitUnitlElementNotVisible(mobileNum);
		mobileNum.sendKeys(mobile_num);
	}

	public String getMobilenumber() {
		return (mobileNum.getAttribute("value"));
	}

	public String getMobilenumberErrorMsg() {
		return (mobileErrorMsg.getText());
	}

	// Click on send OTP
	public void clickOnSendOTPBtn() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sendOTPbtn.click();
	}

	// Enter mobile OTP
	public void enterMobileOTP(String mobile_OTP) {
		gm.explicitWaitUnitlElementNotVisible(mobileOTP);
		mobileOTP.sendKeys(mobile_OTP);
	}

	// Enter email OTP
	public void enterEmailOTP(String email_OTP) {
		gm.explicitWaitUnitlElementNotVisible(emailOTP);
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
		gm.explicitWaitUnitlElementNotVisible(OTPofMobile);
		return (OTPofMobile.getText());
	}

	// Read Email OTP
	public String getEmailOTP() {
		gm.explicitWaitUnitlElementNotVisible(OTPofEmail);
		return (OTPofEmail.getText());
	}

	public String getLoanEligibilityTitle() {
		gm.explicitWaitUnitlElementNotVisible(checkLoanEligibilityTitle);
		return (checkLoanEligibilityTitle.getText());

	}

	public void enterBorrowerBasicDetails(String first_name, String middle_name, String last_name, String gender,
			String aadhar_num, String pan_num, String email_id, String enter_password, String re_enter_Password,
			String mobile_num) throws InterruptedException {
		gm.explicitWaitUnitlElementNotVisible(firstName);
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
		email.click();
		email.sendKeys(email_id);
//		while (emailValidaionMsg().equalsIgnoreCase("This Email-Id is already exist.")) {
//			try {
//				email.clear();
//				email.sendKeys(email_id);
//			} catch (org.openqa.selenium.StaleElementReferenceException ex) {
//			} catch (NoSuchElementException e) {
//			}
//
//		}
		Thread.sleep(2000);
		save.setEmail(email.getAttribute("value"));
		password.sendKeys(enter_password);
		rePassword.sendKeys(re_enter_Password);
		mobileNum.sendKeys(mobile_num);
		Thread.sleep(2000);
		save.setMobileNum(mobileNum.getAttribute("value"));
		gm.explicitWaitUnitlElementNotVisible(sendOTPbtn);
		Thread.sleep(2000);
		sendOTPbtn.click();

		// gm.explicitWaitUnitlElementNotVisible(OTPofMobile);
		Thread.sleep(2000);

		mobileOTP.sendKeys(OTPofMobile.getText());

		gm.explicitWaitUnitlElementNotVisible(OTPofEmail);
		emailOTP.sendKeys(OTPofEmail.getText());

		privicyPolicy.click();

		Actions actions = new Actions(driver);
		actions.moveToElement(termsConditions).click().perform();

		Thread.sleep(2000);
		submitBtn.click();
	}

}