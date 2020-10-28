package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By emailid=By.xpath("//input[@id='user_email']");
	By password=By.xpath("//input[@id='user_password']");
	By login=By.xpath("//input[@value='Log In']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(emailid);
		
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement login()
	{
		return driver.findElement(login);
		
	}
	
	
}
