package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBus extends BaseClass{
	
	public RedBus() {
       PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Account']")
	private WebElement acc;
	
	@FindBy(xpath="//span[text()='Login/ Sign Up']")
	private WebElement login;
	
	@FindBy(xpath="(//input[@class='IP'])[1]")
    private WebElement mblNo;
	
	@FindBy(xpath="(//div[@class='rc-anchor-center-item rc-anchor-checkbox-holder'])[1]")
	private WebElement captcha;
	
	@FindBy(xpath="//span[text()='GENERATE OTP ']")
	private WebElement otp;

	public WebElement getAcc() {
		return acc;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getMblNo() {
		return mblNo;
	}

	public WebElement getCaptcha() {
		return captcha;
	}

	public WebElement getOtp() {
		return otp;
	}
	
	
}
