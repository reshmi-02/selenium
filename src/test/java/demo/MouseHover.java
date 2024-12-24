package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/ref=nav_logo");
//		
//		WebElement arrow = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
//		WebElement order = driver.findElement(By.xpath("//span[text()='Your Orders']"));
//		
//		Actions act = new Actions (driver);
//		act.moveToElement(arrow).perform();
//		act.moveToElement(order).click().perform();
		
//		driver.get("https://www.google.com/");
//		WebElement element = driver.findElement(By.xpath("//a[text()='Gmail']"));
//		Actions act = new Actions (driver);
//		act.contextClick(element).perform();
		
		
//		driver.get("https://testautomationpractice.blogspot.com/");
		
//		WebElement element = driver.findElement(By.xpath("//input[@id='field1']"));
//	
//		element.clear();
//		element.sendKeys("reshmi");
//		
//		WebElement but = driver.findElement(By.xpath("//button[text()='Copy Text']"));
//	
//		Actions act = new Actions (driver);
//		act.doubleClick(but).perform();
		
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
//		
//		WebElement box = driver.findElement(By.xpath("//div[@id='box1']"));
//		WebElement dragbox = driver.findElement(By.xpath("//div[@id='dropBox']"));
//		Actions act = new Actions (driver);
//		
//		act.dragAndDrop(box, dragbox).perform();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement min = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		WebElement max = driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
	
		Point minlocation = min.getLocation();
		Point maxlocation = max.getLocation();
		
		System.out.println(minlocation);
		System.out.println(maxlocation);
		Actions act = new Actions (driver);
		
	act.dragAndDropBy(min, 100, 250).perform();
	act.dragAndDropBy(max, -100, 250).perform();	
	}
	
}
