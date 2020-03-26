package com.stepdefinition;

import java.io.IOException;

import com.pages.AddNewAddress;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAddress {

	AddNewAddress add = new AddNewAddress();

	@Given("^launch the chrome browser$")
	public void launch_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		add.url();
	}

	@When("^the user logged in to the home page and signin$")
	public void the_user_logged_in_to_the_home_page_and_signin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		add.LoginDeatils();
	}

	@Then("^click on my address button and navigate to next page$")
	public void click_on_my_address_button_and_navigate_to_next_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		add.myAddress();
	}

	@Then("^click on add new address and fill the mandatory details and save$")
	public void click_on_add_new_address_and_fill_the_mandatory_details_and_save() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		add.addAddress();
	}
	 
}