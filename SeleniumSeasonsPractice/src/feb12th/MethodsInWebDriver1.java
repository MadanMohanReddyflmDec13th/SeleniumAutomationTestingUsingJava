package feb12th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//get(String):void
		
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(3000);
		
		//close():void
		//driver.close();
		
		driver.quit();
		
		
	}

}
