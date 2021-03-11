package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.actitime.generics.FileLib;
import com.actitime.generics.WebDriverCommonLib;

public class FileDownload {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			Runtime.getRuntime().exec("notepad");
	}		
}
