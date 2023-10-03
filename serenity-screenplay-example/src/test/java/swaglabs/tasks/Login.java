package swaglabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import swaglabs.pages.LoginPage;

public class Login implements Task{

	private final String username;
	private final String password;
	
	private Login(final String username, final String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(username).into(LoginPage.USERNAME_FIELD),
				Enter.theValue(password).into(LoginPage.PASSWORD_FIELD),
				Click.on(LoginPage.LOGIN_BUTTON));
	}

	public static Login usingCredentials(final String credentials) {
		String[] credentialsArray = credentials.split(":");
		
		return new Login(credentialsArray[0], credentialsArray[1]);
	}

}
