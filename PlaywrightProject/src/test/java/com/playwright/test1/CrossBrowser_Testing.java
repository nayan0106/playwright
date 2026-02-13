package com.playwright.test1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class CrossBrowser_Testing 
{

	Browser browser;
	Page page;
	Playwright play;
	@Parameters("Browsername")
	@BeforeMethod
	public void setup(@Optional("Firefox")  String browsername)
	{
		 play = Playwright.create();
		BrowserType browsertype = null ;
		if(browsername.equalsIgnoreCase("Chrome"))
		{
		 browsertype = play.chromium();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			browsertype	=play.firefox();
		}
		else if(browsername.equalsIgnoreCase("msedge"))
		{
			browsertype=play.webkit();
		}
		 browser = browsertype.launch(new BrowserType.LaunchOptions().setHeadless(false));
		 page = browser.newPage();
		
	}
	
	@Test
	public void login() throws InterruptedException
	{
		page.navigate("https://www.google.com/");
		Thread.sleep(3000);
		System.out.println(page.title());
		
	}
	@AfterMethod
	public void teardown() 
	{
		page.close();
		
	}
}
