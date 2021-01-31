package com.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class PersonalDetailsFinal extends BaseClass {
	public PersonalDetailsFinal() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastname;

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement cardtyNo;

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardtype;

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expiremonth;

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement expireyear;

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;

	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement booknow;

	@FindBy(xpath = "//input[@name='order_no']")
	private WebElement ordernum;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardtyNo() {
		return cardtyNo;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpiremonth() {
		return expiremonth;
	}

	public WebElement getExpireyear() {
		return expireyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getOrdernum() {
		return ordernum;
	}

}
