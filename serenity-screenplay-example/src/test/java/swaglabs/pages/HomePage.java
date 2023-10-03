package swaglabs.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
	
	public static final Target SHOPPING_CART_LINK = Target.the("shoppingCartIcon").locatedBy("#shopping_cart_container");
	
	public static final Target MENU_BUTTON = Target.the("menuButton").located(By.className("bm-burger-button"));
	
	public static final Target LOGOUT_BUTTON = Target.the("logoutButton").locatedBy("#logout_sidebar_link");

	public static final Target SORT_DROPDOWN = Target.the("sortDropdown").locatedBy(".product_sort_container");
	
	
	public static final Map<String, String> SORT_VALUES_MAP = new HashMap<String, String>() {{
	    put("name-ascending", "az");
	    put("name-desccending", "za");
	    put("price-ascending", "lohi");
	    put("price-desccending", "hilo");
	}};
}
