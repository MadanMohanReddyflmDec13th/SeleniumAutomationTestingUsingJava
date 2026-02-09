package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage 
{
	public WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver= driver; 
	}
	
	
	By cartBag = By.xpath("//img[@alt='Cart']");
	By checkOutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoBtn = By.xpath("//button[@class='promoBtn']");
	By  placeorder = By.xpath("//button[contains(text(),'Place Order')]");
	By checkoutPrdctName = By.xpath("//p[text()='Tomato - 1 Kg']");
	
	public void checkOutItems() 
	{
		driver.findElement(cartBag).click(); 
		driver.findElement(checkOutButton).click();
	}
	
	public boolean verifyPromoBtn()
	{
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(3));
		mywait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(promoBtn));
		return driver.findElement(promoBtn).isDisplayed(); 
	}
	
	public boolean verifyPlaceOrder()
	{
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(3));
		mywait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(placeorder));
		return driver.findElement(placeorder).isDisplayed(); 
	}
	
	public String getCheckoutpagePrdctName()
	{
		String name = driver.findElement(checkoutPrdctName).getText();
		return name.split("-")[0].trim();   
	}
	
	
	
}
