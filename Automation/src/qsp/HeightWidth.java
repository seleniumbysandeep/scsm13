package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HeightWidth {
	static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
				}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
Dimension UN = driver.findElement(By.id("username")).getSize();
int HeightUN = UN.getHeight();
int WidhtUN = UN.getWidth();
Dimension PW = driver.findElement(By.name("pwd")).getSize();
int HeightPW = PW.getHeight();
int WidhtPW = PW.getWidth();
if(HeightUN==HeightPW && WidhtUN==WidhtPW ) {
	System.out.println("pass since height and width are equal"+HeightPW);
}
else {
	System.out.println("fail since height and width are not equal"+WidhtPW);
}
driver.close();
	}
	@Test
	public void testdemo()
	{
		
	}
}
