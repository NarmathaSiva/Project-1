package org.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static  WebDriver driver;
	public static Robot r;
	public static Actions a;
	public static Alert a1;
	public static JavascriptExecutor js;
	public static Select s ;
	
	public static void launchChromeBrowser() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	}
	public static void getPageTitle() {
      String title = driver.getTitle();
      System.out.println("Page Title : "+title);
	}
	public static String getCurrentURL() {
	  String currentURL = driver.getCurrentUrl();
	  System.out.println("Current Page URL : "+currentURL);
	return currentURL;
	}
	public static void closeBrowser() {
	  driver.close();
	}
   public static void maxiWindow() {
      driver.manage().window().maximize();
    }
   public static void miniWindow() {
	  driver.manage().window().minimize();
    }
   public static void launchURL(String uRL) {
	  driver.get(uRL);  
    }
   public static void passValues(WebElement element,String value) {
	  element.sendKeys(value);
    }
   public static void clickElement(WebElement element) {
	  element.click();
    }
   public static void getTheText(WebElement element) {
	  String text = element.getText();
	  System.out.println("Text Value : "+text);
    }
   public static void getTheAttributeValue(WebElement element,String value) {
	String attribute = element.getAttribute(value);
	System.out.println("Attribute Value of Element : "+attribute);
    }
   
//ACTIONS---CLASS---------------
   public static void movingCursor(WebElement target) {
	   a = new Actions(driver);
     a.moveToElement(target).perform();
    }
   public static void dragTheElementDrop(WebElement source,WebElement target) {
	   a = new Actions(driver);
	 a.dragAndDrop(source, target).perform();
    }
   public static void toSelect(WebElement target) {
	   a = new Actions(driver);
     a.doubleClick(target).perform();
   }
   public static void toRightClick(WebElement target) {
	   a = new Actions(driver);
	a.contextClick(target).perform();
   }
   
//ROBOT--CLASS-----------------------------
   public static void toPressAndReleaseKeys(Robot r,int arg) throws AWTException {
	   r = new Robot();
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_C);
	 
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 r.keyRelease(KeyEvent.VK_C);
   }
   
//ALERTS---------------------------
   public static void toAcceptAlert() {
	   a1 = driver.switchTo().alert();
	a1.accept();
   }
   public static void toDismissAlert() {
	   a1 = driver.switchTo().alert();
	a1.dismiss();
   }
   public static void passTheValues(String value) {
	   a1 = driver.switchTo().alert();
	a1.sendKeys(value);
   }
   public static void toGetText() {
	  a1 = driver.switchTo().alert();
	String text = a1.getText();
	System.out.println("Present Text : "+text);
   }
  
//JAVASCRIPT COMMOND----------------
   public static void jsSendKeys(WebElement element,String values) {  
	  js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].setAttribute('value',"+values+")", element);
   }
   public static void jsClick(WebElement element) {
	  js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()", element);
   }
   public static void jsGetAttribute(WebElement element) {
	  js = (JavascriptExecutor)driver;
	  Object getAttribute = js.executeScript("return arguments[0].getAttribute('value')", element);
	  System.out.println(getAttribute);
   }
   public static void scrollToEle(WebElement element) {
	  js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView()", element);
   }
  
//FRAME-----------------------
   public static void switchToFrame(WebElement frame) {
	driver.switchTo().frame(frame);
   }
   public static void toParenltFrame() {
	driver.switchTo().parentFrame();
   }
   public static void toMainFrame() {
    driver.switchTo().defaultContent();
   }
  
//WINDOWS HANDLEING---------------
   public static void parentWindowId() {
	String parentId = driver.getWindowHandle();
	System.out.println("Parent Window Id : "+parentId);
   }
   public static void childWindowId(int windowIndex) {
	Set<String> childId = driver.getWindowHandles();

//TO FETCH ALL ID------------	
	System.out.println("All Child Id : "+childId);
	
	List<String> l =new ArrayList();
	l.addAll(childId);
	String child = l.get(windowIndex);
	System.out.println(child);
	driver.switchTo().window(child);
   }
  
//THREAD SLEEP---------------------------   
   public static void threadSleep(int duration) throws InterruptedException {
	Thread.sleep(duration);
   }
  
