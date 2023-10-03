#Author: tanveerhari

@swaglabs @sort-products
Feature: Sort Products
  I can sort products by different orders

  @swag-6
  Scenario Outline: User can sort products by various orders
    Given I am on Swag Labs login page
    When I login using <credentials>
    Then I see Swag Labs home page
    When I sort products by <sortOrder>
    Then I see that products are listed in <sortOrder>

    Examples: 
      | credentials                   | sortOrder          |
      | standard_user:secret_sauce 		| name-ascending     |
      | standard_user:secret_sauce 		| name-desccending   |
      | standard_user:secret_sauce 		| price-ascending    |
      | standard_user:secret_sauce 		| price-desccending  |
