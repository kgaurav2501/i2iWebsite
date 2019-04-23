package com.web.testCases;

import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.BorrowerUserDetailsPage;
import com.web.testPages.RegistrationFeePaymentPage;

public class BorrowerUserDetailsTest extends LaunchBrowser {

	@Test
	public void enterValidUserDetails() throws InterruptedException {

		BorrowerLoanEligibilityTest let = new BorrowerLoanEligibilityTest();
		let.checkEligibility();
		
		RegistrationFeePaymentPage r = new RegistrationFeePaymentPage(driver);
		r.feePayment("fee100");
		
		BorrowerUserDetailsPage bup =new BorrowerUserDetailsPage(driver);
		System.out.println(driver.getCurrentUrl());
		bup.enterUserDetails("testfirst", "testfirst", "testfirst", "test p add", "201302", "CURRENTADDRESS", "201301");
	}

}
