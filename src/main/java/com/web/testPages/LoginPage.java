package com.web.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.GenericMethods;
import com.util.LaunchBrowser;

public class LoginPage {

	WebDriver driver;

	GenericMethods gm = new GenericMethods();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='containerNavbar']/ul[2]/li[1]/a")
	WebElement SignIn;

	@FindBy(xpath = "/html/body/app-root/div/app-login/section/div/div/div/div/div[1]/div[2]/div[1]/div[1]/input")
	WebElement emailID;

	@FindBy(xpath = "/html/body/app-root/div/app-login/section/div/div/div/div/div[1]/div[2]/div[1]/div[2]/input")
	WebElement pwd;

	@FindBy(xpath = "/html/body/app-root/div/app-login/section/div/div/div/div/div[1]/div[2]/div[2]/button")
	WebElement loginBtn;

	@FindBy(xpath = "/html/body/app-root/div/app-login/section/div/div/div/div/div[1]/div/h5/div/button")
	WebElement BorrowerClickOnContinueBtn;

	@FindBy(xpath = "//div[@class='navbar-collapse collapse justify-content-between']/ul[2]")
	WebElement myAccountBtn;

	@FindBy(xpath = "//*[@id=\"containerNavbar\"]/ul[2]/li[1]/div/a[3]")
	WebElement signOutBtn;

	public void reLogin() throws InterruptedException {
		gm.explicitWaitUnitlElementNotVisible(myAccountBtn);
		Thread.sleep(2000);
		myAccountBtn.click();
		gm.explicitWaitUnitlElementNotVisible(signOutBtn);
		Thread.sleep(2000);
		signOutBtn.click();
		gm.explicitWaitUnitlElementNotVisible(SignIn);
		Thread.sleep(2000);
		SignIn.click();
		login(BorrowerBasicRegistrationPage.save.getEmail(), "Test@123");
		
	}

	public void clickSignIn() throws InterruptedException {
		gm.explicitWaitUnitlElementNotVisible(SignIn);
		Thread.sleep(2000);
		SignIn.click();
	}

	public void login(String email, String password) {
		gm.explicitWaitUnitlElementNotVisible(emailID);
		emailID.sendKeys(email);
		pwd.sendKeys(password);
		gm.explicitWaitUntilElementNotClickable(loginBtn);
		loginBtn.click();
	}

	public void enterEmail(String email_id) {
		emailID.sendKeys(email_id);
	}

	public void enterPwd(String pass) {
		pwd.sendKeys(pass);
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}

	public void clickOnContinueBtn() throws InterruptedException {
		gm.explicitWaitUnitlElementNotVisible(BorrowerClickOnContinueBtn);
		BorrowerClickOnContinueBtn.click();
	}

}
