package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/social-icon.html"); 
		
		WebElement MailName = driver.findElement(By.xpath("//*[@id=\'page\']/div[2]/div/a[1]"));
		String Mname=	MailName.getAttribute("title");
		System.out.println(Mname);
		
		WebElement GoogleName = driver.findElement(By.xpath("//*[@id=\'page\']/div[2]/div/a[2]"));
		String Gname=	GoogleName.getAttribute("title");
		System.out.println(Gname);

	}

}
