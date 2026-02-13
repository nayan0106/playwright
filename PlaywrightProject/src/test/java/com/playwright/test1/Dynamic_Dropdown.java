package com.playwright.test1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.options.SelectOption;

public class Dynamic_Dropdown 

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
	
		
			  page.locator("//div[@id=\"withOptGroup\"]").click();
					Locator loc = page.locator("//div[@class=\" css-26l3qy-menu\"]");
	int count=loc.count();
	for(int i=0; i<count; i++)
	{
		String text = loc.nth(i).textContent();
		System.out.print(text);
		
	}
		
		
		
		
}


}
