package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHouver {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); 
	}
	    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement Resources = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		Actions a=new Actions(driver);
		a.moveToElement(Resources).perform();
		driver.findElement(By.xpath("//h6[contains(text(),'Contact')]")).click();
		String PhoneNumber = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
		System.out.println("Bangalore PhoneNumber = "+PhoneNumber);
		driver.close();
	}
}
