package com.crm.qa.util;



import java.io.IOException;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{
	 
	
	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public static long Page_Load_Timeout=40;
	public static long implicit_wait=30;
	
	public void switchToFrame()
	{
		driver.switchTo().frame("mainpanel");
		
	}

}
