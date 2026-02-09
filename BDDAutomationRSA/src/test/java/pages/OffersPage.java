package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OffersPage 
{
	public WebDriver driver;

	public OffersPage(WebDriver driver)
		{
			this.driver= driver; 
		}

	private By search = By.xpath("//input[@type='search']"); //declaring as private other's can't modify them
	private By productName = By.xpath("//td[text()='Tomato']");

	public void searchItem(String name) 
	{
		driver.findElement(search).sendKeys(name);
	}

	public String getProductName() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(productName));
		return driver.findElement(productName).getText();
	}

}
 