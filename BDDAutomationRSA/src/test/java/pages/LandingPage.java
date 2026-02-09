package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage 
{
	public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver= driver; 
	}
	

	By search= By.xpath("//input[@type='search']");
	By productName= By.cssSelector("h4.product-name");
	By topDeals= By.xpath("//a[text()='Top Deals']");
	
	By incrementBtn = By.xpath("//a[@class='increment']"); 
	By addToCartBtn = By.xpath("//button[text()='ADD TO CART']"); 
	
	public void searchItem(String name) 
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();	
	}
	
	public void selectTopDealsPage()
	{
		driver.findElement(topDeals).click();
	} 
	
	
	public void increaseQuantity(int qty)
	{
		for(int i=1; i<qty; i++)
		{
			driver.findElement(incrementBtn).click(); 
		}
	}
	
	public void clickAddToCart()
	{
		driver.findElement(addToCartBtn).click();;
	}
}
