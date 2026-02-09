/*
package utils;

import org.openqa.selenium.WebDriver;

import pages.PageObjectManager;

public class TestContextSetUp {
	
	public WebDriver driver;
	public String landingPageprdctName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	
	public TestContextSetUp()
	{
		testBase=new TestBase();
		pageObjectManager= new PageObjectManager(driver);
	}
	

}
*/

package utils;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import pages.PageObjectManager;

public class TestContextSetUp {

    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public GenericUtils genericUtils;

    public String landingPageprdctName;
   

    public TestContextSetUp(TestBase base) throws IOException 
    {
        this.testBase = base;                       // ✅ Keep injected object
        this.driver = testBase.webDriverManager();  // ✅ Driver is created properly
        this.pageObjectManager = new PageObjectManager(driver);
        //this.genericUtils = new GenericUtils(driver);
    }
}
