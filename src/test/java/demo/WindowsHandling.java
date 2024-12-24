package demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']"));
		element.sendKeys("selenium");
		element.sendKeys(Keys.ENTER);
	
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
	 
		for(WebElement e :elements) {
			e.click();
		}
		
		String parentwindowid = driver.getWindowHandle();
		System.out.println("parentid = "+parentwindowid );
		
		Set<String> allwindowid = driver.getWindowHandles();
		
//		for(String e :allwindowid) {
//					
//			if((parentwindowid)!= (e)) {
//				System.out.println(e);
//				driver.switchTo().window(e);
//				
//				String title = driver.getTitle();
//				System.out.println(title);
//			}
//		}
		
		ArrayList<String> l = new ArrayList<>(allwindowid);
		
		for(int i=0;i<l.size();i++) {
			if(i>=1) {
				driver.switchTo().window(l.get(i));
				String title = driver.getTitle();
				System.out.println(title);
			}
		}
//		driver.switchTo().window(l.get(0));
//		String title = driver.getTitle();
//		System.out.println(title);
	}
}

//driver.switchTo().window(e);
//
//String title = driver.getTitle();
//System.out.println(title);

//if(title.equals("Selenium - Wikipedia")) {
//	System.out.println(title);
//	driver.close();
//}