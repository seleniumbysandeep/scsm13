package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextCls {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/");
		String Text = driver.findElement(By.id("licenseLink")).getText();
		System.out.println(Text);
		driver.close();
	}
}
