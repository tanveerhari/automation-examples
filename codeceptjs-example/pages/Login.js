const { I } = inject();

class loginPage {
  constructor() {
    //insert your locators
    // this.button = '#button'
    this.userField = '#user-name';
    this.passwordField = '#password';
    this.loginButton = '#login-button';
    this.errorLabel = '//h3[@data-test=\'error\']';
    this.errorMessages = new Map([
      ["required_username", "Epic sadface: Username is required"],
      ["required_password", "Epic sadface: Password is required"],
      ["invalid_credentials", "Epic sadface: Username and password do not match any user in this service"]
    ]);
  }
  // insert your methods here

  clickLoginButton(){
    I.click(this.loginButton);
  }

  enterUsername(username){
    I.fillField(this.userField, username);
  }

  enterPassword(password){
    I.fillField(this.passwordField, password);
  }

  loginUsing(username, password){
    I.fillField(this.userField, username);
	  I.fillField(this.passwordField, password);
	  I.click(this.loginButton);
  }

  seeErrorFor(errorType){
    I.see(this.errorMessages.get(errorType), this.errorLabel);
  }
}

// For inheritance
module.exports = new loginPage();
//export = loginPage;
