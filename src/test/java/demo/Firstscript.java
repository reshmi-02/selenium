package demo;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firstscript {

	public static void main (String args []) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
//		EdgeDriver driver = new EdgeDriver();
		ChromeDriver driver = new ChromeDriver();
		
//		EdgeDriver driver2 = driver;
//		driver.get("https://reshmi-02.github.io/bill-calculator/");
//		driver.get("https://reshmi-02.github.io/insta/");
		
//		driver.manage().window().maximize();
//		Dimension d= new Dimension(500,900);
//		driver.manage().window().setSize(d);
			
//		WebElement inputbox = driver.findElement(By.name("q"));
//		
//		inputbox.sendKeys("elon musk");
//		
//		inputbox.sendKeys(Keys.ENTER);
		
//		WebElement input = driver.findElement(By.xpath("//input[@id='amount']"));
//		input.sendKeys("1000");
//		
//		WebElement input2 = driver.findElement(By.xpath("//input[@id='tipper']"));
//		input2.sendKeys("3");
//		
//		WebElement but = driver.findElement(By.xpath("//input[@id='but']"));
//		but.click();
		
//		driver.findElement(By.id("username")).sendKeys("reshmi");
//		driver.findElement(By.id("email")).sendKeys("reshmihash123@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("hashini");
//		driver.findElement(By.id("register")).click();
//		driver.findElement(By.id("userna")).sendKeys("reshmi");
//		driver.findElement(By.id("passwrd")).sendKeys("hashini");
//		driver.findElement(By.id("login")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		
//		List<WebElement> elements = driver.findElements(By.xpath("//i[@class='like fa fa-heart']"));
////		driver.manage().window().setPosition(new Point(0, -1000));
//	System.out.println(elements.size());
//		for(int i=0 ; i<elements.size();i++) {
//			
//			elements.get(i).click();
//			Thread.sleep(1000);
			
//		}
	
//		driver.get("https://testautomationpractice.blogspot.com/");
//	    List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='pagination']/li"));
//	
//	for(int i=0 ; i<elements.size();i++) {
//		elements.get(i).click();
//		
//		List<WebElement> elements2 = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[4]/input"));
//	   for(int j=0 ; j<elements2.size();j++) {
//		   elements2.get(j).click();
//	   }
//	   
//	   Thread.sleep(2000);
		
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement element = driver.findElement(By.xpath("//select[@id='lang']"));
	
	
	    Select s = new Select(element);
	    List<WebElement> options = s.getOptions();
	    int size = (options.size());
	    System.out.println(size);
	    
	    for(int i=0 ; i<options.size();i++) {
	    	
	    	System.out.println(options.get(i).getText());
	    	
	    	if(i==(size-1)) {
	    		System.out.println(options.get(i).getText());
	    		options.get(i).click();
	    	}
	    	
	    }
	}
}
