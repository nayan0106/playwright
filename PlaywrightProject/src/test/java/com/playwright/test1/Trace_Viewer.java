package com.playwright.test1;

import java.nio.file.Paths;
import java.util.regex.Pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Trace_Viewer 
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
		context1.tracing().start(new Tracing.StartOptions().setScreenshots(true).setSnapshots(true).setSources(true));
		Page page = context1.newPage();
		 page.navigate("https://selectorshub.com/xpath-practice-page/");
	      page.waitForTimeout(5000);
	      page.locator("(//*[text()=\"Courses\"])[1]").click();
	      page.waitForTimeout(5000);
	      page.locator("(//*[text()=\"Watch on Udemy\"])[1]").click();
	      page.waitForTimeout(5000);
	    //  PlaywrightAssertions.assertThat(page).hasURL(Pattern.compile("login"));
	      context1.tracing().stop(new Tracing.StopOptions().setPath(Paths.get("Tracing.zip")));
	      page.close();
	      driver.close();
	      context1.close();
	      
	}

}
