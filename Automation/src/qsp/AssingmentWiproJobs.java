package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentWiproJobs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
       for(int i=0;i<AllLinks.size();i++) {
    	   String urls = AllLinks.get(i).getAttribute("href");
    	   System.out.println(urls);
       }
       driver.close();
	}

}
