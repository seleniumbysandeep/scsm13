package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExe {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); 
	}
	public static void main(String[] args) throws InterruptedException  {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sandeep/Desktop/disabled.html");
	driver.findElement(By.id("t1")).sendKeys("admin");
	driver.findElement(By.id("t2")).sendKeys("admin");
	JavascriptExecutor j= (JavascriptExecutor) driver;
	j.executeScript("document.getElementById('t2').value='manager'");
	driver.close();
	}
}
