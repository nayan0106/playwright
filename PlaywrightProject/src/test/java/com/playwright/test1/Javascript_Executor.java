package com.playwright.test1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;

public class Javascript_Executor {
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
	      page.navigate("https://login.yahoo.com/");
	      //page.locator("");
	      
	   //   page.evaluate("document.getElementById(\"persistent\").click()");
	    Locator checkbox = page.locator("#persistent");
	   checkbox.evaluate("checkbox => checkbox.click()");
	      
}
}
