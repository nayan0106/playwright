package com.playwright.test1;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Download;

public class File_Download 
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
	      page.navigate("https://the-internet.herokuapp.com/download");
	      
	      
	     Download download = page.waitForDownload(()->
	      {
	    	  page.locator("//*[text()=\"TestFile.docx\"]").click();
	      });
/*System.out.println(download.suggestedFilename());
System.out.println(download.url());
System.out.println(download.path());
*/
	     
	     
	    String path = System.getProperty("user.dir")+"/downloadfiles/"+download.suggestedFilename();
	    System.out.println(path);
	    download.saveAs(Paths.get(path));
	    
	    if(path.endsWith(".docx"))
	    {
	    	System.out.println("File name verified");
	    }
	    else
	    {
	    	System.out.println("File name Unverified");
	    }
	    page.close();
}
}
