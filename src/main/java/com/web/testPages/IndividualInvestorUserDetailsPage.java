package com.web.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndividualInvestorUserDetailsPage {
WebDriver driver;

public IndividualInvestorUserDetailsPage(WebDriver driver){
	this.driver=driver;
}
	By title = By.xpath("");
	By firstName = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[1]/app-nameinput/div/div[2]/div[1]/input");
	By middleName = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[1]/app-nameinput/div/div[2]/div[2]/input");
	By lastName = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[1]/app-nameinput/div/div[2]/div[3]/input");
	By single = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/div[1]/label[1]");
	By married = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/div[1]/label[2]/span[2]");
	By dob = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/my-date-picker/div/div/input");
	By address = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/app-addressinput/div/div[1]/input");
	By pin = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/app-addressinput/div/div[2]/input");
	By city = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/app-addressinput/div/div[3]/input");
	By state = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/app-addressinput/div/div[4]/input");
	By save = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[3]/button[1]");
	By next = By.xpath("/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[3]/button[2]");
	
	public void enterFirstName(String first_name) {
		driver.findElement(firstName).sendKeys(first_name);
	}
	
	public void enterMiddleName(String middle_name) {
		driver.findElement(middleName).sendKeys(middle_name);
	}
	public void enterLastName(String last_name) {
		driver.findElement(lastName).sendKeys(last_name);
	}
	public void clickOnSingle() {
		driver.findElement(single).click();
	}
	
	public void enterdob() throws InterruptedException {
//		Select select = new Select(driver.findElement(dob));
//		select.selectByValue(enter_dob);
		Thread.sleep(2000);
		driver.findElement(dob).click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/my-date-picker/div/div[2]/table[1]/tbody/tr/td[3]/div/div[2]/button"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/my-date-picker/div/div[2]/table[2]/tbody/tr[1]/td/button"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/my-date-picker/div/div[2]/table[2]/tbody/tr[2]/td[1]/div"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]/my-date-picker/div/div[2]/table[2]/tbody/tr[3]/td[5]/div/span"))
				.click();

	}
	
	public void enterAddress(String enter_address) {
		driver.findElement(address).sendKeys(enter_address);
	}
	
	public void enterpin(String enter_pin) {
		driver.findElement(pin).sendKeys(enter_pin);
	}
	
	public void clickOnNext() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(next).click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
