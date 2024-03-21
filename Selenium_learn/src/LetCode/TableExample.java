package LetCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");

		WebElement table = driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[2]/table"));
		List<WebElement> ColumnSize =	table.findElements(By.tagName("th"));
		int cls = ColumnSize.size();
		System.out.println(cls);

		for (WebElement webElement : ColumnSize) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}

}
