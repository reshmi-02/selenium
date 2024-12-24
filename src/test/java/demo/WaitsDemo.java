package demo;

import java.time.Duration;
//import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
//		driver.get("https://letcode.in/waits");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		WebElement element = driver.findElement(By.xpath("//textarea[@name='q']"));
//		element.sendKeys("selenium");
		
//		WebElement element = driver.findElement(By.xpath("//button[@id='accept']"));
//	
//		element.click();
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
//	alt.accept();
		
		driver.get("https://www.google.com/");
		
		WebElement element = driver.findElement(By.name("q"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement ib = wait.until(ExpectedConditions.elementToBeClickable(element));
		ib.sendKeys("selenium");
		
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(5));	
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement ib1 = wait.until(ExpectedConditions.elementToBeClickable(element));
		Boolean until = wait.until(ExpectedConditions.titleIs("Google"));
		System.out.println(until);;
	}
	
	
}
