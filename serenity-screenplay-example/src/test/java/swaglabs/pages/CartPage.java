package swaglabs.pages;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

	public static final Target CHECKOUT_BUTTON = Target.the("checkoutButton").locatedBy("//a[text()='CHECKOUT']");
}
