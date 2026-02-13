package com.playwright.test1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Action_Keywords
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
		      page.locator("//input[@name=\"email1\"]").fill("nayanwankhede123@gmail.com");
		      page.keyboard().down("Control");
		      page.keyboard().press("a");
		      page.keyboard().up("Control");
		      page.keyboard().down("Control");
		      page.keyboard().press("c");
		      page.keyboard().up("Control");
		      page.keyboard().press("Enter");
		      page.keyboard().press("Tab");
		      page.keyboard().down("Control");
		      page.keyboard().press("v");
		      page.keyboard().up("Control");
		    //  page.close();
		      
		      
	}
}
