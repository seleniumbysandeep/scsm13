package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCls {
	static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args)  {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sandeep/Desktop/link.html");
	driver.findElement(By.xpath("/html/body/a")).click();
		
	}

}
