package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Loginpage {
	
	WebDriver driver;

	public Loginpage(WebDriver Idriver) {
		super();
		this.driver = Idriver;
	}

	@FindBy(id="email")
	 
	private WebElement email;
	
@FindBy(id="pass")
	
	private WebElement Password;


@FindBy(id="u_0_l")

private WebElement Loginbuton;

public void verifytitle()
{
	String title=driver.getTitle();
	Assert.assertTrue(title.contains("facebook"), "title did not match");
}
public void login(String UN,String PW)
{
	email.clear();
	email.sendKeys(UN);
	Password.clear();
	Password.sendKeys(PW);
	Loginbuton.click();
	
}


}

