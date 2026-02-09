package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public LandingPage landingPage;
	public OffersPage offersPage;
	public CheckoutPage checkoutPage;
	
	//PageObjectManager gets driver from  webDriverManager method in TestBase class
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LandingPage getLandingPage() 
	{
		if(landingPage==null)
		{
			landingPage=new LandingPage(driver);
		}
		return landingPage;
	}
	
	public OffersPage getPageOffersPage()
	{
		if(offersPage==null)
		{
			 offersPage = new OffersPage(driver);
		}
		 return offersPage;
	} 
	
	public CheckoutPage getCheckoutPage()
	{
		if(checkoutPage==null)
		{
			checkoutPage = new CheckoutPage(driver);
		}
		 return checkoutPage;
	}
}
   