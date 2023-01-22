Feature: Home page and Login


  Background:
    Given I am on the home page screen
    And I Select sign in

  Scenario: User should see logo on home page and be able to login

    #Given I launch a browser
    #And I enter application url
    When I see the application logo
    And I enter valid username
    And I enter valid password
    When I click the login button
    Then I should be logged in successfully

