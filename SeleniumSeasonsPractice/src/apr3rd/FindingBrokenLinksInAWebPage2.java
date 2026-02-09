package apr3rd;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingBrokenLinksInAWebPage2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practice-automation.com/broken-links/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		for(WebElement link: allLinks) 
		{
			String linkURL =link.getAttribute("href");
			URL url= new URL(linkURL);
			URLConnection urlConnection  = url.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection)(urlConnection);//HttpURLConnection is a abstract class we can't create object for it
			httpURLConnection.setConnectTimeout(5000);
			httpURLConnection.connect(); 
			
			if(httpURLConnection.getResponseCode() >=400 ) //For finding Broken Links
			{
				System.err.println(linkURL + " --- " + httpURLConnection.getResponseMessage()+httpURLConnection.getResponseCode());
			}
			else //Links Working good
			{
				System.out.println(linkURL + " --- " + httpURLConnection.getResponseMessage()+httpURLConnection.getResponseCode());
			}
	  
			httpURLConnection.disconnect();
		}	
		driver.quit();
	}
}  
