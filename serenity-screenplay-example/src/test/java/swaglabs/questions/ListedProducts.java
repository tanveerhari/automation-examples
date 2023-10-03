package swaglabs.questions;


import java.util.Collection;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import swaglabs.pages.HomePage;

public class ListedProducts implements Question<Boolean>{

	private final String sortOrder;
	
	private ListedProducts(final String sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		//TODO: Implmentation pending
		if(sortOrder.equals("az") || sortOrder.equals("az")) {
			Collection<String> itemNames = actor.asksFor(Text.ofEach(".inventory_item_name"));
			
		}else {
			Collection<String> itemPrice = actor.asksFor(Text.ofEach(".inventory_item_price"));
		}
		
		return true;
	}

	public static ListedProducts areIn(final String sortOrder) {
		return new ListedProducts(HomePage.SORT_VALUES_MAP.get(sortOrder));
	}

}
