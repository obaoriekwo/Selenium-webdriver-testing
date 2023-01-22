Feature: Home page and login

  Scenario: user should see logo on home page and be able to login

    Given I launch a browser
    And I enter application url
    And I see the application logo
    And I click on the sign in button
    And I enter valid username
    And I enter valid password
    When I click the login button
    Then I should be logged in successfully