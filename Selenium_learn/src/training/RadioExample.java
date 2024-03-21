package training;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class RadioExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio"
				+ ".xhtml"); 

		WebElement Chrome = driver.findElement(By.id("j_idt87:console2:0"));
		WebElement Firefox = driver.findElement(By.id("j_idt87:console2:1"));
		WebElement Safari = driver.findElement(By.id("j_idt87:console2:2"));
		WebElement Edge = driver.findElement(By.id("j_idt87:console2:3"));

		boolean  status1 = Chrome.isSelected();
		boolean  status2 = Firefox.isSelected();
		boolean  status3 = Safari.isSelected();
		boolean  status4 = Edge.isSelected();

		System.out.println(status1);
		System.out.println(status2);
		System.out.println(status3);
		System.out.println(status4);

		

	 


	}

}
