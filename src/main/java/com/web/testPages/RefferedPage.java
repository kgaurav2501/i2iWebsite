package com.web.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.GenericMethods;

public class RefferedPage {

	WebDriver driver;

	public RefferedPage(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/app-root/div/app-refferalcode-verify/div/div/div/div/div/div[3]/label[2]")
	WebElement no;
	@FindBy(xpath = "/html/body/app-root/div/app-refferalcode-verify/div/div/div/div/div/div[3]/label[1]")
	WebElement yes;
	@FindBy(xpath = "/html/body/app-root/div/app-refferalcode-verify/div/div/div/div/div/div[4]/div/div/button")
	WebElement confirmBtn;
	@FindBy(xpath = "//*[@id=\"verifyCode\"]")
	WebElement enterReffCode;
	@FindBy(xpath = "/html/body/app-root/div/app-borrower-registration/section/div/div/div/div/div/div/app-checkeligibility/div[1]/h1")
	WebElement headerOfLoanEligiblity;

	GenericMethods gm = new GenericMethods();

	public void selectReffOpt(String opt, String reffCode) throws InterruptedException {

		if (opt.equals("No")) {
			// gm.ExplicitWait(no, driver);
			Thread.sleep(2000);
			no.click();
			Thread.sleep(2000);
			// gm.ExplicitWait(confirmBtn, driver);
			confirmBtn.click();
			confirmBtn.click();
		}

		if (opt.equals("Yes")) {
			Thread.sleep(2000);
			yes.click();
			Thread.sleep(2000);
			enterReffCode.sendKeys(reffCode);
//			gm.ExplicitWait(confirmBtn, driver);
			confirmBtn.click();

			System.out.println("Success Refferal and redirected to Page: " + headerOfLoanEligiblity.getText());
		}
	}
}