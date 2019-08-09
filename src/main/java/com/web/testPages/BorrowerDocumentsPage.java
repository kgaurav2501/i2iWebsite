package com.web.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.util.GenericMethods;

public class BorrowerDocumentsPage {

	WebDriver driver;
	GenericMethods gm = new GenericMethods();

	public BorrowerDocumentsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// upload image of pancard

	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-fileinput[1]/div/div[1]/label[1]/input")
	WebElement uploadPanCard;

	// Upload Image of AadharCard
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-fileinput[2]/div/div[1]/label[1]/input")
	WebElement uploadAadharCard;

	// Type of permanent address proof
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[3]/div/select")
	WebElement selectpermanentAddressProof;

	// Upload permanent address proof
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-fileinput[3]/div/div[1]/label[1]/input")
	WebElement uploadPermanentAddressProof;

	// Select type of current address proof
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[4]/div/select")
	WebElement selectCurrentAddressType;

	// Upload current address proof
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-fileinput[4]/div/div[1]/label[1]/input")
	WebElement uploadCurrentAddressProofElement;

	// Upload Bank Ac statement of last 12 month
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/app-fileinput[5]/div/div[1]/label[1]/input")
	WebElement ulpoad12monthBankAcStatement;

	// Upload Salary Slip of last month
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[5]/div/app-fileinput[1]/div/div[1]/label[1]/input")
	WebElement uploadLastMonthSalarySlip;

	// Upload salary slip of 2nd last month
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[5]/div/app-fileinput[2]/div/div[1]/label[1]/input")
	WebElement upload2ndMonthSlip;

	// Upload salary slip of 3d last month
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[5]/div/app-fileinput[3]/div/div[1]/label[1]/input")
	WebElement upload3rdMonthSlip;

	// Upload Higher Degree Marksheet
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[5]/div/app-fileinput[4]/div/div[1]/label[1]/input")
	WebElement higherDegreeMarkSheet;

	// allow us to enquire any credit evaluation company to know your credit history
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[6]/label[1]")
	WebElement allowToEnqCheckBox;

	// Please allow us to share your details with our affiliates in order to
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[6]/label[2]")
	WebElement allowToShareDetailsCheckBox;

	// Submit Btn
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[2]/div[7]/button")
	WebElement submitBtn;

	// Thank you page
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/h1[1]")
	WebElement thanksMsg;

	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/h1[2]/button")
	WebElement continueToLoginBtn;
	
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div[1]/h1")
	WebElement DocPageTitle;

	// -----------------------------------------ActionMethods---------------------------------------------------

	String docPath = "C:\\Users\\i2i funding\\Downloads\\image.png";

	public void uploadDoc(String address_type_proof, String current_address_type_proof) throws InterruptedException {
		// gm.explicitWaitUnitlElementNotVisible(uploadPanCard);
		uploadPanCard.sendKeys(docPath);
		uploadAadharCard.sendKeys(docPath);
		Select pap = new Select(selectpermanentAddressProof);
		pap.selectByVisibleText(address_type_proof);

		uploadPermanentAddressProof.sendKeys(docPath);

		Select pa = new Select(selectCurrentAddressType);
		pa.selectByVisibleText(current_address_type_proof);

		uploadCurrentAddressProofElement.sendKeys(docPath);
		ulpoad12monthBankAcStatement.sendKeys(docPath);
		Thread.sleep(2000);
		uploadLastMonthSalarySlip.sendKeys(docPath);
		upload2ndMonthSlip.sendKeys(docPath);
		upload3rdMonthSlip.sendKeys(docPath);
		higherDegreeMarkSheet.sendKeys(docPath);
		allowToEnqCheckBox.click();
		allowToShareDetailsCheckBox.click();
		Thread.sleep(2000);
		submitBtn.click();
		//gm.explicitWaitUnitlElementNotInvisible(submitBtn);
	}
	
	public String getDocPageTitle() {
		return DocPageTitle.getText();
		
	}

}
