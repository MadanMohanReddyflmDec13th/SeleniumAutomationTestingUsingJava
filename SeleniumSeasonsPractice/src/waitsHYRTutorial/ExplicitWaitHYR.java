package waitsHYRTutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitHYR {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();
	
		driver.findElement(By.id("btn2")).click();
		//driver.findElement(By.id("txt2")).sendKeys("Madan Mohan Reddy");
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele= myWait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt2")));
		ele.sendKeys("Madan Mohan Reddy");
		
		System.out.println("Explicit wait is successfully completed");
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
