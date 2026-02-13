package com.playwright.test1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Frame;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Silder
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
		      page.navigate("https://jqueryui.com/slider/");
		     FrameLocator frame = page.frameLocator(".demo-frame");
		     Locator slider = frame.locator("//*[contains(@class,\"ui-slider-handle\")]");
		     slider.focus();
		     for(int i=0; i<10; i++)
		     {
		    	 page.keyboard().press("ArrowRight");
		     }
		     

	}

}
