package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class03 {

	static WebDriver driver;

	@FindBy(xpath = "//select[@class='css-2t5nwu']")
	private WebElement grams;
	
	@FindBy(xpath = "//div[@class='css-vp18r8']")
	private WebElement addbag;
	
	@FindBy(xpath = "//button[@class='css-aesrxy']")
	private WebElement openbag;
	
	@FindBy(xpath = "//iframe[@class='css-acpm4k']")
	private WebElement frame;
	
	@FindBy(xpath = "//div[@data-test-id='product-remove']")
	private WebElement remove;
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yes;

	public POM_Class03(WebDriver driver4) {
//		this.driver = driver4;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getGrams() {
		return grams;
	}

	public WebElement getAddbag() {
		return addbag;
	}

	public WebElement getOpenbag() {
		return openbag;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getRemove() {
		return remove;
	}

	public WebElement getYes() {
		return yes;
	}

}
