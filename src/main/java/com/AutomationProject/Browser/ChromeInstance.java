package com.AutomationProject.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeInstance extends BaseDriver {

	public WebDriver getChromeDriverInstance() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	
	//In future if you want to set any chrome driver related properties ,you can add here 

}
