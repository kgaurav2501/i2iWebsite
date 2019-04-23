package com.web.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class IndividualInvestorKYCDocumentsPage {
	//WebDriver driver;

	public IndividualInvestorKYCDocumentsPage(WebDriver driver) {
	//	this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[1]/div/input")
    WebElement panCard;
	@FindBy(xpath="/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/app-fileinput[1]/div/div[1]/label[1]/input")
    WebElement uploadPan;
	@FindBy(xpath="/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/div[2]/div/select")
    WebElement selectTypePerAddProof;
	@FindBy(xpath="/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[1]/app-fileinput[2]/div/div[1]/label[1]/input")
    WebElement uploadPerAddProof;
	@FindBy(xpath="/html/body/app-root/div/ng-component/section/div/div/div/div/div/div[2]/div[2]/button[3]")
    WebElement nextBtn;
	
	public void kycDoc(String type_of_permanent_add) throws InterruptedException {
		
		uploadPan.sendKeys("C:\\Users\\i2i funding\\Downloads\\image.png");
		Select select = new Select(selectTypePerAddProof);
		select.selectByVisibleText("Driving Licence");
		uploadPerAddProof.sendKeys("C:\\Users\\i2i funding\\Downloads\\image.png");
		Thread.sleep(2000);
		nextBtn.click();
		
	}
	




}
