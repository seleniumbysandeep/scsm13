package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");		
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		int count = AllLinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text1 =AllLinks.get(i).getText();
			System.out.println(text1);
		}
		driver.close();
	}		
}
