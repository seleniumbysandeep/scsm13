package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomeWait {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		//open the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		int i=0;
		while(i<1000) 
		{
			try {	
				driver.findElement(By.id("logoutLink")).click();
				break;
			}
			catch(Exception e) {

			}
		}
		driver.close();
	}
}

