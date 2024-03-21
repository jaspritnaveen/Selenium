package training;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0"); 


		driver.switchTo().frame(0);

		WebElement FirstButton = driver.findElement(By.xpath("//*[@id=\'Click\']"));
		FirstButton.click();

		String Text =  driver.findElement(By.xpath("//*[@id=\'Click\']")).getText();
		System.out.println(Text);



		driver.switchTo().defaultContent();

		List<WebElement> TotalFrames = 	driver.findElements(By.tagName("iframe"));
		int TotalSize = TotalFrames.size();
		System.out.println(TotalSize);





	}

}


