package training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php#");


		//COUNT THE TOTAL NUMBER OF COLOUMS 

		List<WebElement> columnCount = driver.findElements(By.tagName("th"));
		int ColumnSizeCount =	columnCount.size();
		System.out.println(ColumnSizeCount);
		
		List<WebElement> RowCount = driver.findElements(By.tagName("tr"));
		int RowSizeCount =	RowCount.size();
		System.out.println(RowSizeCount);
		
		
		
		
		
		
		
		
		
		
	}

}
