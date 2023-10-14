package com.Nykaa_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {

	public WebDriver driver;
	
	private POM_Class01 p1; 
	private POM_Class02 p2 ;
	private POM_Class03 p3 ;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public POM_Class01 getP1() {
		if (p1 == null) {
		p1 = new POM_Class01(driver);
		
		}		
		return p1;
	}

	public POM_Class02 getP2() {
		if (p2 == null) {
			p2 = new POM_Class02(driver);
		}
		return p2;
	}

	public POM_Class03 getP3() {
		if (p3 == null) {
			
			p3 = new POM_Class03(driver);
		}
		return p3;
	}
}
