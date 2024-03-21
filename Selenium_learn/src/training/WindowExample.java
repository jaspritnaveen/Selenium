package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class WindowExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml"); 
		
		
		String OldWindow = 	driver.getWindowHandle();
		
		
		
		WebElement FirstButton = driver.findElement(By.id("j_idt88:new"));
		FirstButton.click();
		
		Set<String> handles= driver.getWindowHandles();
		
		
		for (String NewWindow : handles) {
			driver.switchTo().window(NewWindow);
		}
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("naveenkumar@gmail.com");
		driver.close();
		
		driver.switchTo().window(OldWindow);
		
		WebElement SecondButton = driver.findElement(By.id("j_idt88:j_idt91"));
		SecondButton.click();
		
		int NumberOFWindows =	driver.getWindowHandles().size();
		System.out.println(NumberOFWindows);
		 
		
		Set<String> NewWindowHandles = driver.getWindowHandles();
		
		for (String AllWindows : NewWindowHandles) {
			if (!AllWindows.equals(OldWindow)) {
				driver.switchTo().window(AllWindows);
				driver.close();
				
			}
		}
		driver.quit();
	
	}
	}