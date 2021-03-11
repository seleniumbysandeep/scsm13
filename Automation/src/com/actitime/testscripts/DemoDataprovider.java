package com.actitime.testscripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataprovider {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@DataProvider
public Object getInvalidLogin() {
	Object[][] obj=new Object[2][2];
	obj[0][0]="admin1";
	obj[0][1]="manager1";
	obj[1][0]="admin2";
	obj[1][1]="manager2";
	return obj;	
}

@Test(dataProvider="getInvalidLogin")
public void testInvalidLogin(String un,String pw) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.actitime.com/");
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pw);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Thread.sleep(3000);
	driver.close();
}
}
