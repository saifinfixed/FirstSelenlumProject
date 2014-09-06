package com.bdhits;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BdhitsUserSetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver setting = new FirefoxDriver();
		setting.get("http://bdhits.com");
		setting.findElementById("sign_in_link").click();
		setting.findElementById("sign_in_username").sendKeys("lipe");
		setting.findElementById("sign_in_password").sendKeys("123456789");
		setting.findElementById("sign_in_button").click();
		setting.findElementById("top_right_dropdown").click();

	}

}
