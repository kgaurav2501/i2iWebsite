package com.web.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.BorrowerBasicRegistrationPage;
import com.web.testPages.BorrowerDocumentsPage;
import com.web.testPages.BorrowerEducationDetailsPage;
import com.web.testPages.BorrowerEmploymentDetailsPage;
import com.web.testPages.BorrowerLoanEligibilityPage;
import com.web.testPages.BorrowerUserDetailsPage;
import com.web.testPages.LoginPage;
import com.web.testPages.PaymentPage;
import com.web.testPages.RefferedPage;

public class BorrowerDocumentsTest extends LaunchBrowser {

	@Test
	public void uploadDoc() throws InterruptedException {

		// Basic Registration
		BorrowerBasicRegistrationPage a = new BorrowerBasicRegistrationPage(driver);
		a.clickOnSignupBtn();
		a.clickOnBorrowerOpt();
		a.enterBorrowerBasicDetails("Cat", "", "D", "Male", aadhaarNumber().toString(), rPanNum(),
				"catd@gmail.com", "Test@123", "Test@123", mobileNumber().toString());

		// Select reffered by YES / NO option.
		RefferedPage b = new RefferedPage(driver);
		b.selectReffOpt("NO", "");

		// Check loan Eligiblity.
		BorrowerLoanEligibilityPage c = new BorrowerLoanEligibilityPage(driver);
		Thread.sleep(2000);
		c.enterloanDetails("10000", "5 Months", "Education", "Test123 Desc");
		c.enetrPersonalDetails("Single", "201302");
		c.employmentDetailsSalaried("Onsis", "50000", "Credit to Bank Account", "2", "5");
		c.enterFinancialDetails("Own", "2000", "No", "No");
		c.pastCIBILDetails("No", "No", "956");
		c.clickOnProceedBtn();

		// Registration Fee Payment
		PaymentPage d = new PaymentPage(driver);
		d.couponPayment("fee100");

		// Enter User Details.
		BorrowerUserDetailsPage e = new BorrowerUserDetailsPage(driver);
		e.enterUserDetails("testfirst", "testfirst", "testfirst", "test p add", "201302", "CURRENTADDRESS", "201301");

		// Enter Employment Details.
		BorrowerEmploymentDetailsPage n = new BorrowerEmploymentDetailsPage(driver);
		System.out.println(driver.getCurrentUrl());
		n.enterEmploymentDetails("Onsis", "stagingb3@gmail.com", "Sector 82", "201305", "65466", "3565655");

		// Education Details.
		BorrowerEducationDetailsPage ed = new BorrowerEducationDetailsPage(driver);
		Thread.sleep(2000);
		ed.enterEducationDetails("BE", "Annamalai", "Mech", "2014");

		// Upload Documents.
		BorrowerDocumentsPage g = new BorrowerDocumentsPage(driver);
		g.uploadDoc("Electricity Bill", "Voter ID");
		LoginPage login = new LoginPage(driver);
		// Login with registered user.
		//login.clickOnContinueBtn();
		Thread.sleep(2000);
		login.clickSignIn();
		login.login(BorrowerBasicRegistrationPage.save.getEmail(), "Test@123");
	}

	//@Test
	public void afterBasicSignUpRedirectedToRefferelPage() throws InterruptedException {
		// Basic Registration
		BorrowerBasicRegistrationPage a = new BorrowerBasicRegistrationPage(driver);
		a.clickOnSignupBtn();
		a.clickOnBorrowerOpt();
		a.enterBorrowerBasicDetails("Kumar", "", "Gaurav", "Male", aadhaarNumber().toString(), rPanNum(),
				randomEmailID(), "Test@123", "Test@123", mobileNumber().toString());

		Assert.assertEquals(a.getLoanEligibilityTitle(), "Check Loan Eligibility",
				"Failed:-Not redirected to Check Loan Eligibility page");
		System.out.println("Basic SignUp Successful Redirected to:" + a.getLoanEligibilityTitle());

		// Logout
	//	a.logOut();

		// loginAgain
		a.clickOnSignInBtn();
		LoginPage l = new LoginPage(driver);
		l.login(BorrowerBasicRegistrationPage.save.getEmail(), "Test@123");
		l.clickOnContinueBtn();
		Assert.assertEquals(a.getLoanEligibilityTitle(), "Check Loan Eligibility",
				"Failed:-Not redirected to Check Loan Eligibility page");
		System.out.println("Basic SignUp Successful Redirected to:" + a.getLoanEligibilityTitle());

	}

}
