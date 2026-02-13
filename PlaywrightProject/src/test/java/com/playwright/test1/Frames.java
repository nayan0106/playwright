package com.playwright.test1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.FrameLocator;

public class Frames 
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
		page.setDefaultTimeout(100000);
		page.navigate("https://www.w3schools.com/html/html_iframe.asp");
		page.locator("(//input[@id=\"tnb-google-search-input\"])[1]").fill("Java");
		page.locator("(//div[@id=\"tnb-google-search-submit-btn\"])[1]").click();
		FrameLocator frame1 = page.frameLocator("//iframe[@title=\"W3Schools HTML Tutorial\"]");
		frame1.locator("(//*[text()=\"CSS\"])[1]").click();
		//frame1.locator("").click();

	}

}
