package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotel extends BaseClass  {

//Non-Parametrized Constructor-----	
	public AdactinHotel() {
		PageFactory.initElements(driver, this);
	}
//http://adactinhotelapp.com/
//1st PAGE------------------------
	
//@FindBys---AND Operator
	
	@FindBy(xpath="//input[@id='username']")
    private WebElement userName;

//@FindAll----OR Operator
@FindAll({
	@FindBy(xpath="//input[@id='password']"),
	@FindBy(id="passwords")
})
    private WebElement pw;

//@FindBy----		
	@FindBy(xpath="//input[@id='login']")
	private WebElement login;
	
//2nd PAGE-------------------------	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	@FindBy(name="room_nos")
	private WebElement rooms;
	
	@FindBy(name="datepick_in")
	private WebElement inDate;
	
	@FindBy(name="datepick_out")
	private WebElement outDate;
	
	@FindBy(name="adult_room")
	private WebElement adultRoom;
	
	@FindBy(name="Submit")
	private WebElement search;
	
//3rd PAGE---------------------------
	@FindBy(xpath="(//input[@value='1'])[1]")
	private WebElement radioBut;
	
	@FindBy(name="continue")
	private WebElement conti;
	
//4th PAGE-----------------------------
	@FindBy(name="first_name")
	private WebElement firstName;

	@FindBy(name="last_name")
	private WebElement lastName;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement cardNo;
	
	@FindBy(name="cc_type")
	private WebElement cardType;
	
	@FindBy(name="cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(name="cc_cvv")
	private WebElement cVV;
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement bookNow;
	
	@FindBy(name="order_no")
	private WebElement orderNo;

//GETTERS----------------------------------------------	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPw() {
		return pw;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getInDate() {
		return inDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getRadioBut() {
		return radioBut;
	}

	public WebElement getConti() {
		return conti;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getcVV() {
		return cVV;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}
	
	
}
