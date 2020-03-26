package com.stepdefinition;

import com.pages.LinksInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LinksSteps {
	LinksInPage link = new LinksInPage();

	@Given("^open the site in chrome application$")
	public void launch_the_chrome_application() {
		// Write code here that turns the phrase above into concrete actions
		link.url();
	}

	@When("^after opening the site login into the page with valid credentials and navigate to home page$")
	public void the_user_logged_in_to_the_home_page_and_signin_the_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		link.LoginDeatils();
	}

	@Then("^find the number links in a given page$")
	public void the_user_and_navigate_to_next_page_count_images() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		link.linksInThePageCount();
	}

}