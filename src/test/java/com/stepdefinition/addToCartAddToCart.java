package com.stepdefinition;

import java.io.IOException;

import com.pages.AddToCart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addToCartAddToCart {

	AddToCart addtocart = new AddToCart();

	@Given("^launch the chrome browser and get started$")
	public void launch_the_chrome_application() {
		// Write code here that turns the phrase above into concrete actions
		addtocart.url();
	}

	@When("^the user logged in to the home page and signin the page$")
	public void the_user_logged_in_to_the_home_page_and_signin_the_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		addtocart.LoginDeatils();
	}

	@Then("^click on selected dress item and add to the cart$")
	public void the_user_click_the_profile_and_get_the_profile_email() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		addtocart.addToCart();
	}

}