//WAITS-----------------------
   public static void impWait(long duration) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
   }
   public static void explicitWebDriverWait(long duration,WebElement element) {
	WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(duration));
	w.until(ExpectedConditions.alertIsPresent());
	w.until(ExpectedConditions.elementToBeClickable(element));
	w.until((ExpectedConditions.elementToBeSelected(element)));
   }
   public static void explicitFluent(long duration,WebElement element) {
	FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(5000)).pollingEvery(Duration.ofMillis(duration)).ignoring(Exception.class);
	f.until(ExpectedConditions.alertIsPresent());
	f.until(ExpectedConditions.elementToBeClickable(element));
	f.until((ExpectedConditions.elementToBeSelected(element)));
   }
  
//DROPDOWN----------------------
   public static void launchNavigateTo(String url) {
	driver.navigate().to(url);
   }
   public static void checkMultipleOrNot(WebElement option) {
	s = new Select(option);
	if(s.isMultiple()){
        System.out.println("Drop Down is Multiple");
	}
	else {
		System.out.println("Drop Down is Single");
	}
	}
   public static void getAllOptions(WebElement option) {
	 s = new Select(option);
	 List<WebElement> element = s.getOptions();
	 for(int i=0;i<element.size();i++) {
		 System.out.println(element.get(i).getText());
	 }
   }
    public static void allSelectedOptions(WebElement option) {
	   s = new Select(option);
	   List<WebElement> allSelected = s.getAllSelectedOptions();
	   for(WebElement z:allSelected) {
		   System.out.println(z.getText());
	   }	   
    }
    public static void firstSelectedOption(WebElement option) {
     s = new Select(option);
     WebElement firstSelected = s.getFirstSelectedOption();
     System.out.println("First Selected Option : "+firstSelected.getText());
    }
   
//WEBTABLE---------------------
    public static void webTableMethods(int table1,int rows,int datsa,int heads) {
	List<WebElement> allTable = driver.findElements(By.tagName("table"));
	WebElement table = allTable.get(table1);
	 
	List<WebElement> allRow = table.findElements(By.tagName("tr"));
	WebElement row = allRow.get(rows);
	
	List<WebElement> allData = row.findElements(By.tagName("td"));
	WebElement data = allData.get(heads);
	System.out.println(data.getText());
	
	List<WebElement> allHeading = driver.findElements(By.tagName("th"));
	WebElement heading = allHeading.get(datsa);
	System.out.println(heading.getText());
    }
    
    //JUNIT --TO READ EXCEL SHEET 
    public static String getDataFromExcel(String location,String sheet,int rowInd,int cellInd) throws IOException   {
		
    	File f = new File(location);
    	FileInputStream fin = new FileInputStream(f);
    	
    	Workbook book = new XSSFWorkbook(fin);
        Sheet s = book.getSheet(sheet);
        
        Row r = s.getRow(rowInd);
        Cell cell = r.getCell(cellInd);
        
        int type = cell.getCellType();
        String name="";
        
        if (type==1) {
        	 name = cell.getStringCellValue();
			System.out.println(name);
		}
        else if (DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			 name = sim.format(d);
			System.out.println(name);
		} 
        else {
			double d = cell.getNumericCellValue();
			long l = (long)d;
			 name = String.valueOf(l);
			System.out.println(name);
		}
		return name; 
	}
    
    //JUNIT -- TO WRITE EXCEL SHEET 
    public static void setDataInExcel(String location,String sheet,int rowInd,int cellInd,String value) throws IOException   {
		
    	File f = new File(location);
    	FileInputStream fin = new FileInputStream(f);
    	
    	Workbook book = new XSSFWorkbook(fin);
        Sheet s = book.getSheet(sheet);
        
        Row r = s.createRow(rowInd);
        Cell cell = r.createCell(cellInd);
        
        cell.setCellValue(value);
        System.out.println(cell);
        
   //To Write a File------------fileOutputStream()-m
        
        FileOutputStream fout = new FileOutputStream(f);
        book.write(fout);
         
        System.out.println("Done");
	}
    
  //To get Date and Time
     public static void getDateTime() {
  	Date d = new Date();
  	System.out.println(d);

  }
  
}
