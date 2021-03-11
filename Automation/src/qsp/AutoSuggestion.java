package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
		}
	public static void main(String[] args) throws InterruptedException {
//open the chrome browser
WebDriver driver=new ChromeDriver();
//go to google.com
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("java");
Thread.sleep(2000);
List<WebElement> AllAutoSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	int count=AllAutoSugg.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String text = AllAutoSugg.get(i).getText();
		System.out.println(text);
	}
AllAutoSugg.get(0).click();	
driver.close();
	}
	}
