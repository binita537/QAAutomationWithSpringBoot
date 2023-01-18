package com.AutomationProject.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IEInstance extends BaseDriver {

	
	public WebDriver getChromeDriverInstance() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		return driver;
	}

	public void setBrowserProperties()
	{

		//In future if you want to set any chrome driver related properties ,you can add here

	}

}
