package com.stepdefnpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.baseclass.BaseClass;
import com.pompages.LoginPage;
import com.pompages.SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefnPomAdacit extends BaseClass {
	WebDriver driver;

	@Given("user enter to login page {string} and {string}")
	public void user_enter_to_login_page_and(String string, String string2) {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		LoginPage l=new LoginPage();
		WebElement txtUserName = l.getTxtUserName();
		txtUserName.sendKeys(string);
		WebElement txtPassword = l.getTxtPassword();
		txtPassword.sendKeys(string2);
		WebElement btnLogin = l.getBtnLogin();
		btnClick(btnLogin);
	}

	@When("user enter the room details {string} and {string} and {string} and {string} and {string}")
	public void user_enter_the_room_details_and_and_and_and(String string, String string2, String string3,
			String string4, String string5) {
		SearchPage s=new SearchPage();
		WebElement location = s.getLocation();
		selectDatabyIndex(location, 2);
		WebElement hotel = s.getHotel();
		selectDatabyIndex(hotel, 2);
		WebElement roomtype = s.getRoomtype();
		selectDatabyIndex(roomtype, 3);
		WebElement checkin = s.getCheckin();
		type(checkin,"25/03/2023");

	}

	@When("user enter the room type")
	public void user_enter_the_room_type() {

	}

	@When("enter the personal details")
	public void enter_the_personal_details() {

	}

	@When("submit the button")
	public void submit_the_button() {

	}

	@Then("verifying the success msg")
	public void verifying_the_success_msg() {

	}

}
