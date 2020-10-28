package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	

	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		 prop= new Properties();
		FileInputStream fis= new FileInputStream("D:\\SeleniumjavaProjects\\EtoEProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browserName= prop.getProperty("browser");
		
		if (browserName.equals("chrome"))
		{


		}
		else if (browserName.equals("firefox"))
		{
			System.out.println("fierfox browser");
		}
		else if (browserName.equals("IE"))
		{
			System.out.println("IE browser");
		}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
		
	}
	
	public String getScreenshotPath(String testcaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		//File source=ts.getScreenshotAs(OutputType.FILE);
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testcaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
		
	}
	
	
}
