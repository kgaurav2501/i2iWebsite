package com.web.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.BorrowerDocumentsPage;
import com.web.testPages.BorrowerEducationDetailsPage;
import com.web.testPages.LoginPage;


public class BorrowerEducationDetailsTest extends LaunchBrowser {

	public void enterValidEducationDetails() throws InterruptedException {

		BorrowerEmploymentDetailsTest b = new BorrowerEmploymentDetailsTest();
		b.enterValidEmpDetails();
		// Education Details
		BorrowerEducationDetailsPage ed = new BorrowerEducationDetailsPage(driver);
		Thread.sleep(2000);
		ed.enterEducationDetails("BE", "Annamalai", "Mech", "2014");

	}
	
	@Test
	public void checkRedirectionToDocuments() throws InterruptedException {
		enterValidEducationDetails();
		LoginPage l = new LoginPage(driver);
		l.reLogin();
		Thread.sleep(2000);
		l.clickOnContinueBtn();
		BorrowerDocumentsPage bdp = new BorrowerDocumentsPage(driver);
		Assert.assertEquals(bdp.getDocPageTitle(), "Document Details Salaried", "Not redirected to Document Details Salaried");
	}

}
