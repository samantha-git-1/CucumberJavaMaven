package com.co.project.base;

import org.openqa.selenium.WebDriver;

public class BaseTest {
	
	private WebDriver driver;
	private String url;

/*	
	// Set browser & Initialize WebDriver object (for Test classes)
	@Parameters({ "browser", "environment" })
	@BeforeMethod
	public void initialize(@Optional("Chrome") String browser, @Optional("UAT") String env) { 
		// '@Optional' for running the test itself on Chrome / UAT	[ '@Parameters' is used for running from config.xml ]	
		url = setUrl(env);
		
		if (browser.equalsIgnoreCase("Chrome")) {
            // Set web-driver path
			System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Google\\ChromeDriver\\chromedriver.exe");
            // Start browser session
			driver = new ChromeDriver();   
            driver.get(url);
        } else if (browser.equalsIgnoreCase("Edge")) {
        	System.setProperty("webdriver.edge.driver", "C:\\ProgramData\\Microsoft\\EdgeDriver\\msedgedriver.exe");
            driver = new EdgeDriver();    
            driver.get(url);
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\ProgramData\\Mozilla\\GeckoDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(url);
        }  
		
		Utils.positionWindow(1080, 0, driver);
		Utils.resizeWindow(980, 1080, driver);
	} // Ends 'setup()' 
	
	// Terminate  WebDriver object
	@AfterMethod
	public void tearDown() {
		if (null != driver) {
			driver.close();
			driver.quit();
		}		
	} 
*/
	
	// Set URL per requested environment
	public String setUrl(String env) {
		if (env.equalsIgnoreCase("SIT")) {
			url = "https://wellsofficesit.ceo.wellsfargo.com";        	
		} else if (env.equalsIgnoreCase("UAT")) {
			url = "https://wellsofficeuat.ceo.wellsfargo.com";        	
		} else if (env.equalsIgnoreCase("ProdFix")) {
			url = "https://wellsofficefix.ceo.wellsfargo.com";        	
		} else if (env.equalsIgnoreCase("Production")
				|| env.equalsIgnoreCase("Production-Shoreview")
				|| env.equalsIgnoreCase("Production-Tempe")) { // Shoreview & Tempe for TrafficVerification
			url = "https://wellsoffice.ceo.wellsfargo.com";        	
		} 
		return url;
	}
	
	// Get driver -called by Test classes
	public WebDriver getDriver() {
		return driver;
	}
	
} // Ends class 'BaseTest'
