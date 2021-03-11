package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {
	static {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); 
			 }
		 public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
			driver.get("https://admin@the-internet.herokuapp.com/basic_auth");
			

		 }
}
