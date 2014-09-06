package com.bdhits;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BdhitsPlay {

	public static void main(String[] args) {
		FirefoxDriver bdmain = new FirefoxDriver();
		bdmain.get("http://bdhits.com");
		bdmain.findElementByLinkText("Tarkata").click();
		bdmain.findElementByLinkText("Play All").click();
	}

}
