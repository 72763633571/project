package com.ebanking.Utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ReadConfigfile {

	Properties pro;

	public ReadConfigfile() {
		File src = new File("./Configuration\\Config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getApplication() {
		String url = pro.getProperty("baseurl");
		return url;
	}

	public String getusername() {
		String user = pro.getProperty("Username");
		return user;
	}

	public String getpass() {
		String pass = pro.getProperty("password1");
		return pass;
	}

	public String getchrome() {
		String chro = pro.getProperty("Chromepath");
		return chro;
	}

	public String getfire() {
		String fir = pro.getProperty("Firefoxpath");
		return fir;
	}

}
