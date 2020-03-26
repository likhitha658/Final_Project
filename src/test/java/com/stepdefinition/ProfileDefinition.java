package com.stepdefinition;

import java.io.IOException;

import com.pages.ProfileDetails;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProfileDefinition {

	ProfileDetails profile = new ProfileDetails();

	@Given("^launch the chrome application$")
	public void launch_the_chrome_application() {
		// Write code here that turns the phrase above into concrete actions
		profile.url();
	}

	@When("^the user logged in to the home page$")
	public void the_user_logged_in_to_the_home_page() throws IOException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		profile.LoginDeatils();
	}

	@Then("^the user has to get profile name displayed on the username place$")
	public void the_user_has_to_get_profile_name_displayed_on_the_username_place() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		profile.search();
	}


}