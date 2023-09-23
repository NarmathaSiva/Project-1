package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Greens extends BaseClass{
	
	public Greens() {
		PageFactory.initElements(driver, this);  
	}
	
	@FindBy(linkText="CONTACT US")
	private WebElement contact;
	
	@FindBy(xpath="//h3[text()='Our Main Branches In Chennai ']")
	private WebElement branches;
	
	@FindBy(xpath="//p[contains(text(),'All rights reserved')]")
	private WebElement lastLine;

	public WebElement getContact() {
		return contact;
	}

	public WebElement getBranches() {
		return branches;
	}

	public WebElement getLastLine() {
		return lastLine;
	}

}
