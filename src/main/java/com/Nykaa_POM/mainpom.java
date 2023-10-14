package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainpom {
	
	private WebDriver driver;
	
	@FindBy(xpath = "(//li[@class='MegaDropdownHeadingbox'])[5]")
	private WebElement bathBody;

//	public mainpom (WebDriver driver1) {
//		this.driver = driver1;
//		PageFactory.initElements(driver, this);
//	}
	
	
	public mainpom(WebDriver driver1) {
	    this.driver = driver1;
	    PageFactory.initElements(driver, this);
	}


	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBathBody() {
		return bathBody;
	}
}
