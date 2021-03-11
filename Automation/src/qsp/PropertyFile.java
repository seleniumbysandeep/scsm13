package qsp;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.actitime.generics.FileLib;

public class PropertyFile {
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws IOException {
FileLib f=new FileLib();
WebDriver driver=new ChromeDriver();
driver.get(f.getPropertyValue("url"));
driver.findElement(By.id("username")).sendKeys(f.getPropertyValue("username"));
driver.findElement(By.name("pwd")).sendKeys(f.getPropertyValue("password"));
driver.findElement(By.xpath("//div[.='Login ']")).click();
driver.close();
	}

}
