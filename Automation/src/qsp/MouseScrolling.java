package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MouseScrolling {
	static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); 
	}
	public static void main(String[] args) throws InterruptedException  {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
	driver.get("https://www.bbc.com/news");
	JavascriptExecutor j=(JavascriptExecutor) driver;
	j.executeScript("window.scrollBy(0,2000)");
	driver.close();
	}
}
