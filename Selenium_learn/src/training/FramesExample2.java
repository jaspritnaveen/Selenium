package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample2 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame(0);
		WebElement Myname = driver.findElement(By.name("fname"));
		Myname.sendKeys("pra");
		
		WebElement LastName = driver.findElement(By.name("lname"));
		LastName.sendKeys("p");
		
		
		driver.switchTo().frame(0);
		WebElement Email = driver.findElement(By.name("email"));
		Email.sendKeys("pranesh@gmail.com");
		
//		driver.switchTo().parentFrame();
//		Myname.sendKeys("nesh");
		
		driver.switchTo().defaultContent();
		WebElement WathchVideo = driver.findElement(By.xpath("/html/body/app-root/app-footer/footer/div[2]/div/span[1]/a"));
		WathchVideo.click();
		
		
		
	}

}
