package com.playwright.test1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class Handle_Autosuggestions {

public static void main(String[] args) 
{
	
	
	try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false).setSlowMo(500));
	      BrowserContext context = browser.newContext();
	      Page page = context.newPage();
	      page.navigate("https://www.google.com/");
	      page.locator("//textarea[@title=\"Search\"]").fill("Mukesh Ambani");
	     Locator list = page.locator("//ul[@class=\"G43f7e\"]//li");
	     System.out.println(list.count());
	     
	     for(int i=0; i<list.count(); i++)
	     {
	    	 
	    	 String text = list.nth(i).textContent();
	    	 System.out.println(text);
	     }
	    
	      }
	
	
}


}
