package demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static  void captureScreenShot(WebDriver driver) throws IOException {
		
		TakesScreenshot tks =(TakesScreenshot) driver;
		File temp = tks.getScreenshotAs(OutputType.FILE);
		
//		File dest = new File("./screenshot/facebook.png");
		
		File dest = new File("./screenshot/facebook"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(temp, dest);
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		WebElement uname = driver.findElement(By.id("email"));
		uname.sendKeys("217826288");
		Thread.sleep(3000);
		captureScreenShot(driver);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("reshmi");
		
		Thread.sleep(3000);
		captureScreenShot(driver);
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
		
		Thread.sleep(2000);
		
		captureScreenShot(driver);
		
	}
	
}
