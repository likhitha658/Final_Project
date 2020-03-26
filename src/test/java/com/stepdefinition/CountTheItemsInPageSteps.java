package com.stepdefinition;

import java.io.IOException;

import com.pages.CountItemsInThePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CountTheItemsInPageSteps {

	CountItemsInThePage count = new CountItemsInThePage();

	@Given("^chrome browser launched in the browser$")
	public void launch_the_chrome_application() {
		// Write code here that turns the phrase above into concrete actions
		count.url();
	}

	@When("^login into the site$")
	public void the_user_logged_in_to_the_home_page() throws IOException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		count.LoginDeatils();
	}

	@Then("^Click on the women button and navigate to the next page$")
	public void the_click_on_the_dress_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		count.womensBtn();
	}

	@Then("^click on the dress and navigate to next page and count the items in that page$")
	public void the_user_click_the_count_pages() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		count.dressClick();
	}

}