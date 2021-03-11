package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample {
	static {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 }
		 public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.vtiger.com/");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement Resources=driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		  Actions a= new Actions(driver);
		  a.moveToElement(Resources).perform();
		  driver.findElement(By.xpath("//h6[contains(text(),'Customers')]")).click();
		  driver.findElement(By.xpath("//a[.='Agree']")).click();
		  Thread.sleep(9000);
		  WebElement dblclick=driver.findElement(By.xpath("//button[.='READ FULL STORY']"));
		  a.doubleClick(dblclick).perform();
		  
		  String str=driver.getCurrentUrl();
		  if(str.contains("hackerearth")) {
		   System.out.println("Double clicked successfully");
		   
		  }else {
		   System.out.println("Not clicked successfully");
		  }
		  
		 }

		}

