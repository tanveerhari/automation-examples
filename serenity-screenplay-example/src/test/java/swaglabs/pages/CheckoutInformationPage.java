package swaglabs.pages;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutInformationPage {

	public static final Target FIRST_NAME_FIELD = Target.the("firstNameField").locatedBy("#first-name");
	
	public static final Target LAST_NAME_FIELD = Target.the("lastNameField").locatedBy("#last-name");
	
	public static final Target ZIPCODE_FIELD = Target.the("zipCodeField").locatedBy("#postal-code");
	
	public static final Target CONTINUE_BUTTON = Target.the("continueButton").locatedBy("//input[@value='CONTINUE']");

}
