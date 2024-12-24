package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigational {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
//		ChromeDriver driver = new ChromeDriver();
		
//		driver .get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebElement element = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
//	String text = element.getText();
////	System.out.println(text);
//		driver.navigate().to("https://www.w3schools.com/");
//		driver.get("https://www.google.co.in");
//		WebElement element = driver.findElement(By.name("q"));
//		element.sendKeys("w3 school");
//		String attribute = element.getAttribute("name");
//		System.out.println(attribute);
//		element.sendKeys(Keys.ENTER);
//		
//		
////	driver.findElement(By.partialLinkText("W3Schools Online Web Tutorials")).click();
//		
//		driver.navigate().to("https://www.w3schools.com/");
//		
//		WebElement element2 = driver.findElement(By.linkText("JAVA"));
//		element2.click();
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.close()
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
//		String title = driver.getTitle();
//		System.out.println(title);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//  
//		Thread.sleep(2000);
//		driver.quit();
//		driver.get("https://artoftesting.com/samplesiteforselenium");
// List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
//
// for(int i=0 ;i<elements.size();i++) {
//	 elements.get(i).click();
// }
//      for(WebElement e:elements) {
//    	  e.click();
//      }
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alt2 = driver.switchTo().alert();
		alt2.dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alt3 = driver.switchTo().alert();
		alt3.sendKeys("resh");
		alt3.accept();
		
		//tasl
		//https://letcode.in/alert
//		driver.close();
		
	}
	
}
