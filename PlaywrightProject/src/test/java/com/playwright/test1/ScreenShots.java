package com.playwright.test1;

import java.nio.file.Paths;
import java.util.Base64;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;

public class ScreenShots 
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
		      
		   //   page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("Screenshot1.png")));
		      //Screenshot of full page
		      
		//      page.screenshot(new Page.ScreenshotOptions().setFullPage(true).setPath(Paths.get("Screenshot2.png")));
		      
		      //Screenshot of Webelement
		      page.locator("//li[@id=\"menu-item-48\"]").screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("D:\\Nayan_Eclipse\\PlaywrightProject\\Screenshots\\Element.png")));
		      
		      //Capture SS and convert in String
		      
		 Utility.Screenshotcapture(page);
		      page.close();
		  driver.close();
		  
		      
	}

}
