package com.playwright.test1;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class File_Upload
{
	public static void main(String[] args)
	{
		Playwright play = Playwright.create();
		LaunchOptions lp = new LaunchOptions();
		//for browser
		lp.setChannel("chrome");
		// to open headless browser
		lp.setHeadless(false);
		Browser driver  = play.chromium().launch(lp);
		BrowserContext context1 = driver.newContext();
		Page page = context1.newPage();
		      page.navigate("https://the-internet.herokuapp.com/upload");
		      //File Upload for Input TAG
		   //   page.locator("#file-upload").setInputFiles(Path.of("C:\\Users\\SURAJ\\Pictures\\Untitled.png"));
		      
		      //File upload without Input tag for one file upload scenario
		      
		     FileChooser file = page.waitForFileChooser(()-> page.locator("#drag-drop-upload").click());
		   //  file.setFiles(Paths.get("C:\\Users\\SURAJ\\Desktop\\html-css-javascript.png"));
		     
		          //File upload without Input tag for Multiple file upload scenario
		     Path[] fileupload= {
		    		 Paths.get("C:\\Users\\SURAJ\\Desktop\\html-css-javascript.png"),
		    		 Paths.get("C:\\Users\\SURAJ\\Desktop\\html-css-javascript.png"),
		    		 Paths.get("C:\\Users\\SURAJ\\Desktop\\html-css-javascript.png")
		    		 
		     };
		     file.setFiles(fileupload);
		}

	
}
