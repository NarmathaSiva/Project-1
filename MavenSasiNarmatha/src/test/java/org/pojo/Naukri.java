package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Naukri extends BaseClass{
	
	public Naukri() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement eMail;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pw;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mblNo;
	
	@FindBy(xpath="//div[@data-val='fresher']")
	private WebElement status;
	
	@FindBy(xpath="//div[@class='resume-upload']")
	private WebElement resume;
	
	@FindBy(xpath="//button[text()='Register now']")
	private WebElement submit;

	public WebElement getName() {
		return name;
	}

	public WebElement geteMail() {
		return eMail;
	}

	public WebElement getPw() {
		return pw;
	}

	public WebElement getMblNo() {
		return mblNo;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getResume() {
		return resume;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}
