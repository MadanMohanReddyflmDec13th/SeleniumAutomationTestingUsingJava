package apr3rd;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingBrokenLinksInAWebPage {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver  =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Set<String> brokenLinksURLs = new HashSet<String>();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		for(WebElement link: allLinks)
		{
			String linkURL =link.getAttribute("href");
			URL url= new URL(linkURL);
			URLConnection urlConnection  =url.openConnection();
			HttpURLConnection httpURLConnection = (HttpURLConnection)(urlConnection);//HttpURLConnection is a abstarct class we can't create object for it
			httpURLConnection.setConnectTimeout(5000);
			httpURLConnection.connect();
		/*	
			if(httpURLConnection.getResponseCode() ==200 )
			{
				System.out.println(linkURL + " - " + httpURLConnection.getResponseMessage());
			}
			else 
			{
				System.err.println(linkURL + " - " + httpURLConnection.getResponseCode());
			}
		*/
			if(httpURLConnection.getResponseCode() !=200 )
			{
				brokenLinksURLs.add(linkURL);
			}
			
			httpURLConnection.disconnect();
		}	
		driver.quit();
		
		for(String brokenlinkurl : brokenLinksURLs)
		{
			System.err.println(brokenlinkurl);
		}
	}
}
