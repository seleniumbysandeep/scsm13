package com.actitime.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generics.FileLib;
import com.actitime.generics.WebDriverCommonLib;

public class CreateCustomer {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
public static void main(String[] args) throws IOException {
			WebDriver driver=new ChromeDriver();
			FileLib f= new FileLib();
			String URL = f.getPropertyValue("url");
			String un=f.getPropertyValue("username");
			String pw=f.getPropertyValue("password");
			WebDriverCommonLib w=new WebDriverCommonLib();
			w.waitForPageToLoad(driver);
			driver.get(URL);
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			
	}

}
