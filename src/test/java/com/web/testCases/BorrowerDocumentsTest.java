package com.web.testCases;

import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.BorrowerBasicRegistrationPage;
import com.web.testPages.BorrowerDocumentsPage;
import com.web.testPages.LoginPage;

public class BorrowerDocumentsTest extends LaunchBrowser {

	@Test
	public void uploadDoc() throws InterruptedException {

		BorrowerEducationDetailsTest n = new BorrowerEducationDetailsTest();
		n.enterValidEducationDetails();

		// Upload Documents.
		BorrowerDocumentsPage g = new BorrowerDocumentsPage(driver);
		g.uploadDoc("Electricity Bill", "Voter ID");
		
		LoginPage login = new LoginPage(driver);
		login.login(BorrowerBasicRegistrationPage.save.getEmail(), "Test@123");
	}
}
