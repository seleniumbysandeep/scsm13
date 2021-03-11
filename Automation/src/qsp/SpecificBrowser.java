package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("http://popuptest.com/popuptest1.html");
		String ExpectedURL="popup6";
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String ActualURL = driver.getCurrentUrl();
			if(ActualURL.contains(ExpectedURL)) {
				driver.close();
				
			}
		}
		}
}
