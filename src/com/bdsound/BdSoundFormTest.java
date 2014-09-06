package com.bdsound;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BdSoundFormTest {

	public static void main(String[] args) {
		FirefoxDriver bdsound = new FirefoxDriver();
		bdsound.get("http://bd-sound.com");
		bdsound.findElementById("company").sendKeys("Multi Music Media Inc.");
		bdsound.findElementById("fname").sendKeys("Saiful");
		bdsound.findElementById("lname").sendKeys("Azam");
		bdsound.findElementById("email").sendKeys("saif0909@yahoo.com");
		bdsound.findElementById("phone").sendKeys("3474498087");
		bdsound.findElementById("city").sendKeys("Bronx");
		bdsound.findElementById("date").sendKeys("9/2/2015");
		bdsound.findElementById("duration").sendKeys("i dot know");
		bdsound.findElementById("msg").sendKeys("This is Selenium Test (QA) by Saif");
		bdsound.findElementByXPath(".//*[@id='content']/aside/form/fieldset/p[10]/button").click();
		

	}

}
