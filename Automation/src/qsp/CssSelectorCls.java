package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
WebElement ActiText = driver.findElement(By.id("loginButton"));
String size = ActiText.getCssValue("font-size");
System.out.println(size);
String color = ActiText.getCssValue("color");
String font = ActiText.getCssValue("font-family");
System.out.println(color);
System.out.println(font);
driver.close();

}
}
