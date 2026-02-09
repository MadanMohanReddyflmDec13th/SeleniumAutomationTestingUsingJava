package mar15th;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTable3 {
	
	WebDriver driver; 
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@Test
	public void WorldClockDataDemo()
	{
		WebElement table =driver.findElement(By.xpath("//table"));
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		for(WebElement row:allRows)
		{
			List<WebElement> allColumns = row.findElements(By.tagName("td"));
			
			for(WebElement col:allColumns)
			{
				System.out.print(col.getText()+"   ");
			}
			
			System.out.println();
		}					
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
 