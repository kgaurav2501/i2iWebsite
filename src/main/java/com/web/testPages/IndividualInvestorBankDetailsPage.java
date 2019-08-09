package com.web.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.GenericMethods;

public class IndividualInvestorBankDetailsPage {
	GenericMethods gm = new GenericMethods();
//	WebDriver driver;
	public IndividualInvestorBankDetailsPage(WebDriver driver) {
//		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// First Name
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[1]/div/app-nameinput/div/div[2]/div[1]/input")
	WebElement firstName;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[1]/div/app-nameinput/div/div[2]/div[2]/input")
	WebElement middleName;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[1]/div/app-nameinput/div/div[2]/div[3]/input")
	WebElement LastName;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[2]/div[1]/input")
	WebElement accountNo;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[3]/div[1]/input")
	WebElement bankName;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[1]/div/div/div[2]/label")
	WebElement current;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[1]/div/div/div[3]/label")
	WebElement saving;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[2]/div[2]/input")
	WebElement ifsc;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[3]/div[2]/input")
	WebElement branchName;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[2]/div/div/div[2]/div/app-fileinput/div/div/label[1]/input")
	WebElement uploadCancelCheck;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[2]/div/div/div[3]/div/button[2]")
	WebElement submitBtn;
	
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div/h3/button")
	WebElement continueLogIn;

	public void enterBankAcDetails(String first_name, String middle_name, String last_name, String ac_no,
			String ifsc_code, String bank_name, String branch_name, String account_type) throws InterruptedException {
		firstName.sendKeys(first_name);
		middleName.sendKeys(middle_name);
		LastName.sendKeys(last_name);
		if (account_type.equals("Saving")) {
			saving.click();
		}
		if (account_type.equals("Current")) {
			current.click();
		}
		accountNo.sendKeys(ac_no);
		ifsc.sendKeys(ifsc_code);
		bankName.sendKeys(bank_name);
		branchName.sendKeys(branch_name);
		uploadCancelCheck.sendKeys("C:\\Users\\i2i funding\\Downloads\\image.png");
		Thread.sleep(2000);
		submitBtn.click();
		gm.explicitWaitUnitlElementNotVisible(continueLogIn);
		continueLogIn.click();
	}

}
