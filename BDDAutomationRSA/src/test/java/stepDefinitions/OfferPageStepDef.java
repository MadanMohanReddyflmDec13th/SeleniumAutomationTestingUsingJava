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
import pages.LandingPage;
import pages.OffersPage;
import pages.PageObjectManager;
import utils.TestContextSetUp;

public class OfferPageStepDef {
	
public WebDriver driver;
public String landingPageprdctName;
public String ofrPagePrdctName;
TestContextSetUp testContextSetUp;
PageObjectManager pageObjectManager;

//Single responsibility principle

public OfferPageStepDef(TestContextSetUp testContextSetUp )
{
	this.testContextSetUp = testContextSetUp; 
}

	/*
	@Given("user is on the landing page of the GreenKart application")
	public void user_is_on_the_landing_page_of_the_green_kart_application() {
	    driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    driver.manage().window().maximize();    
	}
	
	
	@When("user searches with the shortname {string} and extracts actual name of the product")
	public void user_searches_with_the_shortname_and_extracts_actual_name_of_the_product(String shortName) throws InterruptedException {
	   driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	   Thread.sleep(3000); 
	   landingPageprdctName = driver.findElement(By.xpath("//h4[text()='Tomato - 1 Kg']")).getText().split("-")[0].trim();
	   System.out.println(landingPageprdctName + " is extracted from Home page");
	   
	}
	*/
	
	
	@Then("user searches with same shortname {string} in the offers page")
	public void user_searches_with_same_shortname_in_the_offers_page(String shortName ) throws InterruptedException {
	  /*  String parentWind = testContextSetUp.driver.getWindowHandle(); 
	    testContextSetUp.driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
	    Set <String> allWindIDs= testContextSetUp.driver.getWindowHandles(); 
	    for(String var:allWindIDs)
	    {
	    	testContextSetUp.driver.switchTo().window(var);
	    	if(testContextSetUp.driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
	    	{
	    		break;
	    	}
	    }  */
		    
	    	switchToWindow("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	    	
	    	//OffersPage offersPage= new OffersPage(testContextSetUp.driver);
	    	OffersPage offersPage = testContextSetUp.pageObjectManager.getPageOffersPage();
	    	offersPage.searchItem(shortName);
	    	Thread.sleep(3000); 
	    	ofrPagePrdctName =offersPage.getProductName(); 
	         
	}
	
	public void  switchToWindow(String title )
	{
	    String parentWind = testContextSetUp.driver.getWindowHandle(); 
	    //pageObjectManager= new PageObjectManager(testContextSetUp.driver);
	    LandingPage landingPage= testContextSetUp.pageObjectManager.getLandingPage();
	    landingPage.selectTopDealsPage(); 
	    Set <String> allWindIDs= testContextSetUp.driver.getWindowHandles(); 
	    for(String var:allWindIDs)
	    {
	    	testContextSetUp.driver.switchTo().window(var);
	    	if(testContextSetUp.driver.getCurrentUrl().equalsIgnoreCase(title))
	    	{ 
	    		break;
	    	}
	    }
	}
	
	@Then("validate productname in offers page matches with landing Page") 
	public void validate_productname_in_offers_page_matches_with_landing_Page() {
	    Assert.assertEquals(testContextSetUp.landingPageprdctName, ofrPagePrdctName);  
	    
	    //testContextSetUp.driver.quit();   //it is implemented in Hooks class
	}  
	
}
