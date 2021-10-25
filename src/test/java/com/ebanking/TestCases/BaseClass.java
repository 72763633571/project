package com.ebanking.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.ebanking.Utilities.ReadConfigfile;

public class BaseClass {

	ReadConfigfile rcf = new ReadConfigfile();

	public String baseurl = rcf.getApplication();
	public String Username = rcf.getusername();
	public String password1 = rcf.getpass();
	public static WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {

		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", rcf.getchrome());
			driver = new ChromeDriver();
		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", rcf.getfire());
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	public void capturesCREENSHOT(WebDriver driver, String tname) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\Admin\\eclipse-framework1\\ebankingproject\\Screenshot" + tname + ".png");
		FileUtils.copyFile(source, target);

	}

}
