package com.web.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.util.LaunchBrowser;
import com.web.testPages.IndividualInvestorKYCDocumentsPage;

public class IndividualInvestorKYCDocumentsTest extends LaunchBrowser {

	@Test
	public void redirectionToBankAccountPage() throws InterruptedException {
		enterKycDetails();
		//Assert.assertEquals(actual, expected);
	}
	
	
	
	
	public void enterKycDetails() throws InterruptedException {	
	IndividualInvestorEmploymentDetailsTest ii = new IndividualInvestorEmploymentDetailsTest();
	ii.enterEmploymentDetails();
	IndividualInvestorKYCDocumentsPage kk = new IndividualInvestorKYCDocumentsPage(driver);
	kk.kycDoc("Driving Licence");

	}
}
