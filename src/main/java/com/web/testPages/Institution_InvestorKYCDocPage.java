package com.web.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Institution_InvestorKYCDocPage {
	WebDriver driver;

	public Institution_InvestorKYCDocPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/app-fileinput[1]/div/div[1]/label[1]/input")
	WebElement companyPan;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/app-fileinput[2]/div/div[1]/label[1]/input")
	WebElement RegCertificate;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[2]/button[2]")
	WebElement saveBtn;

	@FindBy(xpath = "/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[2]/button[3]")
	WebElement nextBtn;

	public void docKyc() throws InterruptedException {
		String docpath = "C:\\Users\\i2i funding\\Downloads\\image.png";
		companyPan.sendKeys(docpath);
		RegCertificate.sendKeys(docpath);
		Thread.sleep(2000);
		nextBtn.click();
	}
}
