package training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EditExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.leafground.com/input.xhtml"); 
		
		driver.manage().window().maximize();
		 
 
		
	WebElement Typeabout= 	driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt101\']"));
	Typeabout.sendKeys("Hi am Naveenkumar from CSE Departnment");
	
	
	WebElement Text_Append = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']"));
	Text_Append.sendKeys(" Text appended bro...");
	
	WebElement  myname = driver.findElement(By.id("j_idt88:name"));
	myname.sendKeys("NAVEEENKUMAR");
	
	WebElement ClearMsg = driver.findElement(By.name("j_idt88:j_idt95"));
	ClearMsg.clear();
	
	WebElement GetTextBox = driver.findElement(By.id("j_idt88:j_idt97"));
	String value = GetTextBox.getAttribute("value");
	System.out.println(value);
		
	WebElement DisableBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
	boolean enabled = DisableBox.isEnabled();
	System.out.println(enabled);
		
	WebElement email_and_Tab = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt99\']"));
	email_and_Tab.sendKeys("testing@gmail.com" +Keys.ARROW_UP);
	
	WebElement typeAbout = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt101']"));
    if (typeAbout.equals(driver.switchTo().activeElement())) {
        System.out.println("Control moved to TypeAbout element");
    } else {
        System.out.println("Control did not move to TypeAbout element");
    }
    

//    WebElement slider_moves = driver.findElement(By.xpath("//*[@id=\'j_idt106:j_idt120\']/span"));
//    Actions actions = new Actions(driver);
//    actions.dragAndDropBy(slider_moves, 303, 539).release().build().perform();
//    slider_moves.click();    
    
//    WebElement Search = driver.findElement(By.xpath("//*[@id=\'j_idt106:auto-complete_input\']"));
//    Search.sendKeys("naveenkumar");
//    
//    Search.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
//    
//    
//    Select objSelect = new Select(driver.findElement(By.xpath("//*[@id=\'j_idt106:auto-complete_input\']");
//    List <WebElement> elementCount = objSelect.getOptions();
//    System.out.println(elementCount.size());
//    
    
    
    
    
    
    
    
   
 
    
	}
	
	
	
	
	
	
	

}
