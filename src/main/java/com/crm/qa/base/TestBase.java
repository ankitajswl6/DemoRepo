package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public	static Properties prop;
	
	
	public TestBase() throws IOException
	{
		prop=new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\Ankita Jaiswal\\Eclipse_WORKSPACE\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		prop.load(ip);
	
	}
	
	public static void initialization()
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankita Jaiswal\\Downloads\\SETUPS\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS) ;
		
		driver.get(prop.getProperty("url"));
	}
		
	
	
	}

