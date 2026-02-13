package com.playwright.test1;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import com.microsoft.playwright.Page;

public class Utility
{
	public static byte[] Screenshotcapture(Page page)
			{
		SimpleDateFormat dateformat = new SimpleDateFormat("dd_mm_yy_HH_mm_ss");
		Date date = new Date();
		String newdate = dateformat.format(date);
		  byte[] arr = page.screenshot(new Page.ScreenshotOptions().setFullPage(true).setPath(Paths.get("D:\\Nayan_Eclipse\\PlaywrightProject\\Screenshots"+newdate+".png")));
		   System.out.println(Base64.getEncoder().encodeToString(arr));
		    
		   return arr;
			}

}
 