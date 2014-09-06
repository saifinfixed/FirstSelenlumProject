package com.bdhits;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BdhitsLogin {

	public static void main(String[] args) {
		FirefoxDriver login = new FirefoxDriver();
		login.get("http://bdhits.com");
		login.findElementById("sign_in_link").click();
		login.findElementById("sign_in_username").sendKeys("lipe");
		login.findElementById("sign_in_password").sendKeys("123456789");
		login.findElementById("sign_in_button").click();

	}

}
