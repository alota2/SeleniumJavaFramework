package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

static Properties prop = new Properties();
static String projectPath = System.getProperty("user.dir");
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         getProperties();
	}
	
	public static void getProperties() {


		try {

			InputStream input = new FileInputStream(projectPath+"/src/test/java/config/config.properties");

			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);

		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
       
}
	
	public static void setProperties() {
		try {
			OutputStream output = new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	
}