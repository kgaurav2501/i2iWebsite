package com.web.testCases;

import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.IndividualInvestorBankDetailsPage;
import com.web.testPages.LoginPage;

public class IndividualInvestorBankDetailsTest extends LaunchBrowser {

	@Test
	public void enterBankDetails() throws InterruptedException {
		IndividualInvestorKYCDocumentsTest p = new IndividualInvestorKYCDocumentsTest();
		p.enterKycDetails();
		IndividualInvestorBankDetailsPage l = new IndividualInvestorBankDetailsPage(driver);
		l.enterBankAcDetails("Kumar", "m", "l", "589895645875", "ICIC0000045", "ICICI", "Branch name", "Current");
		LoginPage login = new LoginPage(driver);
		login.clickSignIn();
		login.login(IndividualInvestorBasicRegTest.save.getEmail(), "Test@123");
	}
}
