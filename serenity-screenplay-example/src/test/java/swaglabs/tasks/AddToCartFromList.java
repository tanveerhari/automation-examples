package swaglabs.tasks;

import java.util.Collection;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class AddToCartFromList implements Task{

	private final String name;
	
	public AddToCartFromList(final String name) {
		this.name = name;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		Collection<String> itemNames = actor.asksFor(Text.ofEach(".inventory_item_name"));
		int index = 1;
		
		for (String itemName : itemNames) {
			if(itemName.equals(name)) {
				actor.attemptsTo(Click.on(By.xpath("//button[text()='ADD TO CART'][" + index + "]")));
				break;
			}
			index++;
		}
	}

	public static AddToCartFromList productWithName(final String name) {
		return new AddToCartFromList(name);
	}

}
