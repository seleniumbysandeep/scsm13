package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToParticular {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); 
			}
			public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/news");
	WebElement e = driver.findElement(By.xpath("//h3[text()='How to be better at working from home']"));
		
	JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,\"arguments[0]. scrollIntoView(true);\")");
		
		}
}
