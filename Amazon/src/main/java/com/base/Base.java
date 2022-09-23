package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;

	public static WebDriver getBrowser(String google) {
		if (google.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\ARUN\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
		} else {
			System.out.println("no driver found");
		}
		return driver;

	}

	public static void getURL(String val) {
		driver.get(val);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void implicitlywait(WebElement proceed) {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void sendkeys(WebElement element, String val) {
		element.sendKeys(val);
	}

}
