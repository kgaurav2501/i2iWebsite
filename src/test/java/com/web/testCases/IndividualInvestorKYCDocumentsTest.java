package com.web.testCases;

import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.IndividualInvestorKYCDocumentsPage;

public class IndividualInvestorKYCDocumentsTest extends LaunchBrowser {

	@Test
	public void kyc() throws InterruptedException {
		
	IndividualInvestorEmploymentDetailsTest ii = new IndividualInvestorEmploymentDetailsTest();
	ii.submitValidEmploymentDetails();
	
	IndividualInvestorKYCDocumentsPage kk = new IndividualInvestorKYCDocumentsPage(driver);
	kk.kycDoc("Driving Licence");

	}
}
