package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * this is the generic class for webdriver
 * @author sandeep
 *
 */
public class WebDriverCommonLib {
	/**
	 * implicit wait for page to load in gui
	 * @param driver
	 */
	public void waitForPageToLoad(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/**
	 * Explicit wait for element present in gui
	 * @param driver
	 * @param element
	 */	
public void waitForElement(WebDriver driver,WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(element));
}
/**
 * customwait for element present in gui
 * @param element
 * @throws InterruptedException
 */
public void customWaitForElement(WebElement element) throws InterruptedException {
	int count=0;
	while(count<=20) {
		try {
			element.isEnabled();
			break;
		}
		catch(Exception e) {
			Thread.sleep(1000);
			count++;
		}
	}
}
/**
 * select the value from the listbox based on text
 * @param element
 * @param text
 */
public void select(WebElement element,String text) {
	Select s=new Select(element);
	s.selectByVisibleText(text);
}
/**
 * select the value from the listbox based on index
 * @param element
 * @param index
 */
public void select(WebElement element,int index) {
	Select s=new Select(element);
	s.selectByIndex(index);
}
}
