Feature: Login

  Scenario Outline: Invalid login credentials should return the appropriate error message

    Given I am on the landing page
    And I select the sign in button
    When I enter "<email>"
    And I type "<password>"
    When I select the login button
    Then I should get the right "<errormessage>"

    Examples:

    |email                          |password     |errormessage                         |
    |lanre.ikuesa@gmail.com         |testing      |Authentication failed.               |
    |lanre.ikuesan@gmail.com        |test         |Invalid password.                    |
    |                               |testing      |An email address required.           |
    |lanre.ikuesan@gmail.com        |             |Password is required.                |
    |                               |             | An email address required.          |

