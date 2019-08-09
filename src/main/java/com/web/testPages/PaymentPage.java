package com.web.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.util.GenericMethods;

public class PaymentPage {
	WebDriver driver;

	public PaymentPage(WebDriver driver) {
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
	
	@FindBy(xpath = "//*[@id=\"ccard_number\"]")
	WebElement cardNumber;
	
	@FindBy(xpath = "//*[@id=\"cname_on_card\"]")
	WebElement nameOnCard;
	
	@FindBy(xpath = "//*[@id=\"ccvv_number\"]")
	WebElement cvvNo;
	
	@FindBy(xpath = "//*[@id=\"cexpiry_date_month\"]")
	WebElement month;
	
	@FindBy(xpath = "//*[@id=\"cexpiry_date_year\"]")
	WebElement year;
	
	@FindBy(xpath = "//*[@id=\"pay_button\"]")
	WebElement CpayNow;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/div/div/button")
	WebElement processBtn;
	
	GenericMethods gm = new GenericMethods();

	public void couponPayment(String enter_coupon_code) throws InterruptedException {
		enterCouponCode.sendKeys(enter_coupon_code);
		Thread.sleep(2000);
		applyNowBtn.click();
		Thread.sleep(2000);
		submitBtn.click();
	}
	
	public void cardPayment(String CardNo, String NameOnCard, String CVV, String ExpMonth, String ExpYear ) throws InterruptedException {
	
		cardNumber.sendKeys(CardNo);
		nameOnCard.sendKeys(NameOnCard);
		cvvNo.sendKeys(CVV);
		Select s = new Select(month);
		s.selectByValue(ExpMonth);
		Select r = new Select(year);
		r.selectByValue(ExpYear);
		CpayNow.click();
	}
	
	public void clickPayNowBtn() {
		gm.explicitWaitUnitlElementNotVisible(payNow);
		payNow.click();	
	}
	
	//Click on process button of congratulations page.
	public void clickOnProcessBtn() {
		gm.explicitWaitUnitlElementNotVisible(processBtn);
		processBtn.click();
		
	}
	
	
}
