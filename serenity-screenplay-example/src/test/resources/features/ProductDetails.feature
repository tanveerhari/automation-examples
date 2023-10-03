#Author: tanveerhari

@swaglabs @product-details
Feature: Product Details
  I can view product details

  @swag-7
  Scenario Outline: User can view product details for a selected product
    Given I am on Swag Labs login page
    When I login using <credentials>
    Then I see Swag Labs home page
    When I select product from products list with name <name>
    Then I see product page for product with name <name> 

    Examples: 
      | credentials                   | name                |
      | standard_user:secret_sauce 		| Sauce Labs Backpack |

