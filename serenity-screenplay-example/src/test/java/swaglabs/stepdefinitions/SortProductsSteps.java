package swaglabs.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import swaglabs.questions.ListedProducts;
import swaglabs.tasks.SortProducts;

public class SortProductsSteps {

	@When("{actor} sort products by {}")
	public void sortProducts(Actor actor, String sortOrder) {
		actor.attemptsTo(SortProducts.by(sortOrder));
	}

	@Then("{actor} see that products are listed in {}")
	public void verifyProductsOrder(Actor actor, String sortOrder) {
		actor.attemptsTo(Ensure.that(ListedProducts.areIn(sortOrder)).isTrue());
	}

}
