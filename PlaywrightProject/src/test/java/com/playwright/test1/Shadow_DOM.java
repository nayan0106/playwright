package com.playwright.test1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Shadow_DOM
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
		      page.navigate("https://selectorshub.com/xpath-practice-page/");
		      page.locator("").fill("Nayan Wankhede");
		      
		      
		      
		      
}

	      

}