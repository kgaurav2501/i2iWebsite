package com.web.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationFeePaymentPage {
	WebDriver driver;

	public RegistrationFeePaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/div/div[2]/div/div[2]/div[2]/button")
	WebElement proceedBtn;
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/div[2]/div[1]/div[2]/input")
	WebElement enterCouponCode;
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/div[2]/div[1]/div[2]/button")
	WebElement applyNowBtn;
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/div[3]/button/span")
	WebElement payNow;
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/div[3]/button")
	WebElement submitBtn;

	public void feePayment(String enter_coupon_code) throws InterruptedException {
		Thread.sleep(2000);
		proceedBtn.click();
		enterCouponCode.sendKeys(enter_coupon_code);
		Thread.sleep(2000);
		applyNowBtn.click();
		Thread.sleep(2000);
		submitBtn.click();
	}
}
