package training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml"); 
		
		
		WebElement GetPosition_Button = driver.findElement(By.id("j_idt88:j_idt94"));
		
		
		Point xypoint = GetPosition_Button.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
		
		
		System.out.println("X value is " + xValue + ", Y Value is " + yValue);

		WebElement FindButtonColor = driver.findElement(By.id("j_idt88:j_idt96"));
		String color =  FindButtonColor.getCssValue("background-color");
		System.out.println(color);
		
		WebElement FindButtonSize = driver.findElement(By.id("j_idt88:j_idt98"));
		Dimension OverALLHeightAndWidth = FindButtonSize.getSize();
		int  Height  = FindButtonSize.getSize().getHeight();
		int  Size  = FindButtonSize.getSize().getWidth();
		System.out.println("The button Height is " +Height);
		System.out.println("The Button Size is "+Size);
		System.out.println(OverALLHeightAndWidth);
		
//		WebElement ClickTheButton = driver.findElement(By.id("j_idt88:j_idt90"));
//		ClickTheButton.click();
		
		
		WebElement FindDisableButton = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean enabled = FindDisableButton.isEnabled();
		System.out.println(enabled);
		
	 	
	}

}
