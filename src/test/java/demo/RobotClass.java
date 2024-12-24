package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass {

	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	
	   Actions act = new Actions(driver);
	   
	   act.moveToElement(gmail).contextClick().build().perform();
	   
//	   act.sendKeys(Keys.DOWN).perform();
//	   act.sendKeys(Keys.DOWN).perform();
//	   act.sendKeys(Keys.DOWN).perform();
//	   act.sendKeys(Keys.ENTER).perform();
	   
	   Robot r = new Robot();
	   r.keyPress(KeyEvent.VK_DOWN);
	   r.keyRelease(KeyEvent.VK_DOWN);
	   
	   r.keyPress(KeyEvent.VK_DOWN);
	   r.keyRelease(KeyEvent.VK_DOWN);
	   
	   r.keyPress(KeyEvent.VK_DOWN);
	   r.keyRelease(KeyEvent.VK_DOWN);
	   
	   r.keyPress(KeyEvent.VK_ENTER);
	   r.keyRelease(KeyEvent.VK_ENTER);
	   
	   
	}
}
