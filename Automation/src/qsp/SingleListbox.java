package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SingleListbox {
	static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
					}
	public static void main(String[] args) throws InterruptedException {
			//open the chrome browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	 WebElement DayListBox = driver.findElement(By.id("day"));
	 Select s=new Select(DayListBox);
	s.selectByIndex(7);
	


	}
}
