package training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceLinkExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		WebElement HomePageLink = driver.findElement(By.linkText("Go to Dashboard"));
		HomePageLink.click();
		driver.navigate().back();


		WebElement WhereToGo = driver.findElement(By.partialLinkText("Find the "));
		String where = 	WhereToGo.getAttribute("href");
		System.out.println(where);

		WebElement BrokenLink = driver.findElement(By.partialLinkText("Broken?"));
		BrokenLink.click();

		String Title =	driver.getTitle();
		if (Title.contains("404")) {
			System.out.println("Link is Broken");

		}else {
			System.out.println("Link is NOT  Broken");
		}
		driver.navigate().back();

		List <WebElement> count =	driver.findElements(By.tagName("a"));
		int Count =	count.size();
		System.out.println(Count);

		
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement link:allLinks){
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
		List<WebElement> linksInLayout = driver.findElements(By.xpath("//*[@id='j_idt87']/div/div[2]/div[3]//a"));
		int linkCount = linksInLayout.size();
		System.out.println("How many links in this layout? " + linkCount);


	}

}
