package apr3rd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComplexXpaths {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile phones");
		
		//selectMobileBrand();

		
		
		driver.quit();
	}

	public void selectMobileBrand(String name) 
	{
		
		
	}

}
