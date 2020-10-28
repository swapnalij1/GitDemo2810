package Academy.EtoEProject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import resources.Base;
public class GetTitle extends Base{
	WebDriver driver;
	
	public static Logger log= LogManager.getLogger(Base.class.getName());

	@Test
	public void pageTitle() throws IOException
	{
		
		LandingPage l = new LandingPage(driver);
		
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES123");
		//Assert.assertTrue(driver.findElement(By.xpath(" //nav[@class='navbar-collapse collapse']")).isDisplayed());
		log.info("Title retrived successfully");
		log.info("Title retrived successfully");
		log.info("Title retrived successfully");
		log.info("Title retrived successfully");
		log.info("Title retrived successfully");
		
	}

	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Page loaded Suceessfully");
	}
	public void initialize1() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Page loaded Suceessfully");
	}
	public void initialize2() throws IOException
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
		log.info("Page closed");
		log.info("Page closed");
		log.info("Page closed");
		log.info("Page closed");
		
	}
}
