package com.web.testCases;

import org.testng.annotations.Test;
import com.util.LaunchBrowser;
import com.util.SavedData;
import com.web.testPages.IndividualInvestorBasicRegPage;

public class IndividualInvestorBasicRegTest extends LaunchBrowser {

	public static SavedData save = new SavedData();

	@Test
	public void enterIndividualInvestorBasicDetails() throws InterruptedException {
		IndividualInvestorBasicRegPage iibrp = new IndividualInvestorBasicRegPage(driver);
		iibrp.enterBasicDetailsOfIndividualInvestor("Frist", "Middle", "Last", aadhaarNumber().toString(), rPanNum(),
				randomEmailID(), "Test@123", "Test@123", mobileNumber().toString());

		// assertEquals(iibrp.getTitle(), "Register as Individual Investor");
		System.out.println("Redirected to Register as Individual Investor page");
	}

}
