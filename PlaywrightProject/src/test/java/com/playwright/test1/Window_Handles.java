package com.playwright.test1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Window_Handles 
{

	
public static void main(String[] args) {
	
	
	Playwright play = Playwright.create();
	LaunchOptions lp = new LaunchOptions();
	//for browser
	lp.setChannel("chrome");
	// to open headless browser
	lp.setHeadless(false);
	Browser driver  = play.chromium().launch(lp);
	BrowserContext context1 = driver.newContext();
	Page page = context1.newPage();
	      page.navigate("https://freelance-learn-automation.vercel.app/login");
	      
	      Page newpage = context1.waitForPage(()-> {
	    	  page.locator("(//*[@id=\"Layer_1\"])[3]").first().click();
	      });
	      
	      newpage.locator("//input[@name=\"email\"]").last().fill("Nayanwankhede@gmail.com");
	      // to move parent page
	      page.bringToFront();
	       // to move again child page
	      newpage.bringToFront();
	      page.bringToFront();
	      newpage.bringToFront();
}
}
