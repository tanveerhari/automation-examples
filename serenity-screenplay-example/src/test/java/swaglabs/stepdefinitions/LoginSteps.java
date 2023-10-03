package swaglabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import swaglabs.pages.HomePage;
import swaglabs.pages.LoginPage;
import swaglabs.tasks.Login;
import swaglabs.tasks.Logout;

public class LoginSteps {

	@Given("{actor} am on Swag Labs login page")
	public void navigateToSwagLabsLoginPage(Actor actor) {
		actor.wasAbleTo(Open.url(LoginPage.URL));
	}
	
    @When("{actor} login using {}")
    public void loginUsingCredentials(Actor actor, String credentials) {
		actor.attemptsTo(Login.usingCredentials(credentials));
	}
	
    @Then("{actor} see Swag Labs home page")
    public void seeThatPageIsSwagLabsHomePage(Actor actor) {
		actor.attemptsTo(Ensure.that(HomePage.SHOPPING_CART_LINK).isDisplayed());
	}
    
    @When("{actor} enter username {}")
    public void enterUsername(Actor actor, String username) {
		actor.attemptsTo(Enter.theValue(username).into(LoginPage.USERNAME_FIELD));
	}
    
    @When("{actor} click login button")
    public void clickLoginButton(Actor actor) {
		actor.attemptsTo(Click.on(LoginPage.LOGIN_BUTTON));
	}
    
    @Then("{actor} see login error message for {}")
    public void seeThatPageIsSwagLabsHomePage(Actor actor, String errorType) {
		actor.attemptsTo(Ensure.that(LoginPage.ERROR_LABEL).isDisplayed(),
				Ensure.that(LoginPage.ERROR_LABEL).hasTextContent(LoginPage.ERROR_MESSAGES.get(errorType)));
	}
    
    @When("{actor} logout from application")
    public void logoutFromApplication(Actor actor) {
		actor.attemptsTo(Logout.fromApplication());
	}
    
    @Then("{actor} see login page")
    public void seeLoginPage(Actor actor) {
		actor.attemptsTo(Ensure.that(LoginPage.LOGIN_BUTTON).isDisplayed());
	}
    
}
