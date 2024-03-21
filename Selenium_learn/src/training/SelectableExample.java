package training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectableExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://output.jsbin.com/osebed/2");

		
		WebElement selectElement = driver.findElement(By.name("selectomatic"));
        Select select = new Select(selectElement);
        
	    List<WebElement> optionList = select.getOptions();
	    optionList.size();

	}

}
