package com.AutomationProject.Browser;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeInstance extends BaseDriver {

	public WebDriver getChromeDriverInstance() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	public void setBrowserProperties()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("version", "77.0");
		capabilities.setCapability("platform", "win10"); // If this cap isn't specified, it will just get any available one
		capabilities.setCapability("build", "LambdaTestSampleApp");
		capabilities.setCapability("name", "LambdaTestJavaSample");
		capabilities.setCapability("network", true); // To enable network logs
		capabilities.setCapability("visual", true); // To enable step by step screenshot
		capabilities.setCapability("video", true); // To enable video recording
		capabilities.setCapability("console", true); // To capture console logs

		capabilities.setCapability("selenium_version","4.0.0-alpha-2");
		capabilities.setCapability("timezone","UTC+05:30");
		capabilities.setCapability("geoLocation","IN");
		capabilities.setCapability("chrome.driver","78.0");
	}


}
