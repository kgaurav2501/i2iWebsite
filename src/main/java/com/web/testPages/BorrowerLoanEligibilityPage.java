package com.web.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.util.GenericMethods;

public class BorrowerLoanEligibilityPage {
	WebDriver driver;

	public BorrowerLoanEligibilityPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ------------------------------------------------------PAGE------------------------------------------------------

	// Loan Amount
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[2]/div[1]/div[1]/input")
	WebElement loan_amount;
	// Tenure of Load Dropdown
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[2]/div[1]/div[2]/select")
	WebElement tenure_of_loan;
	// Purpose Dropdown
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[2]/div[1]/div[3]/select")
	WebElement purpose;
	// Description text field
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[2]/div[2]/div/textarea")
	WebElement Description;
	// Single Radio button
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[4]/div[1]/label[1]")
	WebElement singleRadiobtn;
	// Married Radio button
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[4]/div[1]/label[2]")
	WebElement marriedRadioBtn;
	// Date of Bitrh
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[4]/div[2]/my-date-picker/div/div/input")
	WebElement dateOfBirth;
	// Pin Code
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[4]/div[3]/input")
	WebElement pinCode;
	// City
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[4]/div[4]/input")
	WebElement city;
	// Employee Type
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[6]/div/select")
	WebElement employeeType;
	// Company Name
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[7]/div/div[1]/input")
	WebElement companyName;
	// Monthly Salary
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[7]/div/div[2]/input")
	WebElement monthlySalary;
	// Salary Mode
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[7]/div/div[3]/select")
	WebElement salaryMode;
	// Joining Date of current company
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[7]/div/div[4]/my-date-picker/div/div/input")
	WebElement joiningDateOfCurrentCompany;
	// Total Exprience Year
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[7]/div/div[5]/div[2]/input[1]")
	WebElement totalExpYear;
	// Total Exprience month
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[7]/div/div[5]/div[2]/input[2]")
	WebElement totalExpMonth;
	// Residence type
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[9]/div[1]/div/select")
	WebElement residenceType;
	// Any Other monthly income
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[9]/div[2]/div/input")
	WebElement anyOtherMonthlyIncome;
	// Do you have any loan running YES option
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[9]/div[3]/div/label[1]/span[2]")
	WebElement runingLoanYesOpt;
	// Do you have any loan running NO option
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[9]/div[3]/div/label[2]/span[2]")
	WebElement runingLoanNoOpt;
	// Do you have any creadit card YES option
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[9]/div[4]/div/label[1]/span[2]")
	WebElement creaditYesOPtion;
	// Do you have any creadit card NO option
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[9]/div[4]/div/label[2]/span[2]")
	WebElement creaditNoOPtion;
	// Any written-off or settlement in any loan in last 12 months

	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[9]/div[6]/div[1]/label[1]/span[2]")
	WebElement settlementYes;

	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[9]/div[6]/div[1]/label[2]/span[2]")
	WebElement settlementNo;

	// Any unpaid EMIs in last 3 months
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[9]/div[6]/div[2]/label[1]/span[2]")
	WebElement unpaidEmiYesOPtion;

	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[9]/div[6]/div[2]/label[2]/span[2]")
	WebElement unpaidEmiNoOPtion;

	// CIBIL score text field
	@FindBy(xpath = "//input[@class='form-control ng-pristine ng-valid form-control-danger form-control-success form-control-warning ng-touched']")
	WebElement cibil;

	// Check Eligibility button
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[10]/button/span")
	WebElement checkEligibilityBtn;

	// Congratulation message
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/div/div[2]/div/div[1]/h3")
	WebElement congratulationMsg;

	// Proceed Btn
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/div/div[2]/div/div[2]/div[2]/button")
	WebElement proceedBtn;
	// Enter Coupon Code txt field
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/div[2]/div[1]/div[2]/input")
	WebElement enterCoupanCode;

	// Apply Now btn
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/div[2]/div[1]/div[2]/button")
	WebElement applyNowBtn;

	// Pay Now Btn
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/div[3]/button/span")
	WebElement payNowBtn;

	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/div[3]/button/span")
	WebElement submitBtn;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/div/div[1]/h1")
	WebElement eligibilityStatus;
	// ------------------------------------------------------ActionMethods------------------------------------------------------
	GenericMethods gm = new GenericMethods();

	// Enter Load Details.
	public void enterloanDetails(String loanAmount, String tenure_loan, String loan_purpose, String desc)
			throws InterruptedException {
		Thread.sleep(2000);
		loan_amount.sendKeys(loanAmount);
		tenure_of_loan.click();
		Select select = new Select(tenure_of_loan);
		select.selectByVisibleText(tenure_loan);
		purpose.click();
		Select s = new Select(purpose);
		s.selectByVisibleText(loan_purpose);
		Description.sendKeys(desc);
	}

	// Enter personal details.
	public void enetrPersonalDetails(String marital_status, String pin_Code) {
		if (marital_status.equals("Single")) {
			singleRadiobtn.click();
		}
		if (marital_status.equals("Married")) {
			marriedRadioBtn.click();
		}
		dateOfBirth.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[4]/div[2]/my-date-picker/div/div[2]/table[1]/tbody/tr/td[3]/div/div[2]/button"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[4]/div[2]/my-date-picker/div/div[2]/table[2]/tbody/tr[1]/td/button"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[4]/div[2]/my-date-picker/div/div[2]/table[2]/tbody/tr[2]/td[1]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[4]/div[2]/my-date-picker/div/div[2]/table[2]/tbody/tr[2]/td[2]"))
				.click();
		pinCode.sendKeys(pin_Code);

	}

