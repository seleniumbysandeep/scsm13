package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
		}

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.findElement(By.name("q")).sendKeys("qspiders");
		  Thread.sleep(2000);
		  List<WebElement> AllAutoSugg = driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
		  int count=AllAutoSugg.size();
		  int found=0;
		  for(int i=0;i<count;i++) {
		   String text = AllAutoSugg.get(i).getText();
		  System.out.println(text);
		   if (text.equals("qspiders"))
		   {
			 found++; 
		   }
		  }
		  if(found==0) {
			  System.out.println("fail");
		  }
		  else
		  {
			System.out.println("pass");  
		  }
		  driver.close();
		 }		
}
