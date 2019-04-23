package com.web.testCases;

import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.util.SavedData;
import com.web.testPages.Institution_InvestorBasicDetailsPage;

@Test
public class Institution_InvestorBasicDetailsTest extends LaunchBrowser {

	public void InsInvBasicSignup() throws InterruptedException {
		Institution_InvestorBasicDetailsPage ii = new Institution_InvestorBasicDetailsPage(driver);
		ii.Register_As_Institutional_Investor("i2iFundind", rPanNum(), "TestF", "TestM", "TestL", randomEmailID(),
				"Test@123", "Test@123", mobileNumber().toString());
		ii.feePayment("fee100");
		System.out.println("sfdklj;fds"+new SavedData().getEmail());
	}

}
