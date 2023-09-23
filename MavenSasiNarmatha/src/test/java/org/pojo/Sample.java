package org.pojo;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojo.AdactinHotel;

public class Sample extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		launchChromeBrowser();
		launchURL("http://www.adactin.com/HotelApp/");
		maxiWindow();
		impWait(25000);
		
		AdactinHotel ad = new AdactinHotel();
		
String userName = getDataFromExcel("C:\\Users\\Hp\\eclipse-workspace\\MavenSasiNarmatha\\Excel\\AdactinHotel.xlsx","Hotel Details", 0, 1);
       passValues(ad.getUserName(), userName);

String pw = getDataFromExcel("C:\\Users\\Hp\\eclipse-workspace\\MavenSasiNarmatha\\Excel\\AdactinHotel.xlsx", "Hotel Details", 1, 1);		
	   passValues(ad.getPw(), pw);
	   
	   ad.getLogin().click();
	   
	  // childWindowId(1);
	   
WebElement location = ad.getLocation();
	   checkMultipleOrNot(location);
	   Select s = new Select(location);
	   s.selectByIndex(8);
	   
WebElement rooms = ad.getRooms();
      checkMultipleOrNot(rooms);
      Select s1 = new Select(rooms);
      s1.selectByIndex(2);

String inDate = getDataFromExcel("C:\\Users\\Hp\\eclipse-workspace\\MavenSasiNarmatha\\Excel\\AdactinHotel.xlsx", "Hotel Details", 2, 1);	
		passValues(ad.getInDate(), inDate);
	
String outDate = getDataFromExcel("C:\\Users\\Hp\\eclipse-workspace\\MavenSasiNarmatha\\Excel\\AdactinHotel.xlsx", "Hotel Details", 3, 1);	
       passValues(ad.getOutDate(), outDate);
       
WebElement adultRoom = ad.getAdultRoom();
     checkMultipleOrNot(adultRoom);
     Select s2 = new Select(adultRoom);
     s2.selectByIndex(1);
     
     ad.getSearch().click();
     
     ad.getRadioBut().click();
     
     ad.getConti().click();

String first = getDataFromExcel("C:\\Users\\Hp\\eclipse-workspace\\MavenSasiNarmatha\\Excel\\AdactinHotel.xlsx","Hotel Details", 4, 1);	
       passValues(ad.getFirstName(), first);  

String last = getDataFromExcel("C:\\Users\\Hp\\eclipse-workspace\\MavenSasiNarmatha\\Excel\\AdactinHotel.xlsx","Hotel Details", 5, 1);	
       passValues(ad.getLastName(), last);

String address = getDataFromExcel("C:\\Users\\Hp\\eclipse-workspace\\MavenSasiNarmatha\\Excel\\AdactinHotel.xlsx","Hotel Details", 6, 1);	
       passValues(ad.getAddress(), address);

String card = getDataFromExcel("C:\\Users\\Hp\\eclipse-workspace\\MavenSasiNarmatha\\Excel\\AdactinHotel.xlsx","Hotel Details", 7, 1);	
       passValues(ad.getCardNo(), card);
       
WebElement cardType = ad.getCardType();
       checkMultipleOrNot(cardType);
       Select s3 = new Select(cardType);
       s3.selectByIndex(2);
       
WebElement expiryMonth = ad.getExpiryMonth();
       checkMultipleOrNot(expiryMonth);
       Select s4 = new Select(expiryMonth);
       s3.selectByIndex(4);
       
WebElement expiryYear = ad.getExpiryYear();
       checkMultipleOrNot(expiryYear);
       Select s5 = new Select(expiryYear);
       s3.selectByIndex(14);

String cVV = getDataFromExcel("C:\\Users\\Hp\\eclipse-workspace\\MavenSasiNarmatha\\Excel\\AdactinHotel.xlsx","Hotel Details", 8, 1);	
      passValues(ad.getcVV(), cVV);
		
      ad.getBookNow().click();
      
WebElement orderNo = ad.getOrderNo();
		System.out.println("OrderNo : "+orderNo.getAttribute("value"));
				
setDataInExcel("C:\\Users\\Hp\\eclipse-workspace\\MavenSasiNarmatha\\Excel\\AdactinHotel.xlsx","Hotel Details", 9, 1,orderNo.getAttribute("value"));			
	}

	}

