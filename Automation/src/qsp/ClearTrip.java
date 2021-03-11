package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		//open the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("FromTag")).sendKeys("Ban");
		Thread.sleep(4000); 
		List<WebElement> Alloptions = driver.findElements(By.xpath("//li[contains(@class,'list') and @role='presentation']"));
		int count = Alloptions.size();
		System.out.println(count);
		int counter=0;
		for (int i=0;i<count;i++) {
			String text = Alloptions.get(i).getText();
			System.out.println(text);
if(text.contains("Bangalore")) {
	counter=i;
}
		}
		Alloptions.get(counter).click();	
		//driver.close();
	}	
}


