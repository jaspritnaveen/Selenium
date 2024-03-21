package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement From = driver.findElement(By.id("form:drag"));
		WebElement To = driver.findElement(By.id("form:drop"));
		
		Actions actions = new Actions(driver);
//		actions.clickAndHold(From).moveToElement(To).release().build().perform();
		actions.dragAndDrop(From, To).build().perform();
		
		
		
		
	}

}
