package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");
		
		WebElement SendText = driver.findElement(By.xpath("//*[@id=\'RA-root\']/div/div[1]/div[1]/div[2]/span/span/span[1]/input"));
		
		SendText.sendKeys("bitcoin");
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"RA-root\"]/div/div[1]/div[1]/div[2]/span/span/span[2]/button"));
		Button.click();
		
	}

}
