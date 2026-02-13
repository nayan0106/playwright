package com.playwright.test1;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;

public class Fill_Dropdown_RadioButton 
{
	public static void main(String[] args) throws InterruptedException {
		
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
		
page.getByText("New user? Signup").click();

		PlaywrightAssertions.assertThat(page.locator(".submit-btn")).isDisabled();
		
		page.locator("#name").fill("Nayan Wankhede");
		page.locator("#email").fill("nayanrandeom1223@gmail.com");
		page.locator("#password").fill("123456780");
		
		// Pause method is used to stop the execution, after clicking on resume button the script will run 
		page.pause();
		page.locator("//*[text()=\"TestNG\"]").click();
		PlaywrightAssertions.assertThat(page.locator("//*[text()=\"TestNG\"]")).isChecked();
		page.locator("//input[@value=\"Female\"]").click();
		page.selectOption("#state", "Maharashtra");
		page.getByText("Swimming").click();
		page.waitForTimeout(5000);
	}

}
