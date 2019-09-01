package seleniumjavaframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		/*
        
		System.setProperty("webdriver.gecko.driver", 
				projectPath+"/drivers/geckodriver/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://seleniumhq.org");
		*/
		
		System.setProperty("webdriver.chrome.driver", 
				projectPath+"/drivers/chromedriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumhq.org");
		driver.close();
		
	}

}
