package com.wipro.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

	public static WebDriver driver;
	FileInputStream fis;
	Properties prop;
	String fileName = "/Users/GP20450709/eclipse-workspace/Automation_DemoSite/src/main/resources/config/config.properties";

	public void launchBrowser() {
		try {
			 fis = new FileInputStream(fileName);
		} catch (FileNotFoundException fnf) {
			System.out.println("File path or name is not correct");
		}
		
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(prop.getProperty("Browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/GP20450709/eclipse-workspace/Automation_DemoSite/src/main/resources/driverfiles/chromedriver");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
	}

	}


