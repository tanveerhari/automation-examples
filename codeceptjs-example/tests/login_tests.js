Feature('login');

Scenario('User can successfully login using valid credentials',  ({ I, loginPage }) => {
	I.amOnPage('https://www.saucedemo.com/v1/');
	loginPage.loginUsing('standard_user', 'secret_sauce');
	I.seeElement('#shopping_cart_container');
});

Scenario('User cannot login using invalid credentials',  ({ I, loginPage }) => {
	I.amOnPage('https://www.saucedemo.com/v1/');
	loginPage.loginUsing('fake_user', 'secret_sauce');
	loginPage.seeErrorFor('invalid_credentials');
});

Scenario('User needs to enter username to login',  ({ I, loginPage }) => {
	I.amOnPage('https://www.saucedemo.com/v1/');
	loginPage.clickLoginButton();
	loginPage.seeErrorFor('required_username');
});

Scenario('User needs to enter password to login',  ({ I, loginPage }) => {
	I.amOnPage('https://www.saucedemo.com/v1/');
	loginPage.enterUsername('standard_user');
	loginPage.clickLoginButton();
	loginPage.seeErrorFor('required_password');
});