package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("enter the title of the browser to be closed");
		Scanner sc=new Scanner(System.in);
		String ExpectedTitle = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		Set<String> Allwh = driver.getWindowHandles();
		for(String wh:Allwh) {
			driver.switchTo().window(wh);
			String ActualTitle = driver.getTitle();
			if(ActualTitle.equals(ExpectedTitle)) {
				driver.close();
			}
		}
	}

}
