package com.web.testCases;

import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.BorrowerLoanEligibilityPage;
import com.web.testPages.LoginPage;

public class BorrowerLoanEligibilityTest extends LaunchBrowser {

	// @Test(dependsOnMethods={"basicRegistrationWithValidData"})
	public void checkLoanEligibility() throws InterruptedException {
		//call Basic registration page.
		BorrowerBasicRgistrationTest bt = new BorrowerBasicRgistrationTest();
		// Enter Basic registration details and submit.
		bt.basicRegistrationWithValidData();
		//Enter loan Eligiblity Details.
		enterLoanEligiblityDetails();
	}
	@Test
	public void checkRedirectionToEligibilityStatus() throws InterruptedException {
		checkLoanEligibility();
		BorrowerLoanEligibilityPage blep = new BorrowerLoanEligibilityPage(driver);
		blep.clickOnProceedBtn();
		LoginPage l = new LoginPage(driver);
		l.reLogin();
		Thread.sleep(2000);
		l.clickOnContinueBtn();	
//		Assert.assertEquals(actual, expected);
	} 	
	
	
	
	

	//Enter loan Eligiblity Details.
	public void enterLoanEligiblityDetails() throws InterruptedException {
		BorrowerLoanEligibilityPage le = new BorrowerLoanEligibilityPage(driver);
		Thread.sleep(2000);
		le.enterloanDetails("50000", "5 Months", "Education", "Test123 Desc");
		le.enetrPersonalDetails("Single", "201302");
		le.employmentDetailsSalaried("Onsis", "50000", "Credit to Bank Account", "2", "5");
		le.enterFinancialDetails("Own", "2000", "No", "No");
		le.pastCIBILDetails("No", "No", "956");
	}

}
