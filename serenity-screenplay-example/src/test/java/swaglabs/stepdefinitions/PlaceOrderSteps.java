package swaglabs.stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import swaglabs.tasks.PlaceOrder;

public class PlaceOrderSteps {

	@When("{actor} place order from cart")
	public void placeOrderFromCart(Actor actor) {
		actor.attemptsTo(PlaceOrder.fromCart());
	}
	
	@Then("{actor} see that order is placed successfully")
	public void verifyOrderIsPlaced(Actor actor) {
		actor.attemptsTo(Ensure.that(By.id("checkout_complete_container")).isDisplayed());
	}
}