	// Employment Details.
	public void employmentDetailsSalaried(String company_name, String monthly_Sal, String salary_mode,
			String total_exp_in_year, String total_exp_in_month) {
		employeeType.click();
		Select ss = new Select(employeeType);
		ss.selectByVisibleText("Salaried");
		companyName.sendKeys(company_name);
		monthlySalary.sendKeys(monthly_Sal);
		Select s = new Select(salaryMode);
		s.selectByVisibleText(salary_mode);
		joiningDateOfCurrentCompany.click();
		// Click on year
		driver.findElement(By.xpath(
				"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[7]/div/div[4]/my-date-picker/div/div[2]/table[1]/tbody/tr/td[3]/div/div[2]/button"))
				.click();
		// click on scroll btn
		driver.findElement(By.xpath(
				"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[7]/div/div[4]/my-date-picker/div/div[2]/table[2]/tbody/tr[6]/td[4]/div"))
				.click();
		// select year 2017
		driver.findElement(By.xpath(
				"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[7]/div/div[4]/my-date-picker/div/div[2]/table[2]/tbody/tr[2]/td[1]/div"))
				.click();
		// select date
		driver.findElement(By.xpath(
				"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[7]/div/div[4]/my-date-picker/div/div[2]/table[2]/tbody/tr[3]/td[2]/div/span"))
				.click();
		totalExpMonth.sendKeys(total_exp_in_month);
		totalExpYear.sendKeys(total_exp_in_year);
	}

	public void enterCity(String cityName) {
		city.sendKeys(cityName);
	}

	public void selectEmpType(String emp_type) {
		Select s = new Select(employeeType);
		s.selectByVisibleText(emp_type);
		employeeType.click();
	}

	public void enterCompanyName(String company_name) {
		companyName.sendKeys(company_name);
	}

	public void enterMonthlySalary(String monthly_salary) {
		monthlySalary.sendKeys(monthly_salary);

	}

	public void selectSalaryMode() {
		salaryMode.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[7]/div/div[3]/select/option[4]"))
				.click();
	}

	public void joiningDateInCurrentCompany() {
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].setAttribute('value','current_company_doj');", joiningDateOfCurrentCompany));
		joiningDateOfCurrentCompany.click();
		// Click on year
		driver.findElement(By.xpath(
				"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[7]/div/div[4]/my-date-picker/div/div[2]/table[1]/tbody/tr/td[3]/div/div[2]/button"))
				.click();
		// click on scroll btn
		driver.findElement(By.xpath(
				"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[7]/div/div[4]/my-date-picker/div/div[2]/table[2]/tbody/tr[6]/td[4]/div"))
				.click();
		// select year 2017
		driver.findElement(By.xpath(
				"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[7]/div/div[4]/my-date-picker/div/div[2]/table[2]/tbody/tr[2]/td[1]/div"))
				.click();
		// select date
		driver.findElement(By.xpath(
				"/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[2]/div[7]/div/div[4]/my-date-picker/div/div[2]/table[2]/tbody/tr[3]/td[2]/div/span"))
				.click();
	}

	public void enterTotalExpInYear(String total_exp_year) {
		totalExpYear.sendKeys(total_exp_year);
	}

	public void enterTotalExpInMonth(String total_exp_month) {
		totalExpMonth.sendKeys(total_exp_month);
	}

	public void enterFinancialDetails(String residence_type, String other_monthly_income, String any_loan_running,
			String creadit_card) {
		Select r = new Select(residenceType);
		r.selectByVisibleText(residence_type);
		anyOtherMonthlyIncome.sendKeys(other_monthly_income);
		if (any_loan_running.equals("Yes")) {
			runingLoanYesOpt.click();
		}
		if (any_loan_running.equals("No")) {
			runingLoanNoOpt.click();
		}

		if (creadit_card.equals("Yes")) {
			creaditYesOPtion.click();
		}
		if (creadit_card.equals("No")) {
			creaditNoOPtion.click();
		}
	}

	// Financial Details
	public void pastCIBILDetails(String settelment_Yes_No, String unpaid_Emi_Yes_No, String CIBIL)
			throws InterruptedException {
		if (settelment_Yes_No.equals("Yes")) {
			settlementYes.click();
		}

		if (settelment_Yes_No.equals("No")) {
			settlementNo.click();
		}

		if (unpaid_Emi_Yes_No.equals("Yes")) {
			unpaidEmiYesOPtion.click();
		}

		if (unpaid_Emi_Yes_No.equals("No")) {
			unpaidEmiNoOPtion.click();
		}

		gm.scroll(driver);
		Thread.sleep(2000);
//		cibil.sendKeys(CIBIL);
		checkEligibilityBtn.click();
		gm.ExplicitWaitVisible(eligibilityStatus, driver);
		System.out.println("Success Loan Eligiblity redirect to: " + eligibilityStatus.getText());
	}

}
