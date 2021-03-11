package com.actitime.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.generics.FileLib;

public class Assignment {
	static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@Test 
public void testAssignment() throws IOException, InterruptedException
{
	FileLib f=new FileLib();
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get(f.getPropertyValue("url"));
driver.findElement(By.id("username")).sendKeys(f.getPropertyValue("username"));
driver.findElement(By.name("pwd")).sendKeys(f.getPropertyValue("password"));
driver.findElement(By.xpath("//div[.='Login ']")).click();
driver.findElement(By.xpath("//span[.='New']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//div[@class='comboboxButton']/div[@class='dropdownButton'])[1]")).click();
driver.findElement(By.xpath("//div[.='- New Customer -']")).click();
driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name']")).sendKeys(f.getExcelValue("CreateCustomer",1,2));
driver.findElement(By.xpath("//input[@placeholder='Enter Project Name']")).sendKeys(f.getExcelValue("CreateCustomer", 1, 3));
driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys(f.getExcelValue("CreateCustomer",1,4));

}
}
