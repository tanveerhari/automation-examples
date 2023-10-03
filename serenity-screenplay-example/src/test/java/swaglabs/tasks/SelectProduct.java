package swaglabs.tasks;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectProduct implements Task{

	private final String name;
	
	private SelectProduct(final String name) {
		this.name = name;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(By.xpath("//div[text()='" + name + "']")));
	}

	public static SelectProduct withName(final String name) {
		return new SelectProduct(name);
	}

}
