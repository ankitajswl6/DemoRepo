package com.crm.qa.pages;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//OR
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div/div/input")
	WebElement LoginBtn;
	
	@FindBy(xpath="//*[@id=\"navbar-collapse\"]/ul/li[2]/a/font")
	WebElement SignUpBtn;
	
	@FindBy(xpath="//html/body/div[2]/div/div[1]/a")
	WebElement FreeCrmLogo;
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);//this is use to initialize with current class object
	}
	//Actions
	public String validateLoginPage()//To verify title of thepage
	{
		return driver.getTitle();
		
	}
	public boolean vaidateCrmImage()//To verify title of thepage
	{
		return FreeCrmLogo.isDisplayed();
				
	}
	public HomePage login(String un,String pwd) throws IOException//To verify title of thepage
			{
			username.sendKeys(un);
			password.sendKeys(pwd);
			LoginBtn.submit();
			
			return new HomePage();
		}
	} 

