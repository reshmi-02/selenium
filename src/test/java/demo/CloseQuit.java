package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseQuit {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nykaa.com/sp/main-sale-page/mega-sale?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa&gad_source=1&gclid=Cj0KCQjwwYSwBhDcARIsAOyL0fiIKTad9YjwSXHq_wyNBVerVVHhJ8Ypq0odsJVUrFyQzYdWiqQKLXUaAtrkEALw_wcB");
	
//	     WebElement element = driver.findElement(By.xpath("//a[text()='luxe']"));
//	     element.click();
//	
//	     Thread.sleep(2000);
//	     driver.quit();
//	   driver.close();
	}
	
}
