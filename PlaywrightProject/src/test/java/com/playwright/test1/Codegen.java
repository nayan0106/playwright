package com.playwright.test1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class Codegen 
{
public static void main(String[] args) throws InterruptedException {
		//npx playwright codegen https://www.youtube.com/==== codegen command
		
		try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1900, 1080));
		      Page page = context.newPage();
		      page.navigate("https://www.cricbuzz.com/");
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Live Scores")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Upcoming")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("International")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Schedule")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("T20 Leagues")).click();
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Somerset vs Glamorgan, South")).click();
		      
		      Thread.sleep(5000);
		      }
	}

}
