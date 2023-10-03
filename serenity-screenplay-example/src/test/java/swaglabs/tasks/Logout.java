package swaglabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import swaglabs.pages.HomePage;

public class Logout implements Task{

	private Logout() {
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.MENU_BUTTON),
				Click.on(HomePage.LOGOUT_BUTTON));
		
	}

	public static Logout fromApplication() {
		return new Logout();
	}

}
