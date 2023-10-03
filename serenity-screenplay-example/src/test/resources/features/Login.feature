#Author: tanveerhari

@swaglabs @login
Feature: Login
  I can login using valid credentials

  @swag-1
  Scenario Outline: User can successfully login using valid credentials
    Given I am on Swag Labs login page
    When I login using <credentials>
    Then I see Swag Labs home page

    Examples: 
      | credentials                   |
      | standard_user:secret_sauce 		|

      
  @swag-2
  Scenario Outline: User needs to enter username to login
    Given I am on Swag Labs login page
    When I click login button
    Then I see login error message for <errorType>

    Examples: 
      | errorType             |
      | required_username 		|
      
      
  @swag-3
  Scenario Outline: User needs to enter password to login
    Given I am on Swag Labs login page
    When I enter username <username>
    When I click login button
    Then I see login error message for <errorType>

    Examples: 
      | username          | errorType             |
      | standard_user 		| required_password 		|
      
  @swag-4
  Scenario Outline: User cannot login using invalid credentials
    Given I am on Swag Labs login page
    When I login using <credentials>
    Then I see login error message for <errorType>

    Examples: 
      | credentials                   | errorType             |
      | fake_user:secret_sauce 		    | invalid_credentials   |
      
  @swag-5
  Scenario Outline: User can successfully logout from application
    Given I am on Swag Labs login page
    When I login using <credentials>
    Then I see Swag Labs home page
    When I logout from application
    Then I see login page

    Examples: 
      | credentials                   |
      | standard_user:secret_sauce 		|