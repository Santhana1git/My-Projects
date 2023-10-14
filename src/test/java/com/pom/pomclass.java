package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Nykaa_Baseclass.Baseclass;

public class pomclass extends Baseclass {
	
//	private static WebDriver driver;
	
		@FindBy(xpath = "//button[text()='Sign in']") private WebElement signin;
	
	public WebElement getSignin() {
		return signin;
	}

	public pomclass(WebDriver driver1) {
//	    this.driver = driver1;
	    PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

}
