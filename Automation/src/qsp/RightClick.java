package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException  {

		WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
WebElement ActitimeLink = driver.findElement(By.linkText("actiTIME Inc."));

Actions a=new Actions(driver);

a.contextClick(ActitimeLink).perform();
Thread.sleep(2000);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_W);
driver.quit();
	}

}
