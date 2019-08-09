package com.web.testCases;

import org.testng.annotations.Test;
import com.util.LaunchBrowser;
import com.web.testPages.Institution_BankAccountDetailsPage;
import com.web.testPages.Institution_InvestorBasicDetailsPage;
import com.web.testPages.Institution_InvestorKYCDocPage;
import com.web.testPages.Institution_InvestorUserDetailsPage;
import com.web.testPages.LoginPage;

public class Institution_BankAccountDetailsTest extends LaunchBrowser {

	@Test
	public void insBankDetails() throws InterruptedException {

		Institution_InvestorBasicDetailsPage f = new Institution_InvestorBasicDetailsPage(driver);
		f.Register_As_Institutional_Investor("i2iFundind", rPanNum(), "TEstF", "TestM", "TestL", randomEmailID(),
				"Test@123", "Test@123", mobileNumber().toString());

		f.feePayment("fee100");

		Institution_InvestorUserDetailsPage iip = new Institution_InvestorUserDetailsPage(driver);
		iip.institutionUserDetails("Private Limited", "gst12345", "firmaddress", "201301");

		Institution_InvestorKYCDocPage kd = new Institution_InvestorKYCDocPage(driver);
		kd.docKyc();

		Institution_BankAccountDetailsPage k = new Institution_BankAccountDetailsPage(driver);
		k.institutionBankDetails("TestFN", "TestM", "TestL", "Saving", "5289877888", "ICIC0000045", "ICICI",
				"Sector 65");

		LoginPage l = new LoginPage(driver);
		l.clickSignIn();
		l.login(Institution_InvestorBasicDetailsPage.v.getEmail(), "Test@123");
	}

}
