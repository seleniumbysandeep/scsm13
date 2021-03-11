package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTab {
	static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); 
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> alltabs = driver.getWindowHandles();
		int count = alltabs.size();
		System.out.println(count);
		Iterator<String> it=alltabs.iterator();
		String parentwh = it.next();
		String childwh = it.next();
		driver.close();
		driver.switchTo().window(childwh);
		driver.close();
		
	}
}
