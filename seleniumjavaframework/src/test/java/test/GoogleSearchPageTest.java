package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	private static WebDriver driver = null;
	
	
	
	
	@Test
	 public static void googleSearch() throws MalformedURLException {
		 	 
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
			
			 driver.get("https://google.com");
			 
			 searchPageObj.setTextInSearchBox("automation");
			 
			 searchPageObj.clickSearchButton();
		
		 
		 
	
}
	
}
