package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.pom.LoginPage;

public class MainMethodCls {
	 static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 }
	@Test
	public void testValidLogin() {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.actitime.com/");
		 LoginPage l=new LoginPage();
		 PageFactory.initElements(driver, l);
		l.setLogin("admin", "manager");
	}
}
