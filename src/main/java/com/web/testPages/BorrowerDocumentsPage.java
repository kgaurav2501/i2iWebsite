package com.web.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BorrowerDocumentsPage {
	WebDriver driver;

	public BorrowerDocumentsPage(WebDriver driver) {
		this.driver = driver;
	}

	// upload image of pancard
	By uploadPanCard = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-fileinput[1]/div/div[1]/label[1]/input");

	// Upload Image of AadharCard
	By uploadAadharCard = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-fileinput[2]/div/div[1]/label[1]/input");

	// Type of permanent address proof
	By selectpermanentAddressProof = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[3]/div/select");

	// Upload permanent address proof
	By uploadPermanentAddressProof = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-fileinput[3]/div/div[1]/label[1]/input");

	// Select type of current address proof
	By selectCurrentAddressType = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[4]/div/select");

	// Upload current address proof
	By uploadCurrentAddressProof = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-fileinput[4]/div/div[1]/label[1]/input");

	// Upload Bank Ac statement of last 12 month
	By ulpoad12monthBankAcStatement = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-fileinput[5]/div/div[1]/label[1]/input");

	// Upload Salary Slip of last month
	By uploadLastMonthSalarySlip = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[5]/div/app-fileinput[1]/div/div[1]/label[1]/input");

	// Upload salary slip of 2nd last month
	By upload2ndMonthSlip = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[5]/div/app-fileinput[2]/div/div[1]/label[1]/input");

	// Upload salary slip of 3d last month
	By upload3rdMonthSlip = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[5]/div/app-fileinput[3]/div/div[1]/label[1]/input");

	// Upload Higher Degree Marksheet
	By higherDegreeMarkSheet = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[5]/div/app-fileinput[4]/div/div[1]/label[1]/input");

	// allow us to enquire any credit evaluation company to know your credit history
	By allowToEnqCheckBox = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[6]/label[1]");

	// Please allow us to share your details with our affiliates in order to
	By allowToShareDetailsCheckBox = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[6]/label[2]");

	// Submit Btn
	By submitBtn = By.xpath(
			"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[7]/button");

	// Thank you page
	By thanksMsg = By.xpath("/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/h1[1]");

	By continueToLoginBtn = By
			.xpath("/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/h1[2]/button");

	// -----------------------------------------ActionMethods---------------------------------------------------

	String docPath = "C:\\Users\\i2i funding\\Downloads\\image.png";

	public void uploadDoc(String address_type_proof, String current_address_type_proof) throws InterruptedException {
		driver.findElement(uploadPanCard).sendKeys(docPath);

		driver.findElement(uploadAadharCard).sendKeys(docPath);
		Select pap = new Select(driver.findElement(selectpermanentAddressProof));
		pap.selectByVisibleText(address_type_proof);

		driver.findElement(uploadPermanentAddressProof).sendKeys(docPath);

		Select pa = new Select(driver.findElement(selectCurrentAddressType));
		pa.selectByVisibleText(current_address_type_proof);

		driver.findElement(uploadCurrentAddressProof).sendKeys(docPath);

		driver.findElement(ulpoad12monthBankAcStatement).sendKeys(docPath);
		Thread.sleep(2000);
		driver.findElement(uploadLastMonthSalarySlip).sendKeys(docPath);

		driver.findElement(upload2ndMonthSlip).sendKeys(docPath);

		driver.findElement(upload3rdMonthSlip).sendKeys(docPath);

		driver.findElement(higherDegreeMarkSheet).sendKeys(docPath);

		driver.findElement(allowToEnqCheckBox).click();

		driver.findElement(allowToShareDetailsCheckBox).click();
		Thread.sleep(2000);
		driver.findElement(submitBtn).click();
		Thread.sleep(2000);
		//driver.findElement(continueToLoginBtn).click();
		
	}

}
