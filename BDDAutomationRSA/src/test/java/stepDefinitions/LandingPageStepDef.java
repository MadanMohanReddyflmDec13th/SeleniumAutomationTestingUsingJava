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
import utils.TestContextSetUp;

public class LandingPageStepDef {
	
public WebDriver driver;
public String landingPageprdctName;
public String ofrPagePrdctName;
TestContextSetUp testContextSetUp;
LandingPage landingPage;

public LandingPageStepDef(TestContextSetUp testContextSetUp )
{
	this.testContextSetUp = testContextSetUp;
	landingPage= testContextSetUp.pageObjectManager.getLandingPage(); 
}

	@Given("user is on the landing page of the GreenKart application")
	public void user_is_on_the_landing_page_of_the_green_kart_application() {
		/*
		  testContextSetUp.driver = new ChromeDriver();
		  testContextSetUp.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		  testContextSetUp.driver.manage().window().maximize();  
		 */	  
	}
	 
	
	@When("user searches with the shortname {string} and extracts actual name of the product")
	public void user_searches_with_the_shortname_and_extracts_actual_name_of_the_product(String shortName) throws InterruptedException {
	   
	   //LandingPage landingPage= new LandingPage(testContextSetUp.driver);
	   
	   landingPage.searchItem(shortName);  
	   Thread.sleep(3000); 
	   testContextSetUp.landingPageprdctName = landingPage.getProductName().split("-")[0].trim();
	   System.out.println(testContextSetUp.landingPageprdctName + " is extracted from Home page");
	    
	}
	  
	
	/*
	@Then("user searches with same shortname {string} in the offers page")
	public void user_searches_with_same_shortname_in_the_offers_page(String shortName ) throws InterruptedException {
	    String parentWind = driver.getWindowHandle(); 
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
	    Set <String> allWindIDs= driver.getWindowHandles(); 
	    for(String var:allWindIDs)
	    {
	    	driver.switchTo().window(var);
	    	if(driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
	    	{
	    		break;
	    	}
	    }
	    
	    	driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(shortName);
	    	Thread.sleep(3000);
	    	ofrPagePrdctName =driver.findElement(By.xpath("//td[text()='Tomato']")).getText(); 
	    
	}
	
	@Then("validate productname in offers page matches with landing Page") 
	public void validate_productname_in_offers_page_matches_with_landing_Page() {
	    Assert.assertEquals(landingPageprdctName, ofrPagePrdctName);  
	    
	    driver.quit();  
	}
	*/
}
