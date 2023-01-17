
package com.AutomationProject.Browser;

import org.openqa.selenium.WebDriver;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DriverFactory {

	WebDriver driver;
	BaseDriver baseDriver;

	public BaseDriver getWebDriver(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			baseDriver = new ChromeInstance();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			baseDriver = new FirefoxInstance();
		} else if (browsername.equalsIgnoreCase("ie")) {
			baseDriver = new IEInstance();
		}

		return baseDriver;

	}

}
