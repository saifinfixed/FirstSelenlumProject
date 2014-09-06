package com.selenium.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MyfirstSeleniumTest {

	public static void main(String[] args) {
		// Demo Testing 
		FirefoxDriver selenium = new FirefoxDriver();
		selenium.get("http://www.adleads.com");
		
		selenium.findElementByLinkText("Sign Up").click();
		selenium.findElementById("first_name").sendKeys("Saiful");
		selenium.findElementById("last_name").sendKeys("Azam");
		selenium.findElementById("company").sendKeys("djsaifny");
		selenium.findElementById("email").sendKeys("test@yahoo.com");
		selenium.findElementById("phone").sendKeys("2223334444");
		selenium.findElementById("country").sendKeys("Bangladesh");
		selenium.findElementById("companyUrl").sendKeys("http://www.mysite.com");
		selenium.findElementById("acceptpolicy").click();
		//selenium.findElementByXPath(".//*[@id='signup_form']/fieldset/div[3]/div[9]/button").click();
		selenium.findElementById("signup_form").submit();
		

	}

}
