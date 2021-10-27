package com.ebanking.TestCases;

import org.testng.annotations.Test;

import com.ebanking.PageObject.Signup;

public class Testcase_003 extends BaseClass{
	
	@Test
	public void signup() {
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		Signup sp=new Signup(driver);
		sp.clicksign();
		sp.adduser("an.korshetti@gmail.com");
		sp.addpass("anikor");
		sp.clickonsub();
		
	}

}
