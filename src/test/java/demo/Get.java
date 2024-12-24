package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement text = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		String tex = text.getText();
		System.out.println(tex);
		
		
		WebElement element = driver.findElement(By.xpath("//textarea[@name='q']"));
		element.sendKeys("selenium");
		
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		driver.close();
		
		
		
	}
}
