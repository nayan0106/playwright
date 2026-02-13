package com.playwright.test1;

import java.util.Arrays;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.options.MouseButton;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Locator.PressSequentiallyOptions;

public class Playwright_Imp_Methods
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
	//	page.navigate("https://demo.guru99.com/test/simple_context_menu.html");
		
		page.navigate("https://www.firstcry.com/");
		//click on first elements
	//	page.locator("//li[@class=\"dropdown\"]").first().click();
		
		//click on last elements
	//	page.locator("//li[@class=\"dropdown\"]").last().click();
		//for doubleclick
		//page.locator("//*[text()=\"Double-Click Me To See Alert\"]").dblclick();
		//String dbltext = page.locator("//*[text()=\"Double-Click Me To See Alert\"]").textContent();
		//System.out.println(dbltext);
		//for rightclick
		//page.locator("//*[text()=\"right click me\"]").click(new Locator.ClickOptions().setButton(MouseButton.RIGHT));
		//to print text of element 
//	String text = page.locator("//*[text()=\"right click me\"]").textContent();
//System.out.println(text);
		
//		String text3 = page.locator("(//input[@name=\"btnI\"])[1]").getAttribute("value");
//		System.out.println(text3);
//		
		// To Mouse Hover
	//	page.locator("//div[@class=\"desktop-navLink\"]").first().hover();
//		System.out.println("============================== Text Context=================================");
//		String text1 = page.locator("//body").textContent();
//		System.out.println(text1);
//		
		
//		System.out.println("==============================Output of Inner Text=================================");
//String text2 = page.locator("(//div[@class=\"desktop-navLink\"])[1]").innerText();
//System.out.println(text2);
		
	//boolean visible = page.locator("//*[text()=\"About\"]").isVisible();
		
	//	PlaywrightAssertions.assertThat(page.locator("//*[text()=\"About\"]")).isVisible();
		
//		//all inner text 
//		List<String> alltexts = page.locator("(//*[text()=\"Men\"])[1]").allInnerTexts();
//		for(String products :alltexts)
//		{
//			System.out.println(products);
//		}
		
		// to send the values in textbox/searchbox
		
	//	page.locator("//input[@placeholder=\"Search for products, brands and more\"]").fill("cloths");
		
		// to handle Geolocation popup
		
//		BrowserContext context = driver.newContext(new Browser.NewContextOptions()
//				  .setGeolocation(41.890645221, 12.492349898)
//				  .setPermissions(Arrays.asList("geolocation")));
		
		// to enter the values or character one by one
		page.locator("//input[@placeholder=\"Search for products, brands and more\"]").clear();
		page.locator("//input[@placeholder=\"Search for products, brands and more\"]").pressSequentially("cloths", new PressSequentiallyOptions().setDelay(1000));
		
		
		
	//	page.locator("//a[@class=\"desktop-submit\"]").click();
		
	}
}
