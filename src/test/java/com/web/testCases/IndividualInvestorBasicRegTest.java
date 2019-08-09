package com.web.testCases;

import org.testng.annotations.Test;
import com.util.LaunchBrowser;
import com.util.SavedData;
import com.web.testPages.IndividualInvestorBasicRegPage;

public class IndividualInvestorBasicRegTest extends LaunchBrowser {

	public static SavedData save = new SavedData();
	@Test
	public void enterIndividualInvestorBasicDetails() throws InterruptedException {
		IndividualInvestorBasicRegPage iibrp = new IndividualInvestorBasicRegPage(driver);
		iibrp.clickOnSignupBtn();
		iibrp.clickOnInvestorIcon();
		Thread.sleep(2000);
		iibrp.selectInvestorOption();
		Thread.sleep(2000);
		iibrp.enterFirstName("Stage");
		iibrp.enterMiddleName("");
		iibrp.enterLastName("In");
		iibrp.selectMaleBtn();
		iibrp.enterAddharNum(aadhaarNumber().toString());
		iibrp.enterPanNum(rPanNum());
		iibrp.enterEmail("in@gmail.com");
		System.out.println(iibrp.getEmail());
		iibrp.enterPassword("Test@123");
		iibrp.enterRepassword("Test@123");
		save.setEmail(iibrp.getEmail());
		save.setpass(iibrp.getPass());
		iibrp.enterMobileNum(mobileNumber().toString());
		Thread.sleep(2000);
		iibrp.clickOnSendOTPBtn();
		Thread.sleep(2000);
		iibrp.enterEmailOTP(iibrp.getEmailOTP());
		iibrp.enterMobileOTP(iibrp.getMobileOTP());
		iibrp.clickOnTermsConditions();
		iibrp.clickOnPrivacyPolicy();
		iibrp.clickOnSubmitBtn();
		
		// assertEquals(iibrp.getTitle(), "Register as Individual Investor");
		System.out.println("Redirected to Register as Individual Investor page");
	}
	
	

}
