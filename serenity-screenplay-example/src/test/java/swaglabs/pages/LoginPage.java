package swaglabs.pages;

import java.util.HashMap;
import java.util.Map;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

	public static final String URL = "https://www.saucedemo.com/v1/";
	
	public static final Target USERNAME_FIELD = Target.the("usernameField").locatedBy("#user-name");
	
	public static final Target PASSWORD_FIELD = Target.the("passwordField").locatedBy("#password");
	
	public static final Target LOGIN_BUTTON = Target.the("loginButton").locatedBy("#login-button");

	public static final Target ERROR_LABEL = Target.the("errorLabel").locatedBy("//h3[@data-test='error']");

	public static final Map<String, String> ERROR_MESSAGES = new HashMap<String, String>() {{
	    put("required_username", "Epic sadface: Username is required");
	    put("required_password", "Epic sadface: Password is required");
	    put("invalid_credentials", "Epic sadface: Username and password do not match any user in this service");
	}};
}
