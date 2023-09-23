package org.demo;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.pojo.BaseClass;
import org.pojo.FBPojo;

public class Sample extends BaseClass{
	
	public static void main(String[] args) throws IOException  {
		
		  launchChromeBrowser();
	      launchURL("https://www.facebook.com/");
	      maxiWindow();
			
		FBPojo fb = new FBPojo();
		
String eMail = getDataFromExcel("C:\\Users\\Hp\\eclipse-workspace\\MavenSasiNarmatha\\Excel\\Fb.xlsx","fbLogin", 3, 0);

String pw = getDataFromExcel("C:\\Users\\Hp\\eclipse-workspace\\MavenSasiNarmatha\\Excel\\Fb.xlsx", "fbLogin", 3, 1);
		
		passValues(fb.getUserName(), eMail);
		
        passValues(fb.getPw(), pw);
		
		fb.getLogin().click();
		
		
		
	}
	}
