package com.web.testCases;

import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.IndividualInvestorEmploymentDetailsPage;

public class IndividualInvestorEmploymentDetailsTest extends LaunchBrowser {

	@Test
	public void submitValidEmploymentDetails() throws InterruptedException {
		IndividualInvestorUserDetailsTest y = new IndividualInvestorUserDetailsTest();
		y.checkuserdetailWithValidData();
		
		IndividualInvestorEmploymentDetailsPage b = new IndividualInvestorEmploymentDetailsPage(driver);
		b.selectEmpType("Salaried");
		b.enterAnnualIncome("500000");
		b.clickOnNext();
	}

}
