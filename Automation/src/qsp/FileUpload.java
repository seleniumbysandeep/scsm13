package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sandeep/Desktop/FileUpload.html");
		Thread.sleep(4000);
		File f=new File("./data/ankith.doc");
		String AbsolutePath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(AbsolutePath);
		//driver.close();	
	}
}
