package com.web.testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.util.LaunchBrowser;
import com.web.testPages.LoginPage;

@Test
public class LoginTest extends LaunchBrowser {

	/*
	 * @Parameters({"emailID", "password"}) public void login(String emailID, String
	 * password) throws InterruptedException { LoginPage lp = new LoginPage(driver);
	 * lp.clickSignIn(); lp.login(emailID, password); }
	 * 
	 * public void reLogin(String emailID, String password) throws
	 * InterruptedException { LoginPage lp = new LoginPage(driver); lp.logOut();
	 * lp.clickSignIn(); lp.login(emailID, password); }
	 */
}
