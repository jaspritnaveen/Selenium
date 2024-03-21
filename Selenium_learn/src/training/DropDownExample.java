package training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");

		WebElement DropDown1 = 	driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[1]/div[1]/div/div/select"));

//		Select select1  = new Select(DropDown1);
//
//		select1.selectByIndex(1);

//		List <WebElement> ListOfOptions = select1.getOptions();
//		ListOfOptions.size();
//		System.out.println(ListOfOptions);
//		
//		DropDown1.sendKeys("Playwright");
		
		WebElement DropDown2 = 	driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[2]/div"));
		DropDown2.sendKeys("USA");
		
		
		
		
		
		




	}

}
