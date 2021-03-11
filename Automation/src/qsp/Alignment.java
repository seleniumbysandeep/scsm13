package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alignment {
	static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
				}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://demo.actitime.com/");
  int X1 = driver.findElement(By.id("username")).getLocation().getX();
int X2=driver.findElement(By.name("pwd")).getLocation().getX();
if(X1==X2) {
	System.out.println("pass");
}
else {
	System.out.println("fail");
}
//driver.close();
	}
	
	}
