package com.Nykaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("(//li[@class='MegaDropdownHeadingbox'])[5]"));
		act.moveToElement(element).perform();

		WebElement toothpaste = driver.findElement(By.xpath("//a[text()=' Toothpaste']"));
		toothpaste.click();
		Thread.sleep(3000);
		
		Set <String> handle = driver.getWindowHandles();
		List<String> wh	= new ArrayList<>(handle);	
		driver.switchTo().window(wh.get(1)).getCurrentUrl();
		
		Thread.sleep(8000);		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,300)", "");
		
		WebElement scroll = driver.findElement(By.xpath("(//div[@class='css-ifdzs8'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		
		Thread.sleep(5000);
		WebElement product = driver.findElement(By.xpath("(//div[@class='css-ifdzs8'])[1]"));
		product.click();
		
		Thread.sleep(5000);
		Set <String> handle1 = driver.getWindowHandles();
		List<String> wh1 = new ArrayList<>(handle1);
		driver.switchTo().window(wh1.get(2)).getCurrentUrl();
		
		Thread.sleep(6000);
		
		WebElement grams = driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
		Select dropdown = new Select(grams);
		dropdown.selectByIndex(2);
		
		Thread.sleep(2000);

		WebElement addbag= driver.findElement(By.xpath("//div[@class='css-vp18r8']"));
		addbag.click();
		Thread.sleep(3000);
		
		WebElement openbag = driver.findElement(By.xpath("//button[@class='css-aesrxy']"));
		openbag.click();
		
		Thread.sleep(5000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);

		WebElement clickremove = driver.findElement(By.xpath("//div[@data-test-id='product-remove']"));
		clickremove.click();
		
		Thread.sleep(2000);
		WebElement clickyes = driver.findElement(By.xpath("//button[text()='Yes']"));
		clickyes.click();
		
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
