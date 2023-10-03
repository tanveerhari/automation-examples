package swaglabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ui.Select;
import swaglabs.pages.HomePage;

public class SortProducts implements Task{

	private final String sortOrder;
	
	
	private SortProducts(final String sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Select.value(HomePage.SORT_VALUES_MAP.get(sortOrder)).from(HomePage.SORT_DROPDOWN));
	}

	public static SortProducts by(final String sortOrder) {
		return new SortProducts(sortOrder);
	}

}
