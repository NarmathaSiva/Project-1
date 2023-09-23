package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart extends BaseClass{
	
	public Flipkart() {
        PageFactory.initElements(driver, this);	
    }
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement eMail;
	
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement otp;

	public WebElement geteMail() {
		return eMail;
	}

	public WebElement getOtp() {
		return otp;
	}
	

}
