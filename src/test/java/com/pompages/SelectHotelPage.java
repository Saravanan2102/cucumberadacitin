package com.pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radiobtn;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continuebtn;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
}
