package com.web.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.BorrowerEducationDetailsPage;
import com.web.testPages.BorrowerLoanEligibilityPage;
import com.web.testPages.BorrowerUserDetailsPage;
import com.web.testPages.LoginPage;
import com.web.testPages.PaymentPage;

public class BorrowerUserDetailsTest extends LaunchBrowser {

	@Test
	public void enterValidUserDetails() throws InterruptedException {
		BorrowerLoanEligibilityTest let = new BorrowerLoanEligibilityTest();
		let.checkLoanEligibility();
		// Click on process button of Eligibility Status page.
		BorrowerLoanEligibilityPage blep = new BorrowerLoanEligibilityPage(driver);
		blep.clickOnProceedBtn();
		//Payment
		PaymentPage r = new PaymentPage(driver);
//		r.couponPayment("fee100");
		r.clickPayNowBtn();
		Thread.sleep(2000);
		r.cardPayment("5123456789012346", "gaurav", "123", "05", "2020");
		r.clickOnProcessBtn();
		enterBUserDetails();
	}

	//@Test
	// To check after relogin redirecting to Employment Details.
	public void checkRedirectionToEmpDtails() throws InterruptedException {
		BorrowerLoanEligibilityTest let = new BorrowerLoanEligibilityTest();
		let.checkLoanEligibility();
		// Click on process button of Eligibility Status page.
		BorrowerLoanEligibilityPage blep = new BorrowerLoanEligibilityPage(driver);
		blep.clickOnProceedBtn();
		// Payment
		PaymentPage r = new PaymentPage(driver);
		// r.couponPayment("fee100");
		r.clickPayNowBtn();
		r.cardPayment("5123456789012346", "gaurav", "123", "05", "2020");
		r.clickOnProcessBtn();
		enterBUserDetails();
		LoginPage l = new LoginPage(driver);
		l.reLogin();
		Thread.sleep(2000);
		l.clickOnContinueBtn();
		BorrowerEducationDetailsPage b = new BorrowerEducationDetailsPage(driver);
		Assert.assertEquals(b.getTitleOfBorrowerEducationDetail(), "Employment Details", "Not redirected to Employment Details page");

	}

	// Enter user details of borrower.
	public void enterBUserDetails() throws InterruptedException {
		BorrowerUserDetailsPage bup = new BorrowerUserDetailsPage(driver);
//		System.out.println(driver.getCurrentUrl());
		bup.enterUserDetails("testfirst", "testfirst", "testfirst", "test p add", "201302", "CURRENTADDRESS", "201301");

	}

}
