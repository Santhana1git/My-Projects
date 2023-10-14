package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class02 {

	static WebDriver driver;

	@FindBy(xpath = "(//div[@class='css-ifdzs8'])[1]")
	private WebElement scroll;
	
	@FindBy(xpath = "(//div[@class='css-ifdzs8'])[1]")
	private WebElement product;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getScroll() {
		return scroll;
	}

	public WebElement getProduct() {
		return product;
	}

	public POM_Class02(WebDriver driver3) {
//		this.driver = driver3;
		PageFactory.initElements(driver, this);
	}

}
