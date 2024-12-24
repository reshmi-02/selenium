package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateSelection {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
//		driver.findElement(By.id("datepicker")).sendKeys("04/10/2023");
		driver.findElement(By.id("datepicker")).click();

		String month = "May",date="31",year="2024";
		
		while(true) {
			
	String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(month.equals(mon) && year.equals(yr)) {
			break;
		}
		else {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		
		}		
		List<WebElement> dates = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
	
	for(WebElement e : dates) {
		
		String text = e.getText();
		if(text.equals(date)) {
			e.click();
		}
	}
	
	}
}
