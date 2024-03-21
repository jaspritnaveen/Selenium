package training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Session1 {

	public static void main(String[] args) throws Exception {

		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
	
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(200);
		
		driver.navigate().back();
		
		driver.close();
	}

}
