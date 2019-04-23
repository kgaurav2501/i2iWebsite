package com.web.testCases;

import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.BorrowerBasicRegistrationPage;
import com.web.testPages.BorrowerLoanEligibilityPage;
import com.web.testPages.RefferedPage;

public class BorrowerLoanEligibilityTest extends LaunchBrowser {

	@Test
	public void checkEligibility() throws InterruptedException {

		// Basic registration.
		BorrowerBasicRegistrationPage brp = new BorrowerBasicRegistrationPage(driver);
		brp.borrowerBasicSignup("John", "", "Carter", "Male", aadhaarNumber().toString(), rPanNum(), randomEmailID(),
				"Test@123", "Test@123", mobileNumber().toString());
		System.out.println("Basic Reg Success");

		// Click on refferal opt.
		RefferedPage rp = new RefferedPage(driver);
		rp.selectReffOpt("No", "");
		System.out.println("Reffered Success");

		// Eligibility.
		BorrowerLoanEligibilityPage le = new BorrowerLoanEligibilityPage(driver);
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		le.enterloanDetails("50000", "5 Months", "Education", "Test123 Desc");
		le.enetrPersonalDetails("Single", "201302");
		le.employmentDetailsSalaried("Onsis", "50000", "Credit to Bank Account", "2", "5");
		le.enterFinancialDetails("Own", "2000", "No", "No");
		le.pastCIBILDetails("No", "No", "956");

	}

}
