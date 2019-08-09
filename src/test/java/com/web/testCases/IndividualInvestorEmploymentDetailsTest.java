package com.web.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.util.LaunchBrowser;
import com.web.testPages.IndividualInvestorEmploymentDetailsPage;
import com.web.testPages.IndividualInvestorUserDetailsPage;

public class IndividualInvestorEmploymentDetailsTest extends LaunchBrowser {

	@Test
	public void checkRedirectionToKYCdocPage() throws InterruptedException {
		enterEmploymentDetails();
		IndividualInvestorEmploymentDetailsPage i = new IndividualInvestorEmploymentDetailsPage(driver);
		Thread.sleep(2000);
		Assert.assertEquals(i.getTitleOfKYCdoc(), "KYC Documents", "Not redirected to KYC Documents");
	}
	
	
	//Enter Employment Details.
	public void enterEmploymentDetails() throws InterruptedException {
		//Individual investor Basic reg
		IndividualInvestorBasicRegTest br = new IndividualInvestorBasicRegTest();
		br.enterIndividualInvestorBasicDetails();
		//Fee payment
		IndividualInvestorUserDetailsPage k = new IndividualInvestorUserDetailsPage(driver);
		//k.clickPayNowBtn();
		//k.cardPayment("5123456789012346", "test", "123", "05", "2020");
		k.couponPayment("fee100");
		//Enter Individual investor user Details
		IndividualInvestorUserDetailsTest y = new IndividualInvestorUserDetailsTest();
		y.enterValidUserDetails();
		//Enter Individual investor Employment Details.
		IndividualInvestorEmploymentDetailsPage b = new IndividualInvestorEmploymentDetailsPage(driver);
		b.selectEmpType("Salaried");
		b.enterAnnualIncome("500000");
		b.clickOnNext();
	}

}
