package seleniumPrcatice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Madan Reddy");
		driver.findElement(By.id("password")).sendKeys("Madan 123");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
