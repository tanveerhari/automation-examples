package swaglabs.stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import swaglabs.pages.ProductPage;
import swaglabs.tasks.AddToCartFromList;

public class AddToCartSteps {

	
	@When("{actor} add product to cart")
	public void addProductToCart(Actor actor) {
		actor.attemptsTo(Click.on(ProductPage.ADD_TO_CART_BUTTON));
	}
	
	@When("{actor} add product from products list to cart with name {}")
	public void addProductFromListToCartWithName(Actor actor, String name) {
		actor.attemptsTo(AddToCartFromList.productWithName(name));
	}
}
