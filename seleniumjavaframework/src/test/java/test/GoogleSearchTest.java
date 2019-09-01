package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

//https://www.udemy.com/course/selenium-java-framework-from-scratch
//Raghav Pal


public class GoogleSearchTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
	}
	
 public static void googleSearch() {
 String projectPath = System.getProperty("user.dir");
 System.setProperty("webdriver.chrome.driver", 
			projectPath+"/drivers/chromedriver/chromedriver");
 
 

 driver = new ChromeDriver();
 driver.get("https://www.google.com/");
 GoogleSearchPage.textbox_search(driver).sendKeys("Automation");
 GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
 
 driver.close();
 
 System.out.println("Test Completed Successfully");
 
}
 
}
