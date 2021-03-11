package com.actitime.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generics.FileLib;
import com.actitime.generics.WebDriverCommonLib;
/**
 * valid login
 * @author sandeep
 *
 */
public class ValidLogin {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
public static void main(String[] args) throws IOException {
			FileLib f=new FileLib();
			WebDriverCommonLib w=new WebDriverCommonLib();
			WebDriver driver=new ChromeDriver();
		    w.waitForPageToLoad(driver);
			driver.get(f.getPropertyValue("url"));
			driver.findElement(By.id("username")).sendKeys(f.getPropertyValue("username"));
			driver.findElement(By.name("pwd")).sendKeys(f.getPropertyValue("password"));
			driver.findElement(By.xpath("//div[.='Login ']")).click();
		String CustomerName = f.getExcelValue("CreateCustomer", 1, 2);
		driver.findElement(By.id("createTasksPopup_stomer")).sendKeys(CustomerName);
		f.setExcelValue("CreateCustomer", 1, 4, "pass");
			}
}
