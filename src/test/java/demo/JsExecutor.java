package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecutor {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement element = driver.findElement(By.xpath("//textarea[@name='q']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].value='facebook'",element);
		
		element.sendKeys(Keys.ENTER);
		
		WebElement face = driver.findElement(By.xpath("//h3[text()='Facebook - log in or sign up']"));
	
	jse.executeScript("arguments[0].click()", face);
	
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
	WebElement inp = driver.findElement(By.xpath("//button[@name='login']"));
	jse.executeScript("arguments[0].value='rqrqrew';arguments[1].value='324124';arguments[2].click()",email,pass,inp);
	
	}
	
}
