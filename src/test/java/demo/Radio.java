package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement element = driver.findElement(By.xpath("//input[@value='male']"));
		System.out.println(element.isSelected());
		element.click();
		System.out.println(element.isSelected());
		System.out.println("----next----");
		WebElement element1 = driver.findElement(By.xpath("//input[@value='female']"));
		System.out.println(element1.isSelected());
		element1.click();
		System.out.println(element1.isSelected());
	}
}
