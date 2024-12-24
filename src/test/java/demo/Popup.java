package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup {

	public static void main (String args []) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//	   
//	     driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//	
//	Alert alert = driver.switchTo().alert();
//	alert.accept();
	
//	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//	Alert alert = driver.switchTo().alert();
//	alert.dismiss();
		
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("okay");
	alert.accept();
	
	}
		
}
