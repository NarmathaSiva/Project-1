package org.hotel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelLogin {
	
	public static void main(String[] args) {
//browser configuration---------		
	WebDriverManager.chromedriver().setup();

//instantiation--------
	WebDriver driver = new ChromeDriver();
		
//Launch URL	
	driver.get("http://adactinhotelapp.com/");
			
	driver.manage().window().maximize();
			
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
			
	WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
	userName.sendKeys("Narmatha123");
			
	WebElement pw = driver.findElement(By.xpath("//input[@name='password']"));
	pw.sendKeys("parithi123");
			
	WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
	login.click();
		    
	WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
	Select s = new Select(location);
    s.selectByVisibleText("Paris");
		    
    WebElement rooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
	Select s1 = new Select(rooms);
	s1.selectByIndex(1);
		    
	WebElement inDate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	inDate.sendKeys("17/05/2023");
		    
	WebElement outDate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
    outDate.sendKeys("18/05/2023");
		    
	WebElement adultRoom = driver.findElement(By.xpath("//select[@name='adult_room']"));
    Select s2 = new Select(adultRoom);
	s2.selectByIndex(1);
		    
	WebElement search = driver.findElement(By.xpath("//input[@name='Submit']"));
	search.click();
		    
	WebElement radioBut = driver.findElement(By.xpath("(//input[@value='1'])[1]"));
	radioBut.click();
		    
	WebElement conti = driver.findElement(By.xpath("//input[@name='continue']"));
	conti.click();
		    
    Actions a = new Actions(driver);
		    
	for(int i=0;i<=7;i++) {
		 a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
}
	 WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
     firstName.sendKeys("Sasi");
		    
	 WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
	 lastName.sendKeys("Kumar");
		    
	 WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
	 address.sendKeys("Chennai");
			
	 WebElement cardNo = driver.findElement(By.xpath("//input[@name='cc_num']"));
	 cardNo.sendKeys("1234 3456 7654 8790");
				
	 WebElement cardType = driver.findElement(By.xpath("//select[@name='cc_type']"));	
	 Select s3 = new Select(cardType);
	 s3.selectByIndex(2);
			
	 WebElement expiryMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	 Select s4 = new Select(expiryMonth);
	 s4.selectByVisibleText("May");
				
	 WebElement expiryYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	 Select s5 = new Select(expiryYear);
	 s5.selectByValue("2024");
			
	 WebElement cVV = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	 cVV.sendKeys("999");
			
	 WebElement bookNow = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
	 bookNow.click();
			
	 WebElement orderNo = driver.findElement(By.xpath("//input[@name='order_no']"));
	 System.out.println("Order No : "+orderNo.getAttribute("value"));
			
			
}
}
