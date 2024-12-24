package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowsers {

	public static void main(String[] args) {
		
		
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--headless");
//		c.addArguments("--incognito");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://testautomationpractice.blogspot.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
}
