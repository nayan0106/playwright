package com.playwright.test1;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Video_Recording 
{

	public static void main(String[] args) {
		
		Playwright play = Playwright.create();
		LaunchOptions lp = new LaunchOptions();
		//for browser
		lp.setChannel("chrome");
		// to open headless browser
		lp.setHeadless(false);
		Browser driver  = play.chromium().launch(lp);
		BrowserContext context1 = driver.newContext(new Browser.NewContextOptions().setRecordVideoSize(1000, 1000).setRecordVideoDir(Paths.get("Recording")));
		Page page = context1.newPage();
		      page.navigate("https://selectorshub.com/xpath-practice-page/");
		      page.waitForTimeout(5000);
		      page.locator("(//*[text()=\"Courses\"])[1]").click();
		      page.waitForTimeout(5000);
		      page.locator("(//*[text()=\"Watch on Udemy\"])[1]").click();
		      page.waitForTimeout(5000);
		      
		      // To get path of video recording
		    String path = page.video().path().toString();
		    
		    System.out.println("Location of the Video recording:---"+path);
		   
		      context1.close();
		      page.close();
			  driver.close();
			      
		      
	}
}
