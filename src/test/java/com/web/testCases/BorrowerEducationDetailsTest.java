package com.web.testCases;

import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.BorrowerEducationDetails;

@Test
public class BorrowerEducationDetailsTest extends LaunchBrowser {

	public void enterValidEducationDetails() throws InterruptedException {

		 BorrowerEmploymentDetailsTest b = new BorrowerEmploymentDetailsTest();
		 b.enterValidEmpDetails();
		// Education Details
		BorrowerEducationDetails ed = new BorrowerEducationDetails(driver);
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		ed.enterEducationDetails("BE", "Annamalai", "Mech", "2014");
		

	}

}
