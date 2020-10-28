package Academy.EtoEProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateNavigationBar extends Base {
	public static Logger log= LogManager.getLogger(Base.class.getName());
	WebDriver driver;
	@Test
	public void getNavigationBar() throws IOException
	
	{
		
		
		LandingPage l = new LandingPage(driver);
		Assert.assertTrue(l.getNavigationBar().isDisplayed());		
		log.info("Navigation bar retrived successfully");
		
	}
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Page loaded Suceessfully");
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		log.info("Page closed");
	}
	
}
