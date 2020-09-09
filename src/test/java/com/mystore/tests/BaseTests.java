package com.mystore.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.mystore.util.EmailGenerator;


public class BaseTests extends EmailGenerator{

	WebDriver driver;

	/**
	 * This function will execute before each Test tag in testng.xml
	 * @param browser
	 * @throws Exception
	 */
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/test/resources/binaries/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/binaries/chromedriver.exe");
			//create chrome instance
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		//Check if parameter passed as 'Edge'
		else if(browser.equalsIgnoreCase("Edge")){
			//set path to Edge.exe
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/src/test/resources/binaries/msedgedriver.exe");
			//create Edge instance
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		//Check if parameter passed as Opera
		else if(browser.equalsIgnoreCase("Opera")) {
			//set path to Opera.exe
			System.setProperty("webdriver.opera.driver", System.getProperty("user.dir")+"/src/test/resources/binaries/operadriver.exe");
			//create Opera instance
			driver = new OperaDriver();
			driver.manage().window().maximize();
		}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	//Closing the browser
	public static void tearDown() {
       // if (driver != null) {
           // driver.close();
            //driver.quit();	
        }
	
	
	}

	
