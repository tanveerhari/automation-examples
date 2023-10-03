package swaglabs.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import swaglabs.pages.CheckoutInformationPage;

public class SubmitCheckoutInformation implements Task{

	private final String firstName;
	private final String lastName; 
	private final String zipCode;

	private SubmitCheckoutInformation(final String firstName, final String lastName, final String zipCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.zipCode = zipCode;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(firstName).into(CheckoutInformationPage.FIRST_NAME_FIELD), 
				Enter.theValue(lastName).into(CheckoutInformationPage.LAST_NAME_FIELD),
				Enter.theValue(zipCode).into(CheckoutInformationPage.ZIPCODE_FIELD),
				Click.on(CheckoutInformationPage.CONTINUE_BUTTON));
	}
	
	public static SubmitCheckoutInformation usingDefaultValues() {
		return new SubmitCheckoutInformation("testFName", "testLName", "12345");
	}

}
