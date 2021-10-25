package com.ebanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ebanking.PageObject.RegistorPage;

public class Tc_registor_002 extends BaseClass {

	@Test
	public void regitor() {
		
		driver.get(baseurl);
		
		RegistorPage rp=new RegistorPage(driver);
		
		rp.clickregis();
		rp.addftname("Animesh");
		rp.addlstname("Korshetti");
		rp.addphone("7276363357");
		rp.adduser("ani.korshetti");
		rp.addaddres("12 A Natraj society shelgi solapur");
		rp.addcit("Solapur");
		rp.addstat("Maharashtra");
		rp.addpsot("413002");
		rp.addcount("INDIA");
		rp.addemail("Animesh");
		rp.addpass("anikor1234");
		rp.addcnpas("anikor1234");
		rp.clicksub();
		
		
		Assert.assertTrue(true);
		
		System.out.println("Its succussful");
	}
	
	
}
