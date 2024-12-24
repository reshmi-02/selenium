package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> elements = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
	
	
//	  for(WebElement check : elements) {
//		  check.click();
//	  }
	  
	  
//	  for(WebElement check : elements) {
//		  String day = check.getAttribute("id");
//		  
//		  if(day.equals("sunday") || day.equals("wednesday")) {
//			  check.click();
//		  }
//	  }
		
		
//		for(int i=0 ; i<elements.size();i++) {
//			
//			String attribute = elements.get(i).getAttribute("id");
//			
//			if(( attribute.equals("sunday")) || ( attribute.equals("wednesday"))) {
//				elements.get(i).click();
//			}
//		}
		
		for(int i=0 ; i<elements.size();i++) {
			elements.get(i).click();
		}
	  
	}
}
