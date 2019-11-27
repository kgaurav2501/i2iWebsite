package com.web.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.util.LaunchBrowser;
import com.web.testPages.BorrowerBasicRegistrationPage;
import com.web.testPages.LoginPage;

public class BorrowerBasicRgistrationTest extends LaunchBrowser {
	
	@Test(priority = 1)
	public void fieldValidation() throws InterruptedException {
		BorrowerBasicRegistrationPage bp = new BorrowerBasicRegistrationPage(driver);
		bp.clickOnSignupBtn();
		bp.clickOnBorrowerOpt();
		SoftAssert sa = new SoftAssert();
		// First Name Validation test
		bp.enterFirstName("!@#$%^&*()_-");
		sa.assertEquals(bp.getFirstNameErrorMsg(), "Please enter first name.", "First msg message diplay");
		sa.assertEquals(bp.getFirstName(), "", "First name Invalid");

		// Middle Name Validation test
		bp.enterMiddleName("1!@#$%^&*()_");
		sa.assertEquals(bp.getMiddleName(), "", "Middle name Invalid");
		sa.assertEquals(bp.getMiddleNameValidationMsg(), "Please enter your middle name as it appears in Pan Card.",
				"Middle Name validation Message is wrong");

		// Last Name validation
		bp.enterLastName("1!@#$%^&*()_");
		sa.assertEquals(bp.getLastName(), "", "Last name Invalid");
		sa.assertEquals(bp.getLastNameValidationMsg(), "Please enter last name.", "Last name validation Msg is wrong");

		// AddharNumber validation testing
		bp.enterAddharNum("!@#$%^&*(q");
		sa.assertEquals(bp.getAddharNum(), "Invalid Aadhaar number", "Addhar number field allows special charecter");

		// Pan Validation testing
		bp.enterPanNum("@#$%^&*SD123");
		sa.assertEquals(bp.getPanErroMsg(), "Invalid PAN Card details", "Pan number error message is wrong");

		// Email Validation
		bp.enterEmail("gaurav");
		sa.assertEquals(bp.emailValidaionMsg(), "Invalid Email-Id", "Email Invalid");
		bp.enterEmail("gaurav@");
		sa.assertEquals(bp.emailValidaionMsg(), "Invalid Email-Id", "Email Invalid");
		bp.enterEmail("gaurav@gmail");
		sa.assertEquals(bp.emailValidaionMsg(), "Invalid Email-Id", "Email Invalid");
		bp.enterEmail("gaurav@gmailcom");
		sa.assertEquals(bp.emailValidaionMsg(), "Invalid Email-Id", "Email Invalid");
//		bp.enterEmail("bor@gmail.com");
//		sa.assertEquals(bp.emailValidaionMsg(), "This Email-Id is already exist.", "Email Invalid");

		// Mobile Validation
		bp.enterMobileNum("jhklfgdjklh");
		sa.assertEquals(bp.getMobilenumber(), "", "Mobile Number allow charecter");
		bp.enterMobileNum("155");
		sa.assertEquals(bp.getMobilenumberErrorMsg(), "Invalid Mobile number", "Mobile Number Invalid");
		sa.assertAll();
	}

	// Basic Registration
	// @Test(priority = 2, retryAnalyzer = Retry.class)
	public void basicRegistrationWithValidData() throws InterruptedException {
		BorrowerBasicRegistrationPage bp = new BorrowerBasicRegistrationPage(driver);
		bp.clickOnSignupBtn();
		bp.clickOnBorrowerOpt();
		bp.enterBorrowerBasicDetails("Kumar", "", "Gaurav", "Male", aadhaarNumber().toString(), rPanNum(),
				randomEmailID(), "Test@123", "Test@123", mobileNumber().toString());
		Assert.assertEquals(bp.getLoanEligibilityTitle(), "Check Loan Eligibility",
				"Failed:-Not redirected to Check Loan Eligibility page");
		System.out.println("Basic SignUp Successful Redirected to:" + bp.getLoanEligibilityTitle());
	}

	@Test
	// Religion and check redirecting to Check Eligibility Page.
	public void reDirectionToEligibilityPage() throws InterruptedException {
		BorrowerBasicRegistrationPage bp = new BorrowerBasicRegistrationPage(driver);
		basicRegistrationWithValidData();
		LoginPage l = new LoginPage(driver);
		l.reLogin();
		Thread.sleep(2000);
		l.clickOnContinueBtn();
		Assert.assertEquals(bp.getLoanEligibilityTitle(), "Check Loan Eligibility",
				"Failed:-Not redirected to Check Loan Eligibility page");
//		System.out.println(driver.getTitle());
	}

}
