package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver driver;

	//Main responsibility of WebDriverManager Method is to initialize driver 
	public WebDriver webDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//resources//global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url =prop.getProperty("QAUrl");
		String browser_Properties =prop.getProperty("browser");
		String browser_MavenTerminal =System.getProperty("browser");
		String browser = (browser_MavenTerminal!=null)?(browser_MavenTerminal):(browser_Properties);//ternary operator
		
		if (driver == null) 
		{
			if(browser.equalsIgnoreCase("chrome")) 
			{
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("edge"))
			{
				driver = new EdgeDriver(); 
			}
			
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			
		}
		return driver;
	}
}
