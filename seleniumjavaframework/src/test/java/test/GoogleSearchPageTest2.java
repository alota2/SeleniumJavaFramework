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

public class GoogleSearchPageTest2 {
	private static WebDriver driver = null;
	
/*
 @BeforeTest
	public void setUpTest() throws MalformedURLException {
		
		String projectPath = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", 
					projectPath+"/drivers/chromedriver/chromedriver");
		 
		 driver = new ChromeDriver();
		
		 
		 
		
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("ignoreProtectedModeSettings", true);
		  IE Browser
		   System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/iedriver);
		 driver = new InternetExplorerDriver(caps);
		 
		 }
 
 */
	
	
	@Test
	 public static void googleSearch() throws MalformedURLException {
		 	 
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		
		//GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
			
			 driver.get("https://google.com");
			 
			// searchPageObj.setTextInSearchBox("automation");
			 
			// searchPageObj.clickSearchButton();
		
		 
		}
	
	/*
	 @AfterTest
	 public void tearDownTest() {
	     driver.close();
	     driver.quit();
	 }
	 
	 */
	 
	
}
