package com.web.testCases;

import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.BorrowerBasicRegistrationPage;

public class BorrowerBasicRgistrationTest extends LaunchBrowser {

	public void basicRegistrationWithValidData() throws InterruptedException {
		// Basic Registration
		// (first_name, middle_name, last_name, gender, aadhar_num, pan_num, email_id,
		// enter_password, re_enter_Password, mobile_num);

		BorrowerBasicRegistrationPage br = new BorrowerBasicRegistrationPage(driver);
		br.borrowerBasicSignup("Kumar", "", "Gaurav", "Male", aadhaarNumber().toString(), rPanNum(), randomEmailID(),
				"Test@123", "Test@123", mobileNumber().toString());
	}

	@Test
	public void validationchck() throws InterruptedException {

		BorrowerBasicRegistrationPage br = new BorrowerBasicRegistrationPage(driver);
		br.borrowerBasicSignup("Kumar", "", "Gaurav", "Male", aadhaarNumber().toString(), rPanNum(), randomEmailID(),
				"Test@123", "Test@123", mobileNumber().toString());
		br.logOut();

		br.borrowerBasicSignup("", "", "", "", aadhaarNumber().toString(),
				BorrowerBasicRegistrationPage.save.getPanNum(), BorrowerBasicRegistrationPage.save.getEmail(), "", "",
				BorrowerBasicRegistrationPage.save.getMobileNum());
	}

}
