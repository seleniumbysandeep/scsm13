package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sandeep/Desktop/desktop.new/input.html");
WebElement A1 = driver.findElement(By.xpath("//input[@type='text' and @value='Qspiders']"));
String textvalue = A1.getAttribute("value");
System.out.println(textvalue);
int SL = textvalue.length();
for(int i=0;i<SL;i++) {
	A1.sendKeys(Keys.BACK_SPACE);
	Thread.sleep(500);
}
}
}
