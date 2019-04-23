
package com.web.testCases;

import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.Institution_InvestorBasicDetailsPage;
import com.web.testPages.Institution_InvestorKYCDocPage;
import com.web.testPages.Institution_InvestorUserDetailsPage;

@Test
public class Institution_InvestorKYCDocTest extends LaunchBrowser {
	
	public void institutionInvestorKYC() throws InterruptedException {
		Institution_InvestorBasicDetailsPage f = new Institution_InvestorBasicDetailsPage(driver);
		f.Register_As_Institutional_Investor("i2iFundind", rPanNum(), "TEstF", "TestM", "TestL", randomEmailID(),
				"Test@123", "Test@123", mobileNumber().toString());

		f.feePayment("fee100");

		Institution_InvestorUserDetailsPage iip = new Institution_InvestorUserDetailsPage(driver);
		iip.institutionUserDetails("Private Limited", "gst12345", "firmaddress", "201301");

		Institution_InvestorKYCDocPage kd = new Institution_InvestorKYCDocPage(driver);
		kd.docKyc();	
	}

}
