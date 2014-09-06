package com.bdhits;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BdhitsSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver selenium = new FirefoxDriver();
		selenium.get("http://bdhits.com");
		selenium.findElementById("create_account_link").click();
		selenium.findElementById("create_account_username").sendKeys("tanvir");
		selenium.findElementById("create_account_email").sendKeys("abdul.majumder@yahoo.com");
		selenium.findElementById("create_account_password").sendKeys("123456789");
		selenium.findElementById("create_account_button").click();

	}

}
