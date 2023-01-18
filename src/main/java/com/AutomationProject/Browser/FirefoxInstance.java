package com.AutomationProject.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FirefoxInstance extends BaseDriver {
	
	public WebDriver getChromeDriverInstance() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		return driver;
	}


	public void setBrowserProperties()
	{
		//In future if you want to set any chrome driver related properties ,you can add here
	}
}
