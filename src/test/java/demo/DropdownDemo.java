package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDemo {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
//		driver.get("https://letcode.in/dropdowns");
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		
//		WebElement dropdown = driver.findElement(By.xpath("//select[@id='fruits']"));
//		
//		Select s = new Select (dropdown);
//		
//		s.selectByIndex(2);
//		WebElement text = s.getFirstSelectedOption();
//		System.out.println(text.getText());
//		
//		s.selectByValue("0");
//		WebElement text1 = s.getFirstSelectedOption();
//		System.out.println(text1.getText());
//		
//		s.selectByVisibleText("Pine Apple");
//		WebElement text3 = s.getFirstSelectedOption();
//		System.out.println(text3.getText());
//
//		List<WebElement> options = s.getOptions();
//		
//		for(WebElement opt :options) {
//			opt.click();
//			String text2 = opt.getText();
//			if(text2.equals("Banana")) {
//				System.out.println(opt.getText());
//			};
//			
//		}
//		
//		
//		WebElement multi = driver.findElement(By.xpath("//select[@id='superheros']"));
//		
//		Select s2= new Select(multi);
//		s2.selectByIndex(1);
//		s2.selectByValue("bw");
//		s2.selectByVisibleText("Batman");
//		WebElement word = s2.getFirstSelectedOption();
//	System.out.println(word.getText());
//	List<WebElement> f = s2.getAllSelectedOptions();
//	for(WebElement opt : f) {
//		
//	System.out.println(	opt.getText());
//		
//	}
		
		WebElement ele = driver.findElement(By.xpath("//button[@id='menu1']"));
		
	    ele.click();
	
	
	    List<WebElement> list = driver.findElements(By.xpath("//ul[@role='menu']/li"));
	
	    for(WebElement e : list) {
	    	
	    	if(e.getText().equals("HTML")) {
	    		System.out.println(e.getText());
	    		e.click();
	    	}
	    	
//	    	System.out.println(e.getText());
	    }
	
	
	}
	
}
