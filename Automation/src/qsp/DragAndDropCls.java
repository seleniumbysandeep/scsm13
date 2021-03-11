package qsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropCls {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); 
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement source = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement destination = driver.findElement(By.xpath("//h1[.='Block 4']"));
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.dragAndDrop(source, destination).perform();
		Thread.sleep(3000);
		driver.close();
	}
}