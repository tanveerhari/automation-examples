package swaglabs.stepdefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import swaglabs.pages.HomePage;

public class CartSteps {

	@When("{actor} open cart page")
	public void openCartPage(Actor actor) {
		actor.attemptsTo(Click.on(HomePage.SHOPPING_CART_LINK));
	}

	@Then("{actor} see in cart product with name {}")
	public void verifyCartHasProductWithName(Actor actor, String name) {
		final String currentUrl = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
		final String cartItemXpathExpression = "//div[text()='" + name + "']";

		actor.attemptsTo(Ensure.that(currentUrl).endsWith("cart.html"),
				Ensure.that(By.xpath(cartItemXpathExpression)).isDisplayed());
	}
}
