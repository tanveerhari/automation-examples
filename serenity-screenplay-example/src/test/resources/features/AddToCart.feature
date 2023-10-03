#Author: tanveerhari

@swaglabs @add-to-cart
Feature: Add to Cart
  I can add products to cart

  @swag-8
  Scenario Outline: User can add product to cart from product page
    Given I am on Swag Labs login page
    When I login using <credentials>
    Then I see Swag Labs home page
    When I select product from products list with name <name>
    Then I see product page for product with name <name> 
    When I add product to cart
    When I open cart page
    Then I see in cart product with name <name> 

    Examples: 
      | credentials                   | name                |
      | standard_user:secret_sauce 		| Sauce Labs Backpack |

      
  @swag-9
  Scenario Outline: User can add product to cart from products list
    Given I am on Swag Labs login page
    When I login using <credentials>
    Then I see Swag Labs home page
    When I add product from products list to cart with name <name>
    When I open cart page
    Then I see in cart product with name <name> 

    Examples: 
      | credentials                   | name                |
      | standard_user:secret_sauce 		| Sauce Labs Backpack |