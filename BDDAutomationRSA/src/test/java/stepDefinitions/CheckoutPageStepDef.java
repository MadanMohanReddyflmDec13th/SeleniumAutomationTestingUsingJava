package stepDefinitions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;
import pages.LandingPage;
import utils.TestContextSetUp;

public class CheckoutPageStepDef {

	public WebDriver driver;
	//public String landingPageprdctName;
	public CheckoutPage checkoutPage;
	public LandingPage landingPage;
	TestContextSetUp testContextSetUp;

	public CheckoutPageStepDef(TestContextSetUp testContextSetUp) 
	{
		this.testContextSetUp = testContextSetUp;
		checkoutPage = testContextSetUp.pageObjectManager.getCheckoutPage();
		landingPage = testContextSetUp.pageObjectManager.getLandingPage();
	}
	
	/* Commented it because of duplicate step
	@When("user searches with the shortname {string} and extracts actual name of the product")
	public void user_searches_with_the_shortname_and_extracts_actual_name_of_the_product(String shortName) throws InterruptedException 
	{
	   
	   LandingPage landingPage= testContextSetUp.pageObjectManager.getLandingPage();
	   landingPage.searchItem(shortName);  
	   Thread.sleep(3000); 
	   testContextSetUp.landingPageprdctName = landingPage.getProductName().split("-")[0].trim();
	   //System.out.println(testContextSetUp.landingPageprdctName + " is extracted from Home page");   
	}
	*/
	
	@When("added {string} items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String qty) 
	{
	   int quantity= Integer.parseInt(qty); 
	   landingPage.increaseQuantity(quantity);
	   landingPage.clickAddToCart();
	   
	   System.out.println(quantity + " items added to cart"); 
	    
	}

	@Then("the user proceeds to checkout and validate the {string} items in checkout page")
	public void the_user_proceeds_to_checkout_and_validate_the_items_in_checkout_page(String name)
	{
		checkoutPage.checkOutItems();
		//Assertion to extract name from screen and compare with name  
		Assert.assertEquals(checkoutPage.getCheckoutpagePrdctName(),testContextSetUp.landingPageprdctName);  
		
	}
	
	@Then("verify user has ability to enter promo code and place order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_order()
	{
		Assert.assertTrue(checkoutPage.verifyPromoBtn());
		Assert.assertTrue(checkoutPage.verifyPlaceOrder());
	}	

}
