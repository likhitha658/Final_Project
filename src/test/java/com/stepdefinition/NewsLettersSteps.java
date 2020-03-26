package com.stepdefinition;

import com.pages.NewsLetters;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewsLettersSteps {

	NewsLetters newsletter = new NewsLetters();

	@Given("^open the site in chrome and lanch the website$")
	public void launch_the_chrome_application() {
		// Write code here that turns the phrase above into concrete actions
		newsletter.url();
	}

	@When("^login to the page$")
	public void the_user_logged_in_to_the_home_page_and_signin_the_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		newsletter.LoginDeatils();
	}

	@Then("^send keys to the newsletters$")
	public void the_user_and_navigate_to_next_page_count_images() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		newsletter.NewsLetter();
	}

}