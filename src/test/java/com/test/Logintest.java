package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.pages.Loginpage;
import com.sele.Browser;



public class Logintest {
	WebDriver driver;

	@Test
	public void testlogin()
	{
		driver=	Browser.browser("firefox", "https://www.facebook.com/");
		Loginpage l=PageFactory.initElements(driver, Loginpage.class);
		l.login("manu@gmail.com", "manu");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
