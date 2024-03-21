package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropGuru99Example {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");

		WebElement From1 = driver.findElement(By.xpath("//*[@id=\'credit2\']"));
		WebElement To1 = driver.findElement(By.xpath("//*[@id=\'bank\']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(From1, To1).build().perform();
		
		WebElement From2 = driver.findElement(By.xpath("//*[@id=\'fourth\']"));
		WebElement To2 = driver.findElement(By.xpath("//*[@id=\'amt7\']"));
		actions.dragAndDrop(From2, To2).build().perform();
		
		

		WebElement From3 = driver.findElement(By.xpath("//*[@id=\'credit1\']"));
		WebElement To3 = driver.findElement(By.xpath("//*[@id=\'loan\']"));
		actions.dragAndDrop(From3, To3).build().perform();
		

		WebElement From4 = driver.findElement(By.xpath("//*[@id=\'fourth\']"));
		WebElement To4 = driver.findElement(By.xpath("//*[@id=\'amt8\']"));
		actions.dragAndDrop(From4, To4).build().perform();
		
//		if(driver.findElement(By.xpath("//a[contains(text(),'Perfect')]")).isDisplayed())							
//     	{		
//         	System.out.println("Perfect Displayed !!!");					
//     	}
//		else
//     	{
//        	System.out.println("Perfect not Displayed !!!");					
//     	}	
		
		  WebElement element = driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		  String elementText = element.getText();
		  if(elementText.contains("perfect!")) {
              System.out.println("The text 'perfect' was found.");
          } else {
              System.out.println("The text 'perfect' was not found.");
          }
}
		
	

	}


