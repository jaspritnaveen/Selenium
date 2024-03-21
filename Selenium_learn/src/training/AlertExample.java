package training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml"); 

				WebElement OkAlertBox = driver.findElement(By.id("j_idt88:j_idt91"));
				OkAlertBox.click();
				driver.switchTo().alert().getText();
				
				Alert okalert = driver.switchTo().alert();
				driver.switchTo().alert().getText();
				Thread.sleep(2000);
				okalert.accept();
				Thread.sleep(2000);
				
				WebElement CancleAlertBox = driver.findElement(By.id("j_idt88:j_idt93"));
				CancleAlertBox.click();
				
				Alert CancleAlert = driver.switchTo().alert();
				Thread.sleep(2000);
				CancleAlert.dismiss();
				
				
				WebElement PromptBox = driver.findElement(By.id("j_idt88:j_idt104"));
				PromptBox.click();
				
				Alert PromptAlert = driver.switchTo().alert();
				Thread.sleep(2000);
				PromptAlert.sendKeys("Naveenkumar");
				Thread.sleep(2000);
				PromptAlert.accept();


	



	}

}
