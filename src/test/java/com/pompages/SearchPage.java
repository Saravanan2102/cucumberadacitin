package com.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SearchPage extends BaseClass{
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement roomnumbers;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkin;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement checkout;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultroom;
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childroom;
	
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement submit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnumbers() {
		return roomnumbers;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
