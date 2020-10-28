package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By title= By.xpath("//h2[contains(text(),'Featured Courses')]");
	By navigation=By.xpath(" //nav[@class='navbar-collapse collapse']");
	
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}



	public WebElement getLogin()
	{
		return driver.findElement(signin);
		
		
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
		
		
	}
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(navigation);
	}
	
	
	
	
	
}
