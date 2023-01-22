Feature: create Account

  Scenario: User should be able to create an account

    Given I am on the home page
    When I click on the sign in link
    And I enter email address for new account
    And I click the create account button
    And I enter all required details
    When I click on the register button
    Then My new account should be created successfully