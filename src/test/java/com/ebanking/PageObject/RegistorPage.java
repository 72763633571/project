package com.ebanking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistorPage {

	WebDriver driver;

	public RegistorPage(WebDriver d) {

		driver = d;

		PageFactory.initElements(d, this);

	}

	@FindBy(xpath = "//a[text()='REGISTER']")
	WebElement regis;

	@FindBy(name = "firstName")
	WebElement fstname;

	@FindBy(name = "lastName")
	WebElement lstname;

	@FindBy(name = "phone")
	WebElement phne;

	@FindBy(how = How.NAME, using = "userName")
	WebElement user;

	@FindBy(name = "address1")
	WebElement addres;

	@FindBy(name = "city")
	WebElement cit;

	@FindBy(name = "state")
	WebElement st;

	@FindBy(name = "postalCode")
	WebElement post;

	@FindBy(name = "country")
	WebElement count;

	@FindBy(name = "email")
	WebElement email1;

	@FindBy(name = "password")
	WebElement pass;

	@FindBy(name = "confirmPassword")
	WebElement conpass;

	@FindBy(name = "submit")
	WebElement sub;

	public void clickregis() {
		regis.click();
	}

	public void addftname(String first) {
		fstname.sendKeys(first);
	}

	public void addlstname(String last) {
		lstname.sendKeys(last);
	}

	public void addphone(String phn) {
		phne.sendKeys(phn);
	}

	public void adduser(String usr) {
		user.sendKeys(usr);
	}

	public void addaddres(String ad) {
		addres.sendKeys(ad);
	}

	public void addcit(String ct) {
		cit.sendKeys(ct);
	}

	public void addstat(String st1) {
		st.sendKeys(st1);
	}

	public void addpsot(String pos) {
		post.sendKeys(pos);
	}

	public void addcount(String cou) {

		Select sel = new Select(count);
		sel.selectByVisibleText(cou);

	}

	public void addemail(String ema) {
		email1.sendKeys(ema);

	}

	public void addpass(String pas) {
		pass.sendKeys(pas);
	}

	public void addcnpas(String conpas) {
		conpass.sendKeys(conpas);
	}

	public void clicksub() {
		sub.click();
	}
}
