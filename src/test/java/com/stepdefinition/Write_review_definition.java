package com.stepdefinition;

import java.io.IOException;

import com.pages.Write_Review_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Write_review_definition {

	Write_Review_Page writeReview = new Write_Review_Page();

	@Given("^open the site in chrome browser$")
	public void launch_the_chrome_application() {
		// Write code here that turns the phrase above into concrete actions
		writeReview.url();
	}

	@When("^after opening the site login into the page$")
	public void the_user_logged_in_to_the_home_page() throws IOException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		writeReview.LoginDeatils();
	}

	@Then("^back to home page and click on the women button$")
	public void the_user_click_the_profile_and_get_the_profile_email() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		writeReview.backToHomePageAndClickOnWomens();
	}

	@Then("^click on the more button and navigate to next page$")
	public void the_user_click_profile_email() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		writeReview.clickOnMoreBtn();
	}

	@Then("^click on the review box and write a review and click on send button$")
	public void the_user_click_the_profile_and_() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		writeReview.write_Review();
	}
}