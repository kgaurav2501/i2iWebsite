package com.web.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class IndividualInvestorEmploymentDetailsPage {
	WebDriver driver;

	public IndividualInvestorEmploymentDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	By tilteOfEmpDetails = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[1]/h1");
	By empType = By
			.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[1]/select");
	By grossIncome = By
			.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/input");
	By saveBtn = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[2]/button[1]");
	By nextBtn = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[2]/button[2]");

	public String getTitle() {
		return driver.findElement(tilteOfEmpDetails).getText();
	}

	public void selectEmpType(String employeeType) {
		Select select = new Select(driver.findElement(empType));
		select.selectByVisibleText(employeeType);
	}

	public void enterAnnualIncome(String grossAnnualIncome) {
		driver.findElement(grossIncome).sendKeys(grossAnnualIncome);
	}

	public void clickOnNext() {
		driver.findElement(nextBtn).click();
	}

}
