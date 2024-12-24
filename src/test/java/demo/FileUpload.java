package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement input = driver.findElement(By.xpath("//input[@name='upfile']"));
		WebElement press = driver.findElement(By.xpath("//input[@value='Press']"));
		
		input.sendKeys("E:\\oranium\\html.txt");
		press.click();
		
		}
}
