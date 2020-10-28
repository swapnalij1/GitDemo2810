package Academy.EtoEProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base {
	WebDriver driver;
	public static Logger log= LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		//driver.get(prop.getProperty("url"));
	}
	@Test(dataProvider= "getData")
	public void basePageNavigation(String username, String password,String text) throws IOException
	{
		//driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp= new  LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.login().click();
		//System.out.println("text");
		log.info(text);
		/*driver.navigate().back();
		driver.navigate().back();
		*/
		
		//System.out.println("test completed");
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][3];
		data[0][0]="nonrestricteduser@gmail.com";
		data[0][1]="1234";
		data[0][2]="hi";
		
		data[1][0]="restricteduser@gmail.com";
		data[1][1]="5678";
		data[1][2]="hello";
		return data;
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		log.error("Page closed");
	}
	
	
	
	
	
	

}
