package com.web.testCases;

import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.BorrowerEmploymentDetailsPage;

public class BorrowerEmploymentDetailsTest extends LaunchBrowser {
	@Test
	public void enterValidEmpDetails() throws InterruptedException {

		BorrowerUserDetailsTest ud = new BorrowerUserDetailsTest();
		ud.enterValidUserDetails();
		// Employee Details
		BorrowerEmploymentDetailsPage n = new BorrowerEmploymentDetailsPage(driver);
		System.out.println(driver.getCurrentUrl());
		n.enterEmploymentDetails("Onsis", randomEmailID(), "Sector 82", "201305", "65466", "3565655");
	}

}
