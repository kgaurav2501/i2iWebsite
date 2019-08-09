package com.web.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.GenericMethods;

public class Institution_BankAccountDetailsPage {
	
	WebDriver driver;
	GenericMethods gm = new GenericMethods();
	
	public Institution_BankAccountDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[1]/div/app-nameinput/div/div[2]/div[1]/input")
	WebElement acHolderFirstName;
	
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[1]/div/app-nameinput/div/div[2]/div[2]/input")
	WebElement acMiddleName;
	
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[1]/div/app-nameinput/div/div[2]/div[3]/input")
	WebElement acLastName;
	
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[1]/div/div/div[2]/label")
	WebElement acTypeCurrentRadio;
	
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[1]/div/div/div[3]/label")
	WebElement acTypeSavingRadio;
	
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[2]/div[1]/input")
	WebElement acNum;
	
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[2]/div[2]/input")
	WebElement ifsc;
	
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[3]/div[1]/input")
	WebElement bankName;
	
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[1]/div/div/div/div[3]/div[3]/div[2]/input")
	WebElement branchName; 	
	
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[2]/div/div/div[2]/div/app-fileinput/div/div/label[1]/input")
	WebElement uploadCancelChk;
	
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[2]/div/div/div[3]/div/button[1]")
	WebElement backBtn;
	
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div[2]/div/div/div[3]/div/button[2]")
	WebElement submitBtn;
	
	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div/h3/button/span")
	WebElement continueLogIn;
	
	
	public void institutionBankDetails(String first_name, String middle_name, String last_name, String ac_type, String ac_num, String ifsc_num, String bank_name, String branch_name) throws InterruptedException {
		acHolderFirstName.sendKeys(first_name);
		acMiddleName.sendKeys(middle_name);
		acLastName.sendKeys(last_name);
		if(ac_type.equals("Current")) {
			acTypeCurrentRadio.click();
		}
		if(ac_type.equals("Saving")) {
			acTypeSavingRadio.click();
		}
		acTypeSavingRadio.click();
		acNum.sendKeys(ac_num);
		ifsc.sendKeys(ifsc_num);
		bankName.sendKeys(bank_name);
		branchName.sendKeys(branch_name);
		uploadCancelChk.sendKeys("C:\\Users\\i2i funding\\Downloads\\image.png");
		Thread.sleep(2000);
		submitBtn.click();
		gm.explicitWaitUnitlElementNotVisible(continueLogIn);
		continueLogIn.click();
	}
}
