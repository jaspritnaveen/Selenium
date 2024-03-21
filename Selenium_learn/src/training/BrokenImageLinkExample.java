package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImageLinkExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		
		
		WebElement BrokenImage = 	driver.findElement(By.xpath("//*[@id=\'content\']/div/img[3]"));
		
		if (BrokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image is Broken");
		}
		else {
			System.out.println("The image is   NOT Broken");
		}
	}

}
