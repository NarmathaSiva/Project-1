package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBPojo extends BaseClass {

//https://www.facebook.com/
	public FBPojo() {
		PageFactory.initElements(driver, this);
}
//LOGIN -----------------------------
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	
	@FindBy(id="pass")
	private WebElement pw;
	
	@FindBy(name="login")
	private WebElement login;

//FORGET PASSWORD------------------	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forget;
	
	@FindBy(name="email")
	private WebElement eMail;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement search;
	
//CREAT NEW ACCOUNT-----------------------------
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement creatAcc;
	
	@FindBy(name="firstname")
	private WebElement firstName;
	
	@FindBy(name="lastname")
	private WebElement surName;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement mblNo;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement reMblNo;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement newPW;
	
	@FindBy(id="day")
	private WebElement date;
	
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement gender;
	
	@FindBy(xpath="(//button[text()='Sign Up'])[1]")
	private WebElement signUp;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPw() {
		return pw;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getForget() {
		return forget;
	}

	public WebElement geteMail() {
		return eMail;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getCreatAcc() {
		return creatAcc;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSurName() {
		return surName;
	}

	public WebElement getMblNo() {
		return mblNo;
	}

	public WebElement getReMblNo() {
		return reMblNo;
	}

	public WebElement getNewPW() {
		return newPW;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getSignUp() {
		return signUp;
	}

	
	
	
}
