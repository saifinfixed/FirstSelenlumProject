package com.facebook;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookSignUp {

	public static void main(String[] args) {
		FirefoxDriver facebook = new FirefoxDriver();
		facebook.get("http://facebook.com");
		facebook.findElementById("u_0_1").sendKeys("Saiful");
        facebook.findElementById("u_0_3").sendKeys("Azam");
        facebook.findElementById("u_0_5").sendKeys("saifinfix@gmail.com");
        
	}

}
