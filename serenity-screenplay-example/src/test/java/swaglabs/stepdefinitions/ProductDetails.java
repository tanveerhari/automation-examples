package swaglabs.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import swaglabs.pages.ProductPage;
import swaglabs.tasks.SelectProduct;

public class ProductDetails {

	@When("{actor} select product from products list with name {}")
	public void selectProductFromListWithName(Actor actor, String name) {
		actor.attemptsTo(SelectProduct.withName(name));
	}
	
	@Then("{actor} see product page for product with name {}")
	public void verifyProductPageWithName(Actor actor, String name) {
		actor.attemptsTo(Ensure.that(ProductPage.PRODUCT_NAME_LABEL).hasText(name),
				Ensure.that(ProductPage.BACK_BUTTON).isDisplayed());
	}
}
