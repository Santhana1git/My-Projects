package com.runner;

import org.openqa.selenium.WebDriver;

import com.NykaaHelper.ConfigReader;
import com.Nykaa_Baseclass.Baseclass;
import com.Nykaa_POM.PageObjectManager;


public class TestRunner extends Baseclass{

	public static WebDriver driver;
	static PageObjectManager pm = new PageObjectManager(driver);
	
	public static void main(String[] args) throws Exception {
				
		ConfigReader cr = new ConfigReader();
		
		BrowserLaunch(cr.getbrowser());
		Launch_url(cr.geturl());
		Thread.sleep(8000);
		
		mousehover(pm.getP1().getBathBody());
		click(pm.getP1().getToothpaste());
		Thread.sleep(6000);
		
		Window_Handle(1);
		scrolldown(pm.getP2().getScroll());
		click(pm.getP2().getProduct());
		

//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
//		click(element);
//		pom.getSignin().click();
//		click(pom.getSignin());
	}
}
