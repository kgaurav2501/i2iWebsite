package com.web.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.util.GenericMethods;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	By SignIn  = By.xpath("//*[@id=\"containerNavbar\"]/ul[2]/li[1]/a");
	
	By emailID = By.xpath("/html/body/app-root/div/app-login/section/div/div/div/div/div[1]/div[2]/div[1]/div[1]/input");
	
	By pwd = By.xpath("/html/body/app-root/div/app-login/section/div/div/div/div/div[1]/div[2]/div[1]/div[2]/input");
	
	By loginBtn = By.xpath("/html/body/app-root/div/app-login/section/div/div/div/div/div[1]/div[2]/div[2]/button/span");
	
	By clickOnContinueBtn = By.xpath("/html/body/app-root/div/app-login/section/div/div/div/div/div[1]/div/h5/div/button/span");

	
	GenericMethods gm = new GenericMethods();
	public void clickSignInBtn() {
		
		gm.ExplicitWaitVisible(driver.findElement(SignIn), driver);
		driver.findElement(SignIn).click();
		
	}
	
	public void  login(String email, String password) {
		driver.findElement(emailID).sendKeys(email);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(loginBtn).click();
	}
	
	public void enterEmail(String email_id) {
		driver.findElement(emailID).sendKeys(email_id);
		
	}
	
	public void enterPwd(String pass) {
		driver.findElement(pwd).sendKeys(pass);
		
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
		
	}
	
	public void clickOnContinueBtn() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(clickOnContinueBtn).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
