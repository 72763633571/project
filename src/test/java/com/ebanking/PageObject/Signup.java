package com.ebanking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	
	WebDriver driver;
	
	public Signup(WebDriver d) {
		
		driver=d;
		
		PageFactory.initElements(d,this);
		
		
	}
	
	@FindBy(xpath="//a[text()='SIGN-ON']")
	WebElement sign;
	
	@FindBy(name="userName")
	WebElement user;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(name="submit")
	WebElement sub;

	
	public void clicksign() {
		sign.click();
	}
	
	public void adduser(String use) {
		user.sendKeys(use);
	}
	
	public void addpass(String pass1) {
		pass.sendKeys(pass1);
	}
	
	public void clickonsub() {
		sub.click();
	}
}
