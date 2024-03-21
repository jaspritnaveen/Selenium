package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html"); 
		
        WebElement RadioButton1 = driver.findElement(By.id("vfb-7-2"));
        RadioButton1.click();
        
        WebElement RadioButton2 = driver.findElement(By.id("vfb-7-1"));
        RadioButton2.click();
        
        WebElement CheckBox1 = driver.findElement(By.id("vfb-6-0"));
        CheckBox1.click();
        
        WebElement CheckBox2 = driver.findElement(By.id("vfb-6-1"));
        CheckBox2.click();
        
        WebElement CheckBox3 = driver.findElement(By.id("vfb-6-2"));
        CheckBox3.click();
        
        if (CheckBox3.isSelected()) {
        	System.out.println("Selected");
			
		}
        else {
        	System.out.println("Not Selecteśśd");
			
		}
        
        if (RadioButton2.isSelected()) {
        	System.out.println("Selected");
			
		}
        else {
        	System.out.println("Not Selected");
			
		}
        
        
        
        
      
        
    }		

}
		

	
