package com.playwright.test1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;

public class Static_Dropdown 
{
public static void main(String[] args) {
		
		Playwright play = Playwright.create();
		LaunchOptions lp = new LaunchOptions();
		//for browser
		lp.setChannel("chrome");
		// to open headless browser
		lp.setHeadless(false);
		Browser driver  = play.chromium().launch(lp);
		BrowserContext context1 = driver.newContext(new Browser.NewContextOptions().setViewportSize(1900, 1080));
		Page page = context1.newPage();
		page.navigate("https://demoqa.com/select-menu");
		// first method to select value from dropdown
//		Locator select = page.locator("#oldSelectMenu");
//		select.selectOption("Black");
		page.setDefaultTimeout(60000);
		// second method to select value from dropdown
		//	page.selectOption("#oldSelectMenu", "White");
		
			//  third method to select value from dropdown by setLable
			//Locator select = page.locator("#oldSelectMenu");
		//	select.selectOption(new SelectOption().setLabel("Green"));
		
		//  Fourth method to select value from dropdown by setIndex
//					Locator select = page.locator("#oldSelectMenu");
//					select.selectOption(new SelectOption().setIndex(8));
					//  Fifth method to select value from dropdown by setIndex
					Locator select = page.locator("#oldSelectMenu");
					select.selectOption(new SelectOption().setValue("3"));
		
		
		
		
		
		
}

}
