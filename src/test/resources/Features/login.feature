@Login

Feature: Test cases for login functionality

  Background:
    Given I navigate to homePage

  Scenario: SignIn with invalid credentials
    And I fill in my login details as "username" and "password"
    When I hit signIn button
    Then verify user is not signed in

  Scenario: SignOn as a new user
    And I click on register link
    And I fill in all the details for registration
    When I hit submit button