package qsp;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
				}
	public static void main(String[] args) throws InterruptedException {
		//open the chrome browser
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

driver.get("http://demo.actitime.com/");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//div[text()='Login ']")).click();

driver.findElement(By.id("logoutLink")).click();
driver.close();
	}
}
