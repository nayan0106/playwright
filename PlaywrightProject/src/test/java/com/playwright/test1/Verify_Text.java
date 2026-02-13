package com.playwright.test1;

import java.util.regex.Pattern;

import org.testng.Assert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Verify_Text 
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
	page.navigate("https://freelance-learn-automation.vercel.app/login");
	page.locator(".submit-btn").click();
	//Verify text by using TestNG Assertions
//	String expected="Email and Password is required";
//	String actual = page.locator(".errorMessage").textContent();
//	Assert.assertEquals(actual,expected );
	
	//Verify Text by Playwright Assertions
	
//	PlaywrightAssertions.assertThat(page.locator(".errorMessage")).containsText("Email and Password is required");
	
	PlaywrightAssertions.assertThat(page.locator(".errorMessage")).containsText(Pattern.compile("Password"));
	
}

}
