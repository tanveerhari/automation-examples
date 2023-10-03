package swaglabs.pages;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {

	public static final Target PRODUCT_NAME_LABEL = Target.the("productNameLabel").locatedBy(".inventory_details_name");
	
	public static final Target BACK_BUTTON = Target.the("backButton").locatedBy(".inventory_details_back_button");
	
	public static final Target ADD_TO_CART_BUTTON = Target.the("addToCartButton").locatedBy("//button[text()='ADD TO CART']");
}
