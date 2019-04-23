package com.web.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.GenericMethods;
import com.util.SavedData;

public class Institution_InvestorBasicDetailsPage {
	WebDriver driver;
	public static SavedData v	= new SavedData();
	public Institution_InvestorBasicDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/div[1]/div/input")
	WebElement firmName;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/div[1]/pan-fileinput/div/input")
	WebElement firmPanCard;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[1]/input")
	WebElement firstName;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[2]/input")
	WebElement middleName;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[1]/div[3]/input")
	WebElement lastName;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/email-fileinput/div/input")
	WebElement emailID;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/div[1]/input")
	WebElement password;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[2]/div[2]/input")
	WebElement re_password;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[3]/div[1]/div[2]/input")
	WebElement mobileNum;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[3]/div[2]/button")
	WebElement SendOTPBtn;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[4]/div[1]/div[3]")
	WebElement OTPofMobile;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[4]/div[2]/div[3]")
	WebElement OTPofEmail;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[4]/div[1]/input")
	WebElement enterMobileOTP;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/app-basicuserform/div[4]/div[2]/input")
	WebElement enterEmailOTP;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/div[2]/label/span[1]")
	WebElement terms_conditions;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/div[3]/label/span[1]")
	WebElement privicy_policy;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div[1]/div/div[2]/div/div[4]/button")
	WebElement submitbtn;

	@FindBy(xpath = "//*[@id=\"containerNavbar\"]/ul[2]/li[2]/a")
	WebElement signUpBtn;

	@FindBy(xpath = "/html/body/app-root/div/app-signup/section/div/div/div/div/div[2]/ul/li[2]/a/div[3]")
	WebElement investorIcon;

	@FindBy(xpath = "//*[@id=\"investor-pop\"]/div/div/div/div[2]/ul/li[2]")
	WebElement institionOpt;
	// ---------------------------------fee------------------------------------------------
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/div/div[2]/div/div[2]/div[2]/button")
	WebElement proceedBtn;
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[1]/div[2]/input")
	WebElement enterCouponCode;
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[1]/div[2]/button")
	WebElement applyNowBtn;
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[2]/button/span")
	WebElement payNow;
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[2]/button")
	WebElement submitBtn;

	GenericMethods gm = new GenericMethods();
	public void Register_As_Institutional_Investor(String enter_firm_Name, String enter_Firm_pan, String first_name,
			String middle_name, String last_name, String email_ID, String pwd, String re_pwd, String mobile)
			throws InterruptedException {

		signUpBtn.click();
		Thread.sleep(2000);
		// gm.ExplicitWaitVisible(investorIcon, driver);
		investorIcon.click();
		Thread.sleep(2000);
		// gm.ExplicitWaitVisible(institionOpt, driver);
		institionOpt.click();
		firmName.sendKeys(enter_firm_Name);
		firmPanCard.sendKeys(enter_Firm_pan);
		firstName.sendKeys(first_name);
		middleName.sendKeys(middle_name);
		lastName.sendKeys(last_name);
		emailID.sendKeys(email_ID);
		v.setEmail(emailID.getAttribute("value"));
		password.sendKeys(pwd);
		re_password.sendKeys(re_pwd);
		mobileNum.sendKeys(mobile);
		Thread.sleep(4000);
		SendOTPBtn.click();
		Thread.sleep(2000);
		enterMobileOTP.sendKeys(OTPofMobile.getText());
		enterEmailOTP.sendKeys(OTPofEmail.getText());
		Actions actions = new Actions(driver);
		actions.moveToElement(terms_conditions).click().perform();
		actions.moveToElement(privicy_policy).click().perform();
		submitbtn.click();
		Thread.sleep(2000);
	}

	public void feePayment(String enter_coupon_code) throws InterruptedException {
		Thread.sleep(2000);
		enterCouponCode.sendKeys(enter_coupon_code);
		Thread.sleep(2000);
		applyNowBtn.click();
		Thread.sleep(2000);
		submitBtn.click();
	}

}
