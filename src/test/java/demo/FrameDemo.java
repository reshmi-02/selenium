package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");				
		
//		WebElement element = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
//		driver.switchTo().frame(element);
	
//		driver.switchTo().frame("singleframe")
        driver.switchTo().frame(1);
		WebElement element2 = driver.findElement(By.xpath("//input[@type='text']"));
		element2.sendKeys("selenium");
		
		driver.switchTo().defaultContent();
		WebElement element = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		element.click();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame(0);
		
		WebElement element3 = driver.findElement(By.xpath("//input[@type='text']"));
		element3.sendKeys("selenium");
		
	
		driver.switchTo().parentFrame();
		
		WebElement element4 = driver.findElement(By.xpath("//h5[text()='Nested iFrames']"));
		String text = element4.getText();
		System.out.println(text);		
		driver.close();
		
		
	}
	
}
