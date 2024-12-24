package demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
//import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingBrokenLinks {

	static int   brokencount=0,unbrokencount=0;
//	private static final String HttpUrlConnection = null;

	public static void brokenLinkChecker(String str) {
		
		try {
			URL url = new URL(str);
			
			HttpURLConnection httpurl=(HttpURLConnection)url.openConnection();
			
			httpurl.connect();
			
			int responseCode = httpurl.getResponseCode();
			
			if(responseCode>=400) {
				
				brokencount++;
				System.out.println("given link is a broken link = "+str);
				
			}
			else {
				unbrokencount++;
				System.out.println("given link is not a broken link = "+str);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/");
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		for(WebElement tag: elements) {
			String str = tag.getAttribute("href");
			brokenLinkChecker(str);
		}
		
		System.out.println(brokencount);
		System.out.println(unbrokencount);
	}
	
}
