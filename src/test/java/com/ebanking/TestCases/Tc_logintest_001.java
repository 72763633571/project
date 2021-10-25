package com.ebanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ebanking.PageObject.LoginPage;

public class Tc_logintest_001 extends BaseClass {

	@Test
	public void login() throws Exception {
		driver.get(baseurl);
		
		LoginPage lp = new LoginPage(driver);
		lp.setuser(Username);
		lp.setpassword(password1);
		lp.clicksub();

		if (driver.getTitle().equals("Thanksyou for login")) {
			Assert.assertTrue(true);
		} else {
			capturesCREENSHOT(driver, "login");
			Assert.assertFalse(false);
		}
	}

}
