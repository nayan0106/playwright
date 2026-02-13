package com.playwright.test1;

import org.testng.Assert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class Alert_Handling 
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
		      page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
		      // To get Text from alert PopUp
//		      page.onDialog(dailog ->{
//		    	  String msg = dailog.message();
//		    	  System.out.println("Alert Message:--"+msg);
//		    	  Assert.assertTrue(msg.contains("I am a JS Alert"));
//		    	 //  To Accept alert PopUp
//		    	  dailog.accept();
//		    	  });
//		      Thread.sleep(5000);
//		      page.locator("//*[text()=\"Click for JS Alert\"]").click();
		      
		      
		      // To Dismiss the alert PopUp    
//		      page.onDialog(dailog ->{
//		    	  String msg = dailog.message();
//		    	  System.out.println("Alert Message:--"+msg);
//		    	  Assert.assertTrue(msg.contains("I am a JS Confirm"));
//		    	 //  To Cancel alert PopUp
//		    	  dailog.dismiss();
//		    	  });
//		      Thread.sleep(5000);
//		      page.locator("//*[text()=\"Click for JS Confirm\"]").click();
		      
		      // To Enter value in alert message 
		      
		      page.onDialog(dailog ->{
		    	  String msg = dailog.message();
		    	  System.out.println("Alert Message:--"+msg);
		    	  Assert.assertTrue(msg.contains("I am a JS prompt"));
		    	
		    	  dailog.accept("Nayan Testing");
		    	  });
		      Thread.sleep(5000);
		      page.locator("//*[text()=\"Click for JS Prompt\"]").click();
		      
	}
}
