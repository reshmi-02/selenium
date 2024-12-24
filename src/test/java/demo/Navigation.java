package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//textarea[@name='q']"));
		element.sendKeys("w3 school");
		element.sendKeys(Keys.ENTER);
		
//		WebElement element2 = driver.findElement(By.xpath("//h3[text()='W3Schools Online Web Tutorials']"));
//		element2.click();
		
		driver.navigate().to("https://www.w3schools.com/");
		
		WebElement element3 = driver.findElement(By.xpath("//a[text()='JAVA']"));
		element3.click();
	
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    driver.navigate().back();
	    Thread.sleep(2000);
	    
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    
	    driver.close();
	    
		
	}
	
}
