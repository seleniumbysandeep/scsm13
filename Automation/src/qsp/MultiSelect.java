package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
			}
public static void main(String[] args) throws InterruptedException {
				//open the chrome browser
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sandeep/Desktop/Hotel.html");
WebElement MTRListBox = driver.findElement(By.id("mtr"));
HashSet<String>  allText=new HashSet<String>();
Select s=new Select(MTRListBox);
List<WebElement> Alloptions = s.getOptions();
int count = Alloptions.size();
for(int i=0;i<count;i++) {
	WebElement option = Alloptions.get(i);
	String text = option.getText();
	if(allText.add(text)==false) {
		System.out.println(text);
	}
}
driver.close();
}
}
