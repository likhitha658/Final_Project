package com.stepdefinition;

import java.io.IOException;

import com.pages.Search;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search_Definition {

	Search search = new Search();
	@Given("^user launch the chrome application$")
	public void user_launch_the_chrome_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		search.url();
	}

	@When("^the user loggedin to the home page$")
	public void the_user_loggedin_to_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		search.LoginPage();
	}

	@Then("^the user search the product$")
	public void the_user_search_the_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		search.LoginDeatils(); 
	}

	@Then("^click on down arrow and enter key the user get the searching products$")
	public void click_on_down_arrow_and_enter_key_the_user_get_the_searching_products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		search.search();
	}
}