package com.web.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.IndividualInvestorUserDetailsPage;
import com.web.testPages.Institution_InvestorUserDetailsPage;
import com.web.testPages.PaymentPage;

public class IndividualInvestorUserDetailsTest extends LaunchBrowser {
	@Test
	// check redirecting to Employment Details after relogin.
	public void checkRedirectingToEmpDetails() throws InterruptedException {
		//Enter basic details.
		IndividualInvestorBasicRegTest iibr = new IndividualInvestorBasicRegTest();
		iibr.enterIndividualInvestorBasicDetails();
		//
		IndividualInvestorUserDetailsPage k = new IndividualInvestorUserDetailsPage(driver);
		//k.clickPayNowBtn();
		//k.cardPayment("5123456789012346", "test", "123", "05", "2020");
		k.couponPayment("fee100");
		enterValidUserDetails();
		Assert.assertEquals(k.getTitleOfEmpDetails(), "Employment Details");
		System.out.println("Redirected to Employement Details");

	}

	// Enter Individual Investor User Details
	public void enterValidUserDetails() throws InterruptedException {
		IndividualInvestorUserDetailsPage iiudp = new IndividualInvestorUserDetailsPage(driver);
		iiudp.enterFirstName("investerFirstName");
		iiudp.enterMiddleName("investerMiddleName");
		iiudp.enterLastName("LastName");
		iiudp.clickOnSingle();
		iiudp.enterdob();
		iiudp.enterAddress("test addresss");
		iiudp.enterpin("201302");
		iiudp.clickOnNext();
	}

}
