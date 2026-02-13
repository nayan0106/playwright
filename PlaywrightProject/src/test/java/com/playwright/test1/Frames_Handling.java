package com.playwright.test1;

import java.awt.Frame;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.FrameLocator;

public class Frames_Handling 
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
		      page.navigate("https://demo.automationtesting.in/Frames.html");
//		      page.locator("//*[text()=\"Account\"]").click();
//		      page.locator("//button[@class=\"actionButton___b38b8d  action___3e4725\"]").click();
		      
		    //  page.locator("(//input[@type=\"text\"])[1]").fill("2134567890");
		   //   page.locator("//iframe[@name=\"a-d0ji6ednmlbb\"]").click();
		      page.waitForTimeout(100000);
		      
		      List<com.microsoft.playwright.Frame> allframes = page.frames();
		      System.out.println("list of all frames"+allframes.size());
		      FrameLocator frame = page.frameLocator("//iframe[@id=\"singleframe\"]");
		      frame.locator("(//input[@type=\"text\"])[1]").fill("234567890");
		      
		      ////iframe[@title="Sign in with Google Button"]
	}
	
	
	//div[@class="rc-anchor-center-item rc-anchor-checkbox-holder"]
}
