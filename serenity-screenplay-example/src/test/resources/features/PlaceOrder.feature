#Author: tanveerhari

@swaglabs @place-order
Feature: Place Order
  I can place order for desired products

  @swag-10
  Scenario Outline: User can place order for a product
    Given I am on Swag Labs login page
    When I login using <credentials>
    Then I see Swag Labs home page
    When I add product from products list to cart with name <name>
    When I open cart page
    Then I see in cart product with name <name>
    When I place order from cart
    Then I see that order is placed successfully

    Examples: 
      | credentials                   | name                |
      | standard_user:secret_sauce 		| Sauce Labs Backpack |