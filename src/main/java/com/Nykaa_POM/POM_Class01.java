package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class01 {

	public WebDriver driver;
	
	public POM_Class01(WebDriver driver1) {
		this.driver = driver1;
	PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//a[text()='Bath & Body'])[1]")
	private WebElement bathBody;
	
	@FindBy(xpath = "//a[text()=' Toothpaste']")
	private WebElement Toothpaste;


	public WebElement getBathBody() {
		return bathBody;
	}

	public WebElement getToothpaste() {
		return Toothpaste;
	}

	
}