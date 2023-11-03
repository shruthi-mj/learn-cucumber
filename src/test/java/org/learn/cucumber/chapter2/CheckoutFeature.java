package org.learn.cucumber.chapter2;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutFeature {

	private Map<String, Integer> itemToPrice = new HashMap<>();
	private int totalBill;
	
	@Given("the price of a {string} is {int}c")
	public void given(String itemName, int price) throws Throwable {
		itemToPrice.put(itemName, price);
	}

	@When("I checkout {int} {string}")
	public void when(int quantity, String item) throws Throwable {
		totalBill = quantity * itemToPrice.get(item);
	}

	@Then("the total price should be {int}c")
	public void then(int totalBill) throws Throwable {
		Assert.assertEquals(totalBill, this.totalBill);
	}

}
