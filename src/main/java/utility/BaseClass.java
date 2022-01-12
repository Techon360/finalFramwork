package utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public WebDriver driver;
	Properties prop;
	public Logger logger = LogManager.getLogger(this.getClass().getSimpleName());
	@BeforeTest
	public WebDriver startApp() throws FileNotFoundException, IOException
	{
		
	    prop=new Properties();
		prop.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties"));
		String browserName=prop.getProperty("browser");
		String url=prop.getProperty("url");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
		    
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	@AfterClass
	public void goToLoginpage() throws InterruptedException {

		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
	}
	
	public String capture(String testCaseName, WebDriver driver) throws IOException
	{
	   TakesScreenshot ts= (TakesScreenshot)driver;
	   File source=ts.getScreenshotAs(OutputType.FILE);
	   String destination=System.getProperty("user.dir")+"\\ExtentReport\\"+testCaseName+".png";
	   File destinationFile= new File(destination);
	   FileUtils.copyFile(source, destinationFile);
	   return destination;
	}
	
}
