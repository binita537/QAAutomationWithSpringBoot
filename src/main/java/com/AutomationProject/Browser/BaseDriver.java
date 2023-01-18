package com.AutomationProject.Browser;

import org.openqa.selenium.WebDriver;

public class BaseDriver {

	protected WebDriver driver;

	public WebDriver getDriver() {
		return this.driver;
	}

	public void quit() {
		if (driver != null) {
			driver.close();
			driver.quit();

			driver = null;

		}
	}



}
