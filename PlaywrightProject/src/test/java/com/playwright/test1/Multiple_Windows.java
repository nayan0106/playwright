package com.playwright.test1;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;

public class Multiple_Windows {

	
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
		      
		     
		    	 Locator alllinks = page.locator("(//div[@class=\"social-btns\"])[1]//a");
		      
		    	 for(int i=0; i<alllinks.count(); i++)
		    	 {
		    		 alllinks.nth(i).click();
		    	 }
		    	List<Page> allpages = context1.pages();
		    	for(Page p:allpages)
		    	{
		    		String titles = p.title();
		    	//	System.out.println(titles);
		    		if(titles.contains("Facebook"))
		    		{
		    			p.bringToFront();
		    			p.locator("//input[@name=\"email\"]").last().fill("nayanwankhede@gmail.com");
		    			break;
		    		}
		    	}
		    	page.bringToFront();
		    	page.locator("//input[@name=\"email\"]").fill("abc@gmail.com");
		    	context1.close();
		    	
	}
}
