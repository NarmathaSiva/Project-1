package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojo.AdactinHotel;
import org.pojo.BaseClass;

public class Sample extends BaseClass {
	
@BeforeClass
public static void bC() {
    launchChromeBrowser();
    launchURL("http://www.adactin.com/HotelApp/");
}
@Before
public void before() {
	getDateTime();
}	
@Test
public void tc1() {
getPageTitle();
impWait(20000);
}
@Test
public void tc2() {
AdactinHotel ad = new AdactinHotel();

WebElement userName = ad.getUserName();
userName.sendKeys("Narmatha123");

WebElement pw = ad.getPw();
pw.sendKeys("parithi123");

WebElement login = ad.getLogin();
login.click();

WebElement location = ad.getLocation();
Select s = new Select(location);
s.selectByIndex(4);
}
@Test
public void tc3() {
	
}
@Test
public void tc4() {

}
@After
public void after() {
getDateTime();
}
@AfterClass
public static void aF() {
	System.out.println("afterClass");
}
	
}