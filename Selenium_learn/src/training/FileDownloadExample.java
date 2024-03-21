package training;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");


		WebElement download = driver.findElement(By.id("j_idt93:j_idt95"));
		download.click();

		//C:\Users\jaspr\Downloads

		File FileLocation = new File("C:\\Users\\jaspr\\Downloads");
		File[] TotalFiles = 	FileLocation.listFiles();
		for (File file : TotalFiles) {
			if(file.getName().equals("TestLeaf Logo.png")){
				System.out.println("File is Here");
				break;
			}
			System.out.println("File is Not Here");
			break;
		}

	} 

}
