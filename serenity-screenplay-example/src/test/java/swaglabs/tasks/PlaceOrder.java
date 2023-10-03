package swaglabs.tasks;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import swaglabs.pages.CartPage;

public class PlaceOrder implements Task{

	private PlaceOrder() {
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CartPage.CHECKOUT_BUTTON),
				SubmitCheckoutInformation.usingDefaultValues(),
				Click.on(By.xpath("//a[text()='FINISH']")));
	}

	public static PlaceOrder fromCart() {
		return new PlaceOrder();
	}

}
