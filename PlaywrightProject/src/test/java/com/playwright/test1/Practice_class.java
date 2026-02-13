package com.playwright.test1;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Practice_class {

	public static void main(String[] args) {
	
	Playwright play = Playwright.create();
	LaunchOptions lp = new LaunchOptions();
	lp.setChannel("chrome");
	Browser driver = play.chromium().launch(lp);
	BrowserContext context = driver.newContext();
	Page page = context.newPage();
	page.navigate("");
page.locator("").setInputFiles(Path.of(""));
FileChooser file = page.waitForFileChooser(()-> page.locator("").click()
		);

file.setFiles(Paths.get(""));
	
Path[]multiplefiles= {
		Paths.get(""),
		Paths.get("")
		
};
	
file.setFiles(multiplefiles);
	}

}
