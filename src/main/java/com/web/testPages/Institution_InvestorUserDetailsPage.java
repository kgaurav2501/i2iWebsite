package com.web.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Institution_InvestorUserDetailsPage {

	WebDriver driver;

	public Institution_InvestorUserDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[1]/select")
	WebElement firmType;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/my-date-picker/div/div/input")
	WebElement firmIncorporationDate;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[3]/input")
	WebElement GSTnumber;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/app-addressinput/div/div[1]/input")
	WebElement address;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/app-addressinput/div/div[2]/input")
	WebElement pinCode;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[3]/button[1]")
	WebElement saveBtn;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[3]/button[2]")
	WebElement nextBtn;

//	@FindBy(xpath = "")
//	WebElement

	public void institutionUserDetails(String frim_type, String gst_num, String frim_address, String pin_code) throws InterruptedException {
		firmType.click();
		Select select = new Select(firmType);
		select.selectByVisibleText(frim_type);

		firmIncorporationDate.click();
		// Firm Incorporation Date.
		driver.findElement(By.xpath(
				"/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/my-date-picker/div/div[2]/table[1]/tbody/tr/td[3]/div/div[2]/button"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/my-date-picker/div/div[2]/table[2]/tbody/tr[1]/td/button"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/my-date-picker/div/div[2]/table[2]/tbody/tr[2]/td[1]/div"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/my-date-picker/div/div[2]/table[2]/tbody/tr[3]/td[5]"))
				.click();

		GSTnumber.sendKeys(gst_num);
		address.sendKeys(frim_address);
		pinCode.sendKeys(pin_code);
		Thread.sleep(2000);
		nextBtn.click();

	}

}
