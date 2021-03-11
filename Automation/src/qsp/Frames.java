package qsp;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); 
	}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sandeep/Desktop/page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("d2")).sendKeys("J");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("d1")).sendKeys("Q");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("d2")).sendKeys("S");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("d1")).sendKeys("S");
		WebElement e = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(e);
		driver.findElement(By.id("d2")).sendKeys("P");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("d1")).sendKeys("P");
	}		
}
