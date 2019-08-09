package com.web.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.util.LaunchBrowser;
import com.web.testPages.BorrowerEmploymentDetailsPage;
import com.web.testPages.LoginPage;

public class BorrowerEmploymentDetailsTest extends LaunchBrowser {
	
	public void enterValidEmpDetails() throws InterruptedException {

		BorrowerUserDetailsTest ud = new BorrowerUserDetailsTest();
		ud.enterValidUserDetails();
		// Employee Details
		BorrowerEmploymentDetailsPage n = new BorrowerEmploymentDetailsPage(driver);
		System.out.println(driver.getCurrentUrl());
		n.enterEmploymentDetails("Onsis", "stagingb3@gmail.com", "Sector 82", "201305", "65466", "3565655");
	}
	
	@Test
	public void  checkRedirectionOtEducationDetails() throws InterruptedException {
		enterValidEmpDetails();
		LoginPage l = new LoginPage(driver);
		l.reLogin();
		Thread.sleep(2000);
		l.clickOnContinueBtn();
		BorrowerEmploymentDetailsPage k = new BorrowerEmploymentDetailsPage(driver);
		Assert.assertEquals(k.titleOfEduDetailsPage(), "Education Details", "Not redirected to Education Details page");;  
	}
	
	

}
