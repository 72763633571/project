package com.ebanking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}

	@FindBy(how = How.NAME, using = "userName")
	WebElement Username;

	@FindBy(how = How.NAME, using = "password")
	WebElement pass;

	@FindBy(how = How.NAME, using = "submit")
	WebElement sub;

	public void setuser(String use) {
		Username.sendKeys(use);

	}

	public void setpassword(String pass1) {
		pass.sendKeys(pass1);
	}

	public void clicksub() {
		sub.click();
	}
}
