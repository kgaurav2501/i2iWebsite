package com.web.testCases;

import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.IndividualInvestorUserDetailsPage;

public class IndividualInvestorUserDetailsTest extends LaunchBrowser {
	@Test
	public void checkuserdetailWithValidData() throws InterruptedException {
		IndividualInvestorBasicRegTest iibrt = new IndividualInvestorBasicRegTest();
		iibrt.checkValidSignUp();
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
