package com.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	
	private static  WebDriver driver;
	
	public Browser(WebDriver Idriver) {
		super();
		this.driver = Idriver;
	}

	private static String URL;
	
	public static WebDriver browser(String browser,String url)
	{
		URL=url;
		if(browser.equalsIgnoreCase("firefox"))
				{
			
			driver=new FirefoxDriver();
					
				}else if (browser.equalsIgnoreCase("chrome"))
				{
					
					System.setProperty("Browser.chrome.driver"," ");
					driver=new ChromeDriver();
					
				}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}
	
	

}
