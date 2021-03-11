package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup {
      static {
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 }
		 public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.services.irctc.co.in/homebody.html");
		  driver.findElement(By.id("details-button")).click();
		  driver.findElement(By.id("proceed-link")).click();
		  driver.findElement(By.id("button")).click();
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.alertIsPresent());
		  Alert a = driver.switchTo().alert();
		  String text=a.getText();
		  Thread.sleep(3000);
		  //a.accept();
		  a.dismiss();
		  System.out.println(text);
		  Thread.sleep(3000);
		  driver.close();
		 }
		}